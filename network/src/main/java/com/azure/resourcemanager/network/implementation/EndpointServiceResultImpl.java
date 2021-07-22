// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.resourcemanager.network.fluent.models.EndpointServiceResultInner;
import com.azure.resourcemanager.network.models.EndpointServiceResult;

public final class EndpointServiceResultImpl implements EndpointServiceResult {
    private EndpointServiceResultInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    EndpointServiceResultImpl(
        EndpointServiceResultInner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public EndpointServiceResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
