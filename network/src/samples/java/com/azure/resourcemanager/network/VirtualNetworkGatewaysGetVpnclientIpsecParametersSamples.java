// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGateways GetVpnclientIpsecParameters. */
public final class VirtualNetworkGatewaysGetVpnclientIpsecParametersSamples {
    /**
     * Sample code: Get VirtualNetworkGateway VpnClientIpsecParameters.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getVirtualNetworkGatewayVpnClientIpsecParameters(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualNetworkGateways().getVpnclientIpsecParameters("rg1", "vpngw", Context.NONE);
    }
}
