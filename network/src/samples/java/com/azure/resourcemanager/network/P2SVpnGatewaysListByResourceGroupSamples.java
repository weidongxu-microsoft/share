// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for P2SVpnGateways ListByResourceGroup. */
public final class P2SVpnGatewaysListByResourceGroupSamples {
    /**
     * Sample code: P2SVpnGatewayListByResourceGroup.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void p2SVpnGatewayListByResourceGroup(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.p2SVpnGateways().listByResourceGroup("rg1", Context.NONE);
    }
}