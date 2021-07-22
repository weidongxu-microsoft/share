// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.resourcemanager.network.fluent.models.NetworkConfigurationDiagnosticResponseInner;
import java.util.List;

/** An immutable client-side representation of NetworkConfigurationDiagnosticResponse. */
public interface NetworkConfigurationDiagnosticResponse {
    /**
     * Gets the results property: List of network configuration diagnostic results.
     *
     * @return the results value.
     */
    List<NetworkConfigurationDiagnosticResult> results();

    /**
     * Gets the inner com.azure.resourcemanager.network.fluent.models.NetworkConfigurationDiagnosticResponseInner
     * object.
     *
     * @return the inner object.
     */
    NetworkConfigurationDiagnosticResponseInner innerModel();
}
