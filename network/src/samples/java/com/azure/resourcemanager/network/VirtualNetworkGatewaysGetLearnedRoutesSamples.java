// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGateways GetLearnedRoutes. */
public final class VirtualNetworkGatewaysGetLearnedRoutesSamples {
    /**
     * Sample code: GetVirtualNetworkGatewayLearnedRoutes.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getVirtualNetworkGatewayLearnedRoutes(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualNetworkGateways().getLearnedRoutes("rg1", "vpngw", Context.NONE);
    }
}