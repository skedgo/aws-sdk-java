/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BoundedCacheTest {

    private static final int MAX_SIMPLE_TEST_ENTRIES = 10;
    private static final int MAX_SIMPLE_CACHE_SIZE = 3;
    private static final int SIMPLE_EVICTION_BATCH_SIZE = 1;
    private static final List<Integer> simpleTestKeys;
    private static final List<String> simpleTestValues;

    static {
        simpleTestKeys = new ArrayList<>();
        for (int i = 0; i < MAX_SIMPLE_TEST_ENTRIES; i++) {
            simpleTestKeys.add(i);
        }

        simpleTestValues = new ArrayList<String>();
        for (int i = 0; i < MAX_SIMPLE_TEST_ENTRIES; i++) {
            simpleTestValues.add(Integer.toString(i));
        }
    }

    @Spy
    private Function<Integer, String> simpleValueMappingFunction = new SimpleValueMappingFunction(simpleTestValues);
    private final Function<Integer, String> identityMappingFunction = new Function<Integer, String>() {
        @Override
        public String apply(Integer key) {
            return Integer.toString(key);
        }
    };

    private final Supplier<BoundedCache<Integer, String>> simpleCache = new Supplier<BoundedCache<Integer, String>>() {
        @Override
        public BoundedCache<Integer, String> get() {
            return BoundedCache.builder()
                    .mappingFunction(simpleValueMappingFunction)
                    .maxSize(MAX_SIMPLE_CACHE_SIZE)
                    .evictionBatchSize(SIMPLE_EVICTION_BATCH_SIZE)
                    .build();
        }
    };

    @Test
    public void when_cacheHasMiss_ValueIsCalculatedAndCached() {
        BoundedCache<Integer, String> cache = simpleCache.get();
        primeAndVerifySimpleCache(cache, 1);
    }

    @Test
    public void when_cacheHasHit_ValueIsRetrievedFromCache() {
        BoundedCache<Integer, String> cache = simpleCache.get();

        primeAndVerifySimpleCache(cache, MAX_SIMPLE_CACHE_SIZE);

        // Get an existing value from cache
        String result = cache.get(simpleTestKeys.get(2));
        assertEquals(MAX_SIMPLE_CACHE_SIZE, cache.size());
        assertNotNull(result);
        assertEquals(simpleTestValues.get(2), result);

        // Verify it was only retrieved once from the mapping function
        verify(simpleValueMappingFunction, times(1)).apply(simpleTestKeys.get(2));
    }

    @Test
    public void when_cacheFillsUp_ValuesAreEvictedFromCache() {
        BoundedCache<Integer, String> cache = simpleCache.get();

        // Fill cache to capacity
        primeAndVerifySimpleCache(cache, MAX_SIMPLE_CACHE_SIZE);
        assertEquals(MAX_SIMPLE_CACHE_SIZE, cache.size());

        // Add more items to trigger eviction
        for (int i = MAX_SIMPLE_CACHE_SIZE; i < MAX_SIMPLE_CACHE_SIZE + 2; i++) {
            String result = cache.get(simpleTestKeys.get(i));
            assertEquals(MAX_SIMPLE_CACHE_SIZE, cache.size());
            assertNotNull(result);
            assertEquals(simpleTestValues.get(i), result);
        }

        // Verify the cache size remains bounded
        assertEquals(MAX_SIMPLE_CACHE_SIZE, cache.size());
    }

    @Test
    public void when_cacheHitsOccur_ValuesAreRetrievedFromCache() {
        BoundedCache<Integer, String> cache = simpleCache.get();

        // Fill cache to capacity
        primeAndVerifySimpleCache(cache, MAX_SIMPLE_CACHE_SIZE);

        // Access existing values
        for (int i = 0; i < MAX_SIMPLE_CACHE_SIZE; i++) {
            String result = cache.get(simpleTestKeys.get(i));
            assertNotNull(result);
            assertEquals(simpleTestValues.get(i), result);
        }

        // Verify each value was only retrieved once from the mapping function
        for (int i = 0; i < MAX_SIMPLE_CACHE_SIZE; i++) {
            verify(simpleValueMappingFunction, times(1)).apply(simpleTestKeys.get(i));
        }
    }

    @Test
    public void when_cacheHasMiss_AndNoValueIsFound_ReturnsNull() {
        BoundedCache<Integer, String> cache = simpleCache.get();
        primeAndVerifySimpleCache(cache, 1);

        Integer keyMissingValue = 200;
        String value = cache.get(keyMissingValue);
        assertNull(value);
        cache.get(keyMissingValue);
        // Null values are not cached
        verify(simpleValueMappingFunction, times(2)).apply(keyMissingValue);
    }

    @Test
    public void when_multipleThreadsAreCallingCache_WorksAsExpected() throws Exception {
        testConcurrency(1000, 5000, false, 5);
        testConcurrency(1000, 5000, false, 50);
        testConcurrency(100, 1000, true, 5);
    }

    private void testConcurrency(final Integer numThreads,
                                 final Integer numGetsPerThread,
                                 final boolean sleep,
                                 final Integer cacheSize) throws Exception {
        ExecutorService executor = Executors.newCachedThreadPool();
        try {
            Function<Integer, String> sleepyMappingFunction = new Function<Integer, String>() {
                @Override
                public String apply(Integer num) {
                    if (sleep) {
                        try {
                            Thread.sleep(ThreadLocalRandom.current().nextInt(0, 5));
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            throw new RuntimeException(e);
                        }
                    }
                    return identityMappingFunction.apply(num);
                }
            };
            final BoundedCache<Integer, String> cache = BoundedCache.builder()
                    .mappingFunction(sleepyMappingFunction)
                    .maxSize(cacheSize)
                    .build();
            List<Future<?>> results = new ArrayList<Future<?>>();
            for (int i = 0; i < numThreads; i++) {
                results.add(executor.submit(new Runnable() {
                    @Override
                    public void run() {
                        for (int j = 0; j < numGetsPerThread; j++) {
                            int key = ThreadLocalRandom.current().nextInt(cacheSize * 2);
                            String value = cache.get(key);
                            assertEquals(Integer.toString(key), value);
                        }
                    }
                }));
            }
            for (Future<?> result : results) {
                result.get(20, TimeUnit.SECONDS);
            }
        } finally {
            executor.shutdownNow();
        }
    }

    private void primeAndVerifySimpleCache(BoundedCache<Integer, String> cache, int numEntries) {
        for (int i = 0; i < numEntries; i++) {
            String result = cache.get(simpleTestKeys.get(i));
            assertEquals(i + 1, cache.size());
            assertNotNull(result);
            assertEquals(simpleTestValues.get(i), result);
            verify(simpleValueMappingFunction).apply(simpleTestKeys.get(i));
        }
    }

    private static class SimpleValueMappingFunction implements Function<Integer, String> {

        List<String> values;

        SimpleValueMappingFunction(List<String> values) {
            this.values = values;
        }

        @Override
        public String apply(Integer key) {
            String value = null;
            try {
                value = values.get(key);
            } catch (Exception ignored) {

            }
            return value;
        }
    }
}
