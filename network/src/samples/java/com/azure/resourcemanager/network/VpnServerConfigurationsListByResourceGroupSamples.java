// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VpnServerConfigurations ListByResourceGroup. */
public final class VpnServerConfigurationsListByResourceGroupSamples {
    /**
     * Sample code: VpnServerConfigurationListByResourceGroup.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void vpnServerConfigurationListByResourceGroup(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.vpnServerConfigurations().listByResourceGroup("rg1", Context.NONE);
    }
}
