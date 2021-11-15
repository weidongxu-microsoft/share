// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.resourcemanager.network.fluent.models.ApplicationGatewaySslPredefinedPolicyInner;
import com.azure.resourcemanager.network.models.ApplicationGatewaySslCipherSuite;
import com.azure.resourcemanager.network.models.ApplicationGatewaySslPredefinedPolicy;
import com.azure.resourcemanager.network.models.ApplicationGatewaySslProtocol;
import java.util.Collections;
import java.util.List;

public final class ApplicationGatewaySslPredefinedPolicyImpl implements ApplicationGatewaySslPredefinedPolicy {
    private ApplicationGatewaySslPredefinedPolicyInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    ApplicationGatewaySslPredefinedPolicyImpl(
        ApplicationGatewaySslPredefinedPolicyInner innerObject,
        com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public List<ApplicationGatewaySslCipherSuite> cipherSuites() {
        List<ApplicationGatewaySslCipherSuite> inner = this.innerModel().cipherSuites();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ApplicationGatewaySslProtocol minProtocolVersion() {
        return this.innerModel().minProtocolVersion();
    }

    public ApplicationGatewaySslPredefinedPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
