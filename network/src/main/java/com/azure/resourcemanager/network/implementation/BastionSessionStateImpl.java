// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.resourcemanager.network.fluent.models.BastionSessionStateInner;
import com.azure.resourcemanager.network.models.BastionSessionState;

public final class BastionSessionStateImpl implements BastionSessionState {
    private BastionSessionStateInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    BastionSessionStateImpl(
        BastionSessionStateInner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String sessionId() {
        return this.innerModel().sessionId();
    }

    public String message() {
        return this.innerModel().message();
    }

    public String state() {
        return this.innerModel().state();
    }

    public BastionSessionStateInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}