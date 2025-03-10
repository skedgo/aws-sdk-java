/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Specified video input in a template.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/InputTemplate" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputTemplate implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups.
     * See "Audio Selector Group":#inputs-audio_selector_group for more information.
     */
    private java.util.Map<String, AudioSelectorGroup> audioSelectorGroups;
    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your
     * outputs. You can use mutiple Audio selectors per input.
     */
    private java.util.Map<String, AudioSelector> audioSelectors;
    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your
     * outputs. You can use mutiple captions selectors per input.
     */
    private java.util.Map<String, CaptionSelector> captionSelectors;
    /**
     * Use Cropping selection (crop) to specify the video area that the service will include in the output video frame.
     * If you specify a value here, it will override any value that you specify in the output setting Cropping selection
     * (crop).
     */
    private Rectangle crop;
    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manaully
     * controllable for MPEG2 and uncompressed video inputs.
     */
    private String deblockFilter;
    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable to
     * MPEG2, H.264, H.265, and uncompressed video inputs.
     */
    private String denoiseFilter;
    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock
     * filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input
     * type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in
     * (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
     */
    private String filterEnable;
    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The
     * range is -5 to 5. Default is 0.
     */
    private Integer filterStrength;
    /**
     * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for
     * each input individually. This setting is disabled by default.
     */
    private ImageInserter imageInserter;
    /**
     * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in
     * the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If
     * you provide only an end time, it will be the entire input up to that point. When you specify more than one input
     * clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify
     * them.
     */
    private java.util.List<InputClipping> inputClippings;
    /**
     * Use Selection placement (position) to define the video area in your output frame. The area outside of the
     * rectangle that you specify here is black. If you specify a value here, it will override any value that you
     * specify in the output setting Selection placement (position). If you specify a value here, this will override any
     * AFD values in your input, even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If you specify a
     * value here, this will ignore anything that you specify for the setting Scaling Behavior (scalingBehavior).
     */
    private Rectangle position;
    /**
     * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that
     * Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you
     * specify doesn't exist, the transcoding service will use this default.
     */
    private Integer programNumber;
    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. *
     * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
     */
    private String psiControl;
    /**
     * Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that apply to a
     * single input at a time, such as input clipping and synchronizing some captions formats. Use this setting to
     * specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or by starting the first
     * frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or HH:MM:SS;FF, where FF is the frame
     * number. Only set this to EMBEDDED if your source video has embedded timecodes.
     */
    private String timecodeSource;
    /** Selector for video. */
    private VideoSelector videoSelector;

    /**
     * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups.
     * See "Audio Selector Group":#inputs-audio_selector_group for more information.
     * 
     * @return Specifies set of audio selectors within an input to combine. An input may have multiple audio selector
     *         groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
     */

    public java.util.Map<String, AudioSelectorGroup> getAudioSelectorGroups() {
        return audioSelectorGroups;
    }

    /**
     * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups.
     * See "Audio Selector Group":#inputs-audio_selector_group for more information.
     * 
     * @param audioSelectorGroups
     *        Specifies set of audio selectors within an input to combine. An input may have multiple audio selector
     *        groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
     */

    public void setAudioSelectorGroups(java.util.Map<String, AudioSelectorGroup> audioSelectorGroups) {
        this.audioSelectorGroups = audioSelectorGroups;
    }

    /**
     * Specifies set of audio selectors within an input to combine. An input may have multiple audio selector groups.
     * See "Audio Selector Group":#inputs-audio_selector_group for more information.
     * 
     * @param audioSelectorGroups
     *        Specifies set of audio selectors within an input to combine. An input may have multiple audio selector
     *        groups. See "Audio Selector Group":#inputs-audio_selector_group for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withAudioSelectorGroups(java.util.Map<String, AudioSelectorGroup> audioSelectorGroups) {
        setAudioSelectorGroups(audioSelectorGroups);
        return this;
    }

    public InputTemplate addAudioSelectorGroupsEntry(String key, AudioSelectorGroup value) {
        if (null == this.audioSelectorGroups) {
            this.audioSelectorGroups = new java.util.HashMap<String, AudioSelectorGroup>();
        }
        if (this.audioSelectorGroups.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.audioSelectorGroups.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AudioSelectorGroups.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate clearAudioSelectorGroupsEntries() {
        this.audioSelectorGroups = null;
        return this;
    }

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your
     * outputs. You can use mutiple Audio selectors per input.
     * 
     * @return Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use
     *         in your outputs. You can use mutiple Audio selectors per input.
     */

    public java.util.Map<String, AudioSelector> getAudioSelectors() {
        return audioSelectors;
    }

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your
     * outputs. You can use mutiple Audio selectors per input.
     * 
     * @param audioSelectors
     *        Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use
     *        in your outputs. You can use mutiple Audio selectors per input.
     */

    public void setAudioSelectors(java.util.Map<String, AudioSelector> audioSelectors) {
        this.audioSelectors = audioSelectors;
    }

    /**
     * Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use in your
     * outputs. You can use mutiple Audio selectors per input.
     * 
     * @param audioSelectors
     *        Use Audio selectors (AudioSelectors) to specify a track or set of tracks from the input that you will use
     *        in your outputs. You can use mutiple Audio selectors per input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withAudioSelectors(java.util.Map<String, AudioSelector> audioSelectors) {
        setAudioSelectors(audioSelectors);
        return this;
    }

    public InputTemplate addAudioSelectorsEntry(String key, AudioSelector value) {
        if (null == this.audioSelectors) {
            this.audioSelectors = new java.util.HashMap<String, AudioSelector>();
        }
        if (this.audioSelectors.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.audioSelectors.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AudioSelectors.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate clearAudioSelectorsEntries() {
        this.audioSelectors = null;
        return this;
    }

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your
     * outputs. You can use mutiple captions selectors per input.
     * 
     * @return Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use
     *         in your outputs. You can use mutiple captions selectors per input.
     */

    public java.util.Map<String, CaptionSelector> getCaptionSelectors() {
        return captionSelectors;
    }

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your
     * outputs. You can use mutiple captions selectors per input.
     * 
     * @param captionSelectors
     *        Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in
     *        your outputs. You can use mutiple captions selectors per input.
     */

    public void setCaptionSelectors(java.util.Map<String, CaptionSelector> captionSelectors) {
        this.captionSelectors = captionSelectors;
    }

    /**
     * Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in your
     * outputs. You can use mutiple captions selectors per input.
     * 
     * @param captionSelectors
     *        Use Captions selectors (CaptionSelectors) to specify the captions data from the input that you will use in
     *        your outputs. You can use mutiple captions selectors per input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withCaptionSelectors(java.util.Map<String, CaptionSelector> captionSelectors) {
        setCaptionSelectors(captionSelectors);
        return this;
    }

    public InputTemplate addCaptionSelectorsEntry(String key, CaptionSelector value) {
        if (null == this.captionSelectors) {
            this.captionSelectors = new java.util.HashMap<String, CaptionSelector>();
        }
        if (this.captionSelectors.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.captionSelectors.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CaptionSelectors.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate clearCaptionSelectorsEntries() {
        this.captionSelectors = null;
        return this;
    }

    /**
     * Use Cropping selection (crop) to specify the video area that the service will include in the output video frame.
     * If you specify a value here, it will override any value that you specify in the output setting Cropping selection
     * (crop).
     * 
     * @param crop
     *        Use Cropping selection (crop) to specify the video area that the service will include in the output video
     *        frame. If you specify a value here, it will override any value that you specify in the output setting
     *        Cropping selection (crop).
     */

    public void setCrop(Rectangle crop) {
        this.crop = crop;
    }

    /**
     * Use Cropping selection (crop) to specify the video area that the service will include in the output video frame.
     * If you specify a value here, it will override any value that you specify in the output setting Cropping selection
     * (crop).
     * 
     * @return Use Cropping selection (crop) to specify the video area that the service will include in the output video
     *         frame. If you specify a value here, it will override any value that you specify in the output setting
     *         Cropping selection (crop).
     */

    public Rectangle getCrop() {
        return this.crop;
    }

    /**
     * Use Cropping selection (crop) to specify the video area that the service will include in the output video frame.
     * If you specify a value here, it will override any value that you specify in the output setting Cropping selection
     * (crop).
     * 
     * @param crop
     *        Use Cropping selection (crop) to specify the video area that the service will include in the output video
     *        frame. If you specify a value here, it will override any value that you specify in the output setting
     *        Cropping selection (crop).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withCrop(Rectangle crop) {
        setCrop(crop);
        return this;
    }

    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manaully
     * controllable for MPEG2 and uncompressed video inputs.
     * 
     * @param deblockFilter
     *        Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only
     *        manaully controllable for MPEG2 and uncompressed video inputs.
     * @see InputDeblockFilter
     */

    public void setDeblockFilter(String deblockFilter) {
        this.deblockFilter = deblockFilter;
    }

    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manaully
     * controllable for MPEG2 and uncompressed video inputs.
     * 
     * @return Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only
     *         manaully controllable for MPEG2 and uncompressed video inputs.
     * @see InputDeblockFilter
     */

    public String getDeblockFilter() {
        return this.deblockFilter;
    }

    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manaully
     * controllable for MPEG2 and uncompressed video inputs.
     * 
     * @param deblockFilter
     *        Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only
     *        manaully controllable for MPEG2 and uncompressed video inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeblockFilter
     */

    public InputTemplate withDeblockFilter(String deblockFilter) {
        setDeblockFilter(deblockFilter);
        return this;
    }

    /**
     * Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only manaully
     * controllable for MPEG2 and uncompressed video inputs.
     * 
     * @param deblockFilter
     *        Enable Deblock (InputDeblockFilter) to produce smoother motion in the output. Default is disabled. Only
     *        manaully controllable for MPEG2 and uncompressed video inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeblockFilter
     */

    public InputTemplate withDeblockFilter(InputDeblockFilter deblockFilter) {
        this.deblockFilter = deblockFilter.toString();
        return this;
    }

    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable to
     * MPEG2, H.264, H.265, and uncompressed video inputs.
     * 
     * @param denoiseFilter
     *        Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable
     *        to MPEG2, H.264, H.265, and uncompressed video inputs.
     * @see InputDenoiseFilter
     */

    public void setDenoiseFilter(String denoiseFilter) {
        this.denoiseFilter = denoiseFilter;
    }

    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable to
     * MPEG2, H.264, H.265, and uncompressed video inputs.
     * 
     * @return Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable
     *         to MPEG2, H.264, H.265, and uncompressed video inputs.
     * @see InputDenoiseFilter
     */

    public String getDenoiseFilter() {
        return this.denoiseFilter;
    }

    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable to
     * MPEG2, H.264, H.265, and uncompressed video inputs.
     * 
     * @param denoiseFilter
     *        Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable
     *        to MPEG2, H.264, H.265, and uncompressed video inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDenoiseFilter
     */

    public InputTemplate withDenoiseFilter(String denoiseFilter) {
        setDenoiseFilter(denoiseFilter);
        return this;
    }

    /**
     * Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable to
     * MPEG2, H.264, H.265, and uncompressed video inputs.
     * 
     * @param denoiseFilter
     *        Enable Denoise (InputDenoiseFilter) to filter noise from the input. Default is disabled. Only applicable
     *        to MPEG2, H.264, H.265, and uncompressed video inputs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDenoiseFilter
     */

    public InputTemplate withDenoiseFilter(InputDenoiseFilter denoiseFilter) {
        this.denoiseFilter = denoiseFilter.toString();
        return this;
    }

    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock
     * filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input
     * type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in
     * (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
     * 
     * @param filterEnable
     *        Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and
     *        deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and
     *        Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering,
     *        depending on input type and quality. * Disable - The input is not filtered. This is true even if you use
     *        the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered
     *        regardless of input type.
     * @see InputFilterEnable
     */

    public void setFilterEnable(String filterEnable) {
        this.filterEnable = filterEnable;
    }

    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock
     * filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input
     * type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in
     * (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
     * 
     * @return Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and
     *         deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and
     *         Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering,
     *         depending on input type and quality. * Disable - The input is not filtered. This is true even if you use
     *         the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered
     *         regardless of input type.
     * @see InputFilterEnable
     */

    public String getFilterEnable() {
        return this.filterEnable;
    }

    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock
     * filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input
     * type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in
     * (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
     * 
     * @param filterEnable
     *        Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and
     *        deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and
     *        Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering,
     *        depending on input type and quality. * Disable - The input is not filtered. This is true even if you use
     *        the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered
     *        regardless of input type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFilterEnable
     */

    public InputTemplate withFilterEnable(String filterEnable) {
        setFilterEnable(filterEnable);
        return this;
    }

    /**
     * Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and deblock
     * filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and Deblock
     * (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering, depending on input
     * type and quality. * Disable - The input is not filtered. This is true even if you use the API to enable them in
     * (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered regardless of input type.
     * 
     * @param filterEnable
     *        Use Filter enable (InputFilterEnable) to specify how the transcoding service applies the denoise and
     *        deblock filters. You must also enable the filters separately, with Denoise (InputDenoiseFilter) and
     *        Deblock (InputDeblockFilter). * Auto - The transcoding service determines whether to apply filtering,
     *        depending on input type and quality. * Disable - The input is not filtered. This is true even if you use
     *        the API to enable them in (InputDeblockFilter) and (InputDeblockFilter). * Force - The in put is filtered
     *        regardless of input type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputFilterEnable
     */

    public InputTemplate withFilterEnable(InputFilterEnable filterEnable) {
        this.filterEnable = filterEnable.toString();
        return this;
    }

    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The
     * range is -5 to 5. Default is 0.
     * 
     * @param filterStrength
     *        Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and
     *        Denoise). The range is -5 to 5. Default is 0.
     */

    public void setFilterStrength(Integer filterStrength) {
        this.filterStrength = filterStrength;
    }

    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The
     * range is -5 to 5. Default is 0.
     * 
     * @return Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and
     *         Denoise). The range is -5 to 5. Default is 0.
     */

    public Integer getFilterStrength() {
        return this.filterStrength;
    }

    /**
     * Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and Denoise). The
     * range is -5 to 5. Default is 0.
     * 
     * @param filterStrength
     *        Use Filter strength (FilterStrength) to adjust the magnitude the input filter settings (Deblock and
     *        Denoise). The range is -5 to 5. Default is 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withFilterStrength(Integer filterStrength) {
        setFilterStrength(filterStrength);
        return this;
    }

    /**
     * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for
     * each input individually. This setting is disabled by default.
     * 
     * @param imageInserter
     *        Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this
     *        feature for each input individually. This setting is disabled by default.
     */

    public void setImageInserter(ImageInserter imageInserter) {
        this.imageInserter = imageInserter;
    }

    /**
     * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for
     * each input individually. This setting is disabled by default.
     * 
     * @return Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this
     *         feature for each input individually. This setting is disabled by default.
     */

    public ImageInserter getImageInserter() {
        return this.imageInserter;
    }

    /**
     * Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this feature for
     * each input individually. This setting is disabled by default.
     * 
     * @param imageInserter
     *        Enable the image inserter feature to include a graphic overlay on your video. Enable or disable this
     *        feature for each input individually. This setting is disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withImageInserter(ImageInserter imageInserter) {
        setImageInserter(imageInserter);
        return this;
    }

    /**
     * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in
     * the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If
     * you provide only an end time, it will be the entire input up to that point. When you specify more than one input
     * clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify
     * them.
     * 
     * @return (InputClippings) contains sets of start and end times that together specify a portion of the input to be
     *         used in the outputs. If you provide only a start time, the clip will be the entire input from that point
     *         to the end. If you provide only an end time, it will be the entire input up to that point. When you
     *         specify more than one input clip, the transcoding service creates the job outputs by stringing the clips
     *         together in the order you specify them.
     */

    public java.util.List<InputClipping> getInputClippings() {
        return inputClippings;
    }

    /**
     * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in
     * the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If
     * you provide only an end time, it will be the entire input up to that point. When you specify more than one input
     * clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify
     * them.
     * 
     * @param inputClippings
     *        (InputClippings) contains sets of start and end times that together specify a portion of the input to be
     *        used in the outputs. If you provide only a start time, the clip will be the entire input from that point
     *        to the end. If you provide only an end time, it will be the entire input up to that point. When you
     *        specify more than one input clip, the transcoding service creates the job outputs by stringing the clips
     *        together in the order you specify them.
     */

    public void setInputClippings(java.util.Collection<InputClipping> inputClippings) {
        if (inputClippings == null) {
            this.inputClippings = null;
            return;
        }

        this.inputClippings = new java.util.ArrayList<InputClipping>(inputClippings);
    }

    /**
     * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in
     * the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If
     * you provide only an end time, it will be the entire input up to that point. When you specify more than one input
     * clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify
     * them.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputClippings(java.util.Collection)} or {@link #withInputClippings(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param inputClippings
     *        (InputClippings) contains sets of start and end times that together specify a portion of the input to be
     *        used in the outputs. If you provide only a start time, the clip will be the entire input from that point
     *        to the end. If you provide only an end time, it will be the entire input up to that point. When you
     *        specify more than one input clip, the transcoding service creates the job outputs by stringing the clips
     *        together in the order you specify them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withInputClippings(InputClipping... inputClippings) {
        if (this.inputClippings == null) {
            setInputClippings(new java.util.ArrayList<InputClipping>(inputClippings.length));
        }
        for (InputClipping ele : inputClippings) {
            this.inputClippings.add(ele);
        }
        return this;
    }

    /**
     * (InputClippings) contains sets of start and end times that together specify a portion of the input to be used in
     * the outputs. If you provide only a start time, the clip will be the entire input from that point to the end. If
     * you provide only an end time, it will be the entire input up to that point. When you specify more than one input
     * clip, the transcoding service creates the job outputs by stringing the clips together in the order you specify
     * them.
     * 
     * @param inputClippings
     *        (InputClippings) contains sets of start and end times that together specify a portion of the input to be
     *        used in the outputs. If you provide only a start time, the clip will be the entire input from that point
     *        to the end. If you provide only an end time, it will be the entire input up to that point. When you
     *        specify more than one input clip, the transcoding service creates the job outputs by stringing the clips
     *        together in the order you specify them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withInputClippings(java.util.Collection<InputClipping> inputClippings) {
        setInputClippings(inputClippings);
        return this;
    }

    /**
     * Use Selection placement (position) to define the video area in your output frame. The area outside of the
     * rectangle that you specify here is black. If you specify a value here, it will override any value that you
     * specify in the output setting Selection placement (position). If you specify a value here, this will override any
     * AFD values in your input, even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If you specify a
     * value here, this will ignore anything that you specify for the setting Scaling Behavior (scalingBehavior).
     * 
     * @param position
     *        Use Selection placement (position) to define the video area in your output frame. The area outside of the
     *        rectangle that you specify here is black. If you specify a value here, it will override any value that you
     *        specify in the output setting Selection placement (position). If you specify a value here, this will
     *        override any AFD values in your input, even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND).
     *        If you specify a value here, this will ignore anything that you specify for the setting Scaling Behavior
     *        (scalingBehavior).
     */

    public void setPosition(Rectangle position) {
        this.position = position;
    }

    /**
     * Use Selection placement (position) to define the video area in your output frame. The area outside of the
     * rectangle that you specify here is black. If you specify a value here, it will override any value that you
     * specify in the output setting Selection placement (position). If you specify a value here, this will override any
     * AFD values in your input, even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If you specify a
     * value here, this will ignore anything that you specify for the setting Scaling Behavior (scalingBehavior).
     * 
     * @return Use Selection placement (position) to define the video area in your output frame. The area outside of the
     *         rectangle that you specify here is black. If you specify a value here, it will override any value that
     *         you specify in the output setting Selection placement (position). If you specify a value here, this will
     *         override any AFD values in your input, even if you set Respond to AFD (RespondToAfd) to Respond
     *         (RESPOND). If you specify a value here, this will ignore anything that you specify for the setting
     *         Scaling Behavior (scalingBehavior).
     */

    public Rectangle getPosition() {
        return this.position;
    }

    /**
     * Use Selection placement (position) to define the video area in your output frame. The area outside of the
     * rectangle that you specify here is black. If you specify a value here, it will override any value that you
     * specify in the output setting Selection placement (position). If you specify a value here, this will override any
     * AFD values in your input, even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND). If you specify a
     * value here, this will ignore anything that you specify for the setting Scaling Behavior (scalingBehavior).
     * 
     * @param position
     *        Use Selection placement (position) to define the video area in your output frame. The area outside of the
     *        rectangle that you specify here is black. If you specify a value here, it will override any value that you
     *        specify in the output setting Selection placement (position). If you specify a value here, this will
     *        override any AFD values in your input, even if you set Respond to AFD (RespondToAfd) to Respond (RESPOND).
     *        If you specify a value here, this will ignore anything that you specify for the setting Scaling Behavior
     *        (scalingBehavior).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withPosition(Rectangle position) {
        setPosition(position);
        return this;
    }

    /**
     * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that
     * Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you
     * specify doesn't exist, the transcoding service will use this default.
     * 
     * @param programNumber
     *        Use Program (programNumber) to select a specific program from within a multi-program transport stream.
     *        Note that Quad 4K is not currently supported. Default is the first program within the transport stream. If
     *        the program you specify doesn't exist, the transcoding service will use this default.
     */

    public void setProgramNumber(Integer programNumber) {
        this.programNumber = programNumber;
    }

    /**
     * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that
     * Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you
     * specify doesn't exist, the transcoding service will use this default.
     * 
     * @return Use Program (programNumber) to select a specific program from within a multi-program transport stream.
     *         Note that Quad 4K is not currently supported. Default is the first program within the transport stream.
     *         If the program you specify doesn't exist, the transcoding service will use this default.
     */

    public Integer getProgramNumber() {
        return this.programNumber;
    }

    /**
     * Use Program (programNumber) to select a specific program from within a multi-program transport stream. Note that
     * Quad 4K is not currently supported. Default is the first program within the transport stream. If the program you
     * specify doesn't exist, the transcoding service will use this default.
     * 
     * @param programNumber
     *        Use Program (programNumber) to select a specific program from within a multi-program transport stream.
     *        Note that Quad 4K is not currently supported. Default is the first program within the transport stream. If
     *        the program you specify doesn't exist, the transcoding service will use this default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withProgramNumber(Integer programNumber) {
        setProgramNumber(programNumber);
        return this;
    }

    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. *
     * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
     * 
     * @param psiControl
     *        Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to
     *        scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
     * @see InputPsiControl
     */

    public void setPsiControl(String psiControl) {
        this.psiControl = psiControl;
    }

    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. *
     * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
     * 
     * @return Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to
     *         scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
     * @see InputPsiControl
     */

    public String getPsiControl() {
        return this.psiControl;
    }

    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. *
     * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
     * 
     * @param psiControl
     *        Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to
     *        scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPsiControl
     */

    public InputTemplate withPsiControl(String psiControl) {
        setPsiControl(psiControl);
        return this;
    }

    /**
     * Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to scans. *
     * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
     * 
     * @param psiControl
     *        Set PSI control (InputPsiControl) for transport stream inputs to specify which data the demux process to
     *        scans. * Ignore PSI - Scan all PIDs for audio and video. * Use PSI - Scan only PSI data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputPsiControl
     */

    public InputTemplate withPsiControl(InputPsiControl psiControl) {
        this.psiControl = psiControl.toString();
        return this;
    }

    /**
     * Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that apply to a
     * single input at a time, such as input clipping and synchronizing some captions formats. Use this setting to
     * specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or by starting the first
     * frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or HH:MM:SS;FF, where FF is the frame
     * number. Only set this to EMBEDDED if your source video has embedded timecodes.
     * 
     * @param timecodeSource
     *        Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that
     *        apply to a single input at a time, such as input clipping and synchronizing some captions formats. Use
     *        this setting to specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or
     *        by starting the first frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or
     *        HH:MM:SS;FF, where FF is the frame number. Only set this to EMBEDDED if your source video has embedded
     *        timecodes.
     * @see InputTimecodeSource
     */

    public void setTimecodeSource(String timecodeSource) {
        this.timecodeSource = timecodeSource;
    }

    /**
     * Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that apply to a
     * single input at a time, such as input clipping and synchronizing some captions formats. Use this setting to
     * specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or by starting the first
     * frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or HH:MM:SS;FF, where FF is the frame
     * number. Only set this to EMBEDDED if your source video has embedded timecodes.
     * 
     * @return Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that
     *         apply to a single input at a time, such as input clipping and synchronizing some captions formats. Use
     *         this setting to specify whether the service counts frames by timecodes embedded in the video (EMBEDDED)
     *         or by starting the first frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or
     *         HH:MM:SS;FF, where FF is the frame number. Only set this to EMBEDDED if your source video has embedded
     *         timecodes.
     * @see InputTimecodeSource
     */

    public String getTimecodeSource() {
        return this.timecodeSource;
    }

    /**
     * Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that apply to a
     * single input at a time, such as input clipping and synchronizing some captions formats. Use this setting to
     * specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or by starting the first
     * frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or HH:MM:SS;FF, where FF is the frame
     * number. Only set this to EMBEDDED if your source video has embedded timecodes.
     * 
     * @param timecodeSource
     *        Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that
     *        apply to a single input at a time, such as input clipping and synchronizing some captions formats. Use
     *        this setting to specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or
     *        by starting the first frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or
     *        HH:MM:SS;FF, where FF is the frame number. Only set this to EMBEDDED if your source video has embedded
     *        timecodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputTimecodeSource
     */

    public InputTemplate withTimecodeSource(String timecodeSource) {
        setTimecodeSource(timecodeSource);
        return this;
    }

    /**
     * Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that apply to a
     * single input at a time, such as input clipping and synchronizing some captions formats. Use this setting to
     * specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or by starting the first
     * frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or HH:MM:SS;FF, where FF is the frame
     * number. Only set this to EMBEDDED if your source video has embedded timecodes.
     * 
     * @param timecodeSource
     *        Timecode source under input settings (InputTimecodeSource) only affects the behavior of features that
     *        apply to a single input at a time, such as input clipping and synchronizing some captions formats. Use
     *        this setting to specify whether the service counts frames by timecodes embedded in the video (EMBEDDED) or
     *        by starting the first frame at zero (ZEROBASED). In both cases, the timecode format is HH:MM:SS:FF or
     *        HH:MM:SS;FF, where FF is the frame number. Only set this to EMBEDDED if your source video has embedded
     *        timecodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputTimecodeSource
     */

    public InputTemplate withTimecodeSource(InputTimecodeSource timecodeSource) {
        this.timecodeSource = timecodeSource.toString();
        return this;
    }

    /**
     * Selector for video.
     * 
     * @param videoSelector
     *        Selector for video.
     */

    public void setVideoSelector(VideoSelector videoSelector) {
        this.videoSelector = videoSelector;
    }

    /**
     * Selector for video.
     * 
     * @return Selector for video.
     */

    public VideoSelector getVideoSelector() {
        return this.videoSelector;
    }

    /**
     * Selector for video.
     * 
     * @param videoSelector
     *        Selector for video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputTemplate withVideoSelector(VideoSelector videoSelector) {
        setVideoSelector(videoSelector);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAudioSelectorGroups() != null)
            sb.append("AudioSelectorGroups: ").append(getAudioSelectorGroups()).append(",");
        if (getAudioSelectors() != null)
            sb.append("AudioSelectors: ").append(getAudioSelectors()).append(",");
        if (getCaptionSelectors() != null)
            sb.append("CaptionSelectors: ").append(getCaptionSelectors()).append(",");
        if (getCrop() != null)
            sb.append("Crop: ").append(getCrop()).append(",");
        if (getDeblockFilter() != null)
            sb.append("DeblockFilter: ").append(getDeblockFilter()).append(",");
        if (getDenoiseFilter() != null)
            sb.append("DenoiseFilter: ").append(getDenoiseFilter()).append(",");
        if (getFilterEnable() != null)
            sb.append("FilterEnable: ").append(getFilterEnable()).append(",");
        if (getFilterStrength() != null)
            sb.append("FilterStrength: ").append(getFilterStrength()).append(",");
        if (getImageInserter() != null)
            sb.append("ImageInserter: ").append(getImageInserter()).append(",");
        if (getInputClippings() != null)
            sb.append("InputClippings: ").append(getInputClippings()).append(",");
        if (getPosition() != null)
            sb.append("Position: ").append(getPosition()).append(",");
        if (getProgramNumber() != null)
            sb.append("ProgramNumber: ").append(getProgramNumber()).append(",");
        if (getPsiControl() != null)
            sb.append("PsiControl: ").append(getPsiControl()).append(",");
        if (getTimecodeSource() != null)
            sb.append("TimecodeSource: ").append(getTimecodeSource()).append(",");
        if (getVideoSelector() != null)
            sb.append("VideoSelector: ").append(getVideoSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputTemplate == false)
            return false;
        InputTemplate other = (InputTemplate) obj;
        if (other.getAudioSelectorGroups() == null ^ this.getAudioSelectorGroups() == null)
            return false;
        if (other.getAudioSelectorGroups() != null && other.getAudioSelectorGroups().equals(this.getAudioSelectorGroups()) == false)
            return false;
        if (other.getAudioSelectors() == null ^ this.getAudioSelectors() == null)
            return false;
        if (other.getAudioSelectors() != null && other.getAudioSelectors().equals(this.getAudioSelectors()) == false)
            return false;
        if (other.getCaptionSelectors() == null ^ this.getCaptionSelectors() == null)
            return false;
        if (other.getCaptionSelectors() != null && other.getCaptionSelectors().equals(this.getCaptionSelectors()) == false)
            return false;
        if (other.getCrop() == null ^ this.getCrop() == null)
            return false;
        if (other.getCrop() != null && other.getCrop().equals(this.getCrop()) == false)
            return false;
        if (other.getDeblockFilter() == null ^ this.getDeblockFilter() == null)
            return false;
        if (other.getDeblockFilter() != null && other.getDeblockFilter().equals(this.getDeblockFilter()) == false)
            return false;
        if (other.getDenoiseFilter() == null ^ this.getDenoiseFilter() == null)
            return false;
        if (other.getDenoiseFilter() != null && other.getDenoiseFilter().equals(this.getDenoiseFilter()) == false)
            return false;
        if (other.getFilterEnable() == null ^ this.getFilterEnable() == null)
            return false;
        if (other.getFilterEnable() != null && other.getFilterEnable().equals(this.getFilterEnable()) == false)
            return false;
        if (other.getFilterStrength() == null ^ this.getFilterStrength() == null)
            return false;
        if (other.getFilterStrength() != null && other.getFilterStrength().equals(this.getFilterStrength()) == false)
            return false;
        if (other.getImageInserter() == null ^ this.getImageInserter() == null)
            return false;
        if (other.getImageInserter() != null && other.getImageInserter().equals(this.getImageInserter()) == false)
            return false;
        if (other.getInputClippings() == null ^ this.getInputClippings() == null)
            return false;
        if (other.getInputClippings() != null && other.getInputClippings().equals(this.getInputClippings()) == false)
            return false;
        if (other.getPosition() == null ^ this.getPosition() == null)
            return false;
        if (other.getPosition() != null && other.getPosition().equals(this.getPosition()) == false)
            return false;
        if (other.getProgramNumber() == null ^ this.getProgramNumber() == null)
            return false;
        if (other.getProgramNumber() != null && other.getProgramNumber().equals(this.getProgramNumber()) == false)
            return false;
        if (other.getPsiControl() == null ^ this.getPsiControl() == null)
            return false;
        if (other.getPsiControl() != null && other.getPsiControl().equals(this.getPsiControl()) == false)
            return false;
        if (other.getTimecodeSource() == null ^ this.getTimecodeSource() == null)
            return false;
        if (other.getTimecodeSource() != null && other.getTimecodeSource().equals(this.getTimecodeSource()) == false)
            return false;
        if (other.getVideoSelector() == null ^ this.getVideoSelector() == null)
            return false;
        if (other.getVideoSelector() != null && other.getVideoSelector().equals(this.getVideoSelector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioSelectorGroups() == null) ? 0 : getAudioSelectorGroups().hashCode());
        hashCode = prime * hashCode + ((getAudioSelectors() == null) ? 0 : getAudioSelectors().hashCode());
        hashCode = prime * hashCode + ((getCaptionSelectors() == null) ? 0 : getCaptionSelectors().hashCode());
        hashCode = prime * hashCode + ((getCrop() == null) ? 0 : getCrop().hashCode());
        hashCode = prime * hashCode + ((getDeblockFilter() == null) ? 0 : getDeblockFilter().hashCode());
        hashCode = prime * hashCode + ((getDenoiseFilter() == null) ? 0 : getDenoiseFilter().hashCode());
        hashCode = prime * hashCode + ((getFilterEnable() == null) ? 0 : getFilterEnable().hashCode());
        hashCode = prime * hashCode + ((getFilterStrength() == null) ? 0 : getFilterStrength().hashCode());
        hashCode = prime * hashCode + ((getImageInserter() == null) ? 0 : getImageInserter().hashCode());
        hashCode = prime * hashCode + ((getInputClippings() == null) ? 0 : getInputClippings().hashCode());
        hashCode = prime * hashCode + ((getPosition() == null) ? 0 : getPosition().hashCode());
        hashCode = prime * hashCode + ((getProgramNumber() == null) ? 0 : getProgramNumber().hashCode());
        hashCode = prime * hashCode + ((getPsiControl() == null) ? 0 : getPsiControl().hashCode());
        hashCode = prime * hashCode + ((getTimecodeSource() == null) ? 0 : getTimecodeSource().hashCode());
        hashCode = prime * hashCode + ((getVideoSelector() == null) ? 0 : getVideoSelector().hashCode());
        return hashCode;
    }

    @Override
    public InputTemplate clone() {
        try {
            return (InputTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.InputTemplateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
