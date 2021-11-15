// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.PeerExpressRouteCircuitConnectionInner;
import com.azure.resourcemanager.network.models.CircuitConnectionStatus;
import com.azure.resourcemanager.network.models.PeerExpressRouteCircuitConnection;
import com.azure.resourcemanager.network.models.ProvisioningState;

public final class PeerExpressRouteCircuitConnectionImpl implements PeerExpressRouteCircuitConnection {
    private PeerExpressRouteCircuitConnectionInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    PeerExpressRouteCircuitConnectionImpl(
        PeerExpressRouteCircuitConnectionInner innerObject,
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

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SubResource expressRouteCircuitPeering() {
        return this.innerModel().expressRouteCircuitPeering();
    }

    public SubResource peerExpressRouteCircuitPeering() {
        return this.innerModel().peerExpressRouteCircuitPeering();
    }

    public String addressPrefix() {
        return this.innerModel().addressPrefix();
    }

    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.innerModel().circuitConnectionStatus();
    }

    public String connectionName() {
        return this.innerModel().connectionName();
    }

    public String authResourceGuid() {
        return this.innerModel().authResourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PeerExpressRouteCircuitConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
