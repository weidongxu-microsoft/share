// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.resourcemanager.network.fluent.models.BastionActiveSessionInner;
import com.azure.resourcemanager.network.models.BastionActiveSession;
import com.azure.resourcemanager.network.models.BastionConnectProtocol;

public final class BastionActiveSessionImpl implements BastionActiveSession {
    private BastionActiveSessionInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    BastionActiveSessionImpl(
        BastionActiveSessionInner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String sessionId() {
        return this.innerModel().sessionId();
    }

    public Object startTime() {
        return this.innerModel().startTime();
    }

    public String targetSubscriptionId() {
        return this.innerModel().targetSubscriptionId();
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public String targetHostname() {
        return this.innerModel().targetHostname();
    }

    public String targetResourceGroup() {
        return this.innerModel().targetResourceGroup();
    }

    public String username() {
        return this.innerModel().username();
    }

    public String targetIpAddress() {
        return this.innerModel().targetIpAddress();
    }

    public BastionConnectProtocol protocol() {
        return this.innerModel().protocol();
    }

    public String targetResourceId() {
        return this.innerModel().targetResourceId();
    }

    public Float sessionDurationInMins() {
        return this.innerModel().sessionDurationInMins();
    }

    public BastionActiveSessionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
