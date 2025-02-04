/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache License Version 2.0.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2016-Present Datadog, Inc.
 */

package com.datadog.android.bridge

/**
 * A configuration object to initialize Datadog's features.
 * @param clientToken A valid Datadog client token.
 * @param env The application’s environment, for example: prod, pre-prod, staging, etc.
 * @param applicationId The RUM application ID.
 * @param nativeCrashReportEnabled Whether the SDK should track native (pure iOS or pure Android) crashes (default is false).
 * @param sampleRate The sample rate (between 0 and 100) of RUM sessions kept.
 * @param additionalConfig Additional configuration parameters.
 */
data class DdSdkConfiguration(
    val clientToken: String,
    val env: String,
    val applicationId: String? = null,
    val nativeCrashReportEnabled: Boolean? = null,
    val sampleRate: Double? = null,
    val additionalConfig: Map<String, Any?>? = null
)
