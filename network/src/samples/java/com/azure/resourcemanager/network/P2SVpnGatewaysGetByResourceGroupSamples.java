// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for P2SVpnGateways GetByResourceGroup. */
public final class P2SVpnGatewaysGetByResourceGroupSamples {
    /**
     * Sample code: P2SVpnGatewayGet.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void p2SVpnGatewayGet(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.p2SVpnGateways().getByResourceGroupWithResponse("rg1", "p2sVpnGateway1", Context.NONE);
    }
}
