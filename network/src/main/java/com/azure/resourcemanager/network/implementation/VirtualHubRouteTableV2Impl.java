// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.resourcemanager.network.fluent.models.VirtualHubRouteTableV2Inner;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualHubRouteTableV2;
import com.azure.resourcemanager.network.models.VirtualHubRouteV2;
import java.util.Collections;
import java.util.List;

public final class VirtualHubRouteTableV2Impl implements VirtualHubRouteTableV2 {
    private VirtualHubRouteTableV2Inner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    VirtualHubRouteTableV2Impl(
        VirtualHubRouteTableV2Inner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public List<VirtualHubRouteV2> routes() {
        List<VirtualHubRouteV2> inner = this.innerModel().routes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> attachedConnections() {
        List<String> inner = this.innerModel().attachedConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public VirtualHubRouteTableV2Inner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
