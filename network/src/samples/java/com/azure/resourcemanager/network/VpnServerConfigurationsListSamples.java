// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VpnServerConfigurations List. */
public final class VpnServerConfigurationsListSamples {
    /**
     * Sample code: VpnServerConfigurationList.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void vpnServerConfigurationList(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.vpnServerConfigurations().list(Context.NONE);
    }
}
