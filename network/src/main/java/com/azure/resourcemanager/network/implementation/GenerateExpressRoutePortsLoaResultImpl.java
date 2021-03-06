// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.resourcemanager.network.fluent.models.GenerateExpressRoutePortsLoaResultInner;
import com.azure.resourcemanager.network.models.GenerateExpressRoutePortsLoaResult;

public final class GenerateExpressRoutePortsLoaResultImpl implements GenerateExpressRoutePortsLoaResult {
    private GenerateExpressRoutePortsLoaResultInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    GenerateExpressRoutePortsLoaResultImpl(
        GenerateExpressRoutePortsLoaResultInner innerObject,
        com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String encodedContent() {
        return this.innerModel().encodedContent();
    }

    public GenerateExpressRoutePortsLoaResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
