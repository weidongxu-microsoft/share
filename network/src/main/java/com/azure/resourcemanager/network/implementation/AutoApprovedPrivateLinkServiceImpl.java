// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.resourcemanager.network.fluent.models.AutoApprovedPrivateLinkServiceInner;
import com.azure.resourcemanager.network.models.AutoApprovedPrivateLinkService;

public final class AutoApprovedPrivateLinkServiceImpl implements AutoApprovedPrivateLinkService {
    private AutoApprovedPrivateLinkServiceInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    AutoApprovedPrivateLinkServiceImpl(
        AutoApprovedPrivateLinkServiceInner innerObject,
        com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String privateLinkService() {
        return this.innerModel().privateLinkService();
    }

    public AutoApprovedPrivateLinkServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
