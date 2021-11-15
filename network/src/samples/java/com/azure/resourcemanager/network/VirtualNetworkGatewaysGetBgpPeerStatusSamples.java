// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGateways GetBgpPeerStatus. */
public final class VirtualNetworkGatewaysGetBgpPeerStatusSamples {
    /**
     * Sample code: GetVirtualNetworkGatewayBGPPeerStatus.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getVirtualNetworkGatewayBGPPeerStatus(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualNetworkGateways().getBgpPeerStatus("rg1", "vpngw", null, Context.NONE);
    }
}
