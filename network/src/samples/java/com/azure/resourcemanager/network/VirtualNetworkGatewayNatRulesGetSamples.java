// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualNetworkGatewayNatRules Get. */
public final class VirtualNetworkGatewayNatRulesGetSamples {
    /**
     * Sample code: VirtualNetworkGatewayNatRuleGet.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void virtualNetworkGatewayNatRuleGet(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualNetworkGatewayNatRules().getWithResponse("rg1", "gateway1", "natRule1", Context.NONE);
    }
}