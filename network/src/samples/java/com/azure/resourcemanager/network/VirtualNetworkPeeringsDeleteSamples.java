// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkPeerings Delete. */
public final class VirtualNetworkPeeringsDeleteSamples {
    /**
     * Sample code: Delete peering.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deletePeering(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualNetworkPeerings().delete("peerTest", "vnet1", "peer", Context.NONE);
    }
}