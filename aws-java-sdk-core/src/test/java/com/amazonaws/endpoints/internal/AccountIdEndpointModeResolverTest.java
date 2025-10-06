 /*
  * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
  *
  * Licensed under the Apache License, Version 2.0 (the "License");
  * you may not use this file except in compliance with the License.
  * You may obtain a copy of the License at:
  *
  *    http://aws.amazon.com/apache2.0
  *
  * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
  * OR CONDITIONS OF ANY KIND, either express or implied. See the
  * License for the specific language governing permissions and
  * limitations under the License.
  */

 package com.amazonaws.endpoints.internal;

 import com.amazonaws.auth.profile.internal.BasicProfileConfigFileLoader;
 import com.amazonaws.endpoints.AccountIdEndpointMode;
 import com.amazonaws.profile.path.AwsProfileFileLocationProvider;
 import org.junit.Before;
 import org.junit.Test;
 import org.junit.runner.RunWith;
 import org.junit.runners.Parameterized;
 import utils.EnvironmentVariableHelper;
 import utils.TestProfileFileLocationProvider;

 import java.util.Arrays;
 import java.util.Collection;

 import static com.amazonaws.SDKGlobalConfiguration.AWS_ACCOUNT_ID_ENDPOINT_MODE_ENV_VAR;
 import static com.amazonaws.SDKGlobalConfiguration.AWS_ACCOUNT_ID_ENDPOINT_MODE_SYSTEM_PROPERTY;
 import static org.hamcrest.MatcherAssert.assertThat;
 import static org.hamcrest.Matchers.equalTo;

 @RunWith(Parameterized.class)
 public class AccountIdEndpointModeResolverTest {
     private static final EnvironmentVariableHelper ENVIRONMENT_VARIABLE_HELPER = new EnvironmentVariableHelper();

     @Parameterized.Parameter
     public TestData testData;

     @Parameterized.Parameters
     public static Collection<Object> data() {
         return Arrays.asList(new Object[]{
                 new TestData(null, null, null, AccountIdEndpointMode.PREFERRED),
                 new TestData("preferred", "disabled", null, AccountIdEndpointMode.PREFERRED),
                 new TestData("wrongValue", null, null, AccountIdEndpointMode.PREFERRED),
                 new TestData(null, "wrongValue", null, AccountIdEndpointMode.PREFERRED),
                 new TestData("preferred", "disabled", "disabled", AccountIdEndpointMode.PREFERRED),
                 new TestData("preferred", "disabled", "disabled", AccountIdEndpointMode.PREFERRED),
                 new TestData(null, "disabled", null, AccountIdEndpointMode.DISABLED),
                 new TestData(null, null, "PropertySetToDisabled", AccountIdEndpointMode.DISABLED),
                 new TestData(null, null, null, AccountIdEndpointMode.PREFERRED),
                 new TestData("required", "required", "PropertySetToRequired", AccountIdEndpointMode.REQUIRED),
                 new TestData(null, null, "PropertySetToUnsupportedValue", AccountIdEndpointMode.PREFERRED),
                 new TestData(null, null, "PropertySetToDisabled", AccountIdEndpointMode.DISABLED),
                 new TestData(null, "disabled", "PropertySetToDisabled", AccountIdEndpointMode.DISABLED),
                 new TestData(null, null, "PropertySetToPreferred", AccountIdEndpointMode.PREFERRED),
         });
     }

     @Before
     public void methodSetup() {
         ENVIRONMENT_VARIABLE_HELPER.reset();
         System.clearProperty(AWS_ACCOUNT_ID_ENDPOINT_MODE_SYSTEM_PROPERTY);
     }

     @Test
     public void differentCombinationOfConfigs_shouldResolveCorrectly() {
         if (testData.envVarValue != null) {
             ENVIRONMENT_VARIABLE_HELPER.set(AWS_ACCOUNT_ID_ENDPOINT_MODE_ENV_VAR, testData.envVarValue);
         }

         if (testData.systemProperty != null) {
             System.setProperty(AWS_ACCOUNT_ID_ENDPOINT_MODE_SYSTEM_PROPERTY, testData.systemProperty);
         }

         AwsProfileFileLocationProvider profileFileLocationProvider =
                 new TestProfileFileLocationProvider(testData.configFile, "/resources/endpoints/");
         BasicProfileConfigFileLoader configFileLoader = new BasicProfileConfigFileLoader(profileFileLocationProvider);


         AccountIdEndpointModeResolver resolver = new AccountIdEndpointModeResolver(configFileLoader);

         assertThat(resolver.accountIdEndpointMode(), equalTo(testData.expected));
     }


     private static class TestData {
         private String envVarValue;
         private String systemProperty;
         private String configFile;
         private AccountIdEndpointMode expected;

         TestData(String envVarValue, String systemProperty, String configFile, AccountIdEndpointMode expected) {
             this.envVarValue = envVarValue;
             this.systemProperty = systemProperty;
             this.configFile = configFile;
             this.expected = expected;
         }
     }
 }
