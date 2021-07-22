// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VpnConnections Delete. */
public final class VpnConnectionsDeleteSamples {
    /**
     * Sample code: VpnConnectionDelete.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void vpnConnectionDelete(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.vpnConnections().delete("rg1", "gateway1", "vpnConnection1", Context.NONE);
    }
}
