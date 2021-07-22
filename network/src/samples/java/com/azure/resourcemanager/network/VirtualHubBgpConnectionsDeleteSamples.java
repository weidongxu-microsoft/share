// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualHubBgpConnections Delete. */
public final class VirtualHubBgpConnectionsDeleteSamples {
    /**
     * Sample code: VirtualHubRouteTableV2Delete.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void virtualHubRouteTableV2Delete(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualHubBgpConnections().delete("rg1", "hub1", "conn1", Context.NONE);
    }
}