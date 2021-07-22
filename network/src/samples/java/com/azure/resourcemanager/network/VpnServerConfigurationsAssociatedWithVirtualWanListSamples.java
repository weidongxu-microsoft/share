// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VpnServerConfigurationsAssociatedWithVirtualWan List. */
public final class VpnServerConfigurationsAssociatedWithVirtualWanListSamples {
    /**
     * Sample code: GetVirtualWanVpnServerConfigurations.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getVirtualWanVpnServerConfigurations(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.vpnServerConfigurationsAssociatedWithVirtualWans().list("rg1", "wan1", Context.NONE);
    }
}