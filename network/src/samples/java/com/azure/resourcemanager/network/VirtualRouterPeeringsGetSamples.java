// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualRouterPeerings Get. */
public final class VirtualRouterPeeringsGetSamples {
    /**
     * Sample code: Get Virtual Router Peering.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getVirtualRouterPeering(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualRouterPeerings().getWithResponse("rg1", "virtualRouter", "peering1", Context.NONE);
    }
}