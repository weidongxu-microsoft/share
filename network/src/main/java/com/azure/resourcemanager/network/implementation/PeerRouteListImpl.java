// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.resourcemanager.network.fluent.models.PeerRouteListInner;
import com.azure.resourcemanager.network.models.PeerRoute;
import com.azure.resourcemanager.network.models.PeerRouteList;
import java.util.Collections;
import java.util.List;

public final class PeerRouteListImpl implements PeerRouteList {
    private PeerRouteListInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    PeerRouteListImpl(PeerRouteListInner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PeerRoute> value() {
        List<PeerRoute> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PeerRouteListInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
