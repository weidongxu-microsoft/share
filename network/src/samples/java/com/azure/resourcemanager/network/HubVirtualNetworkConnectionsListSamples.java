// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for HubVirtualNetworkConnections List. */
public final class HubVirtualNetworkConnectionsListSamples {
    /**
     * Sample code: HubVirtualNetworkConnectionList.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void hubVirtualNetworkConnectionList(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.hubVirtualNetworkConnections().list("rg1", "virtualHub1", Context.NONE);
    }
}
