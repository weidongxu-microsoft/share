// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for HubVirtualNetworkConnections Get. */
public final class HubVirtualNetworkConnectionsGetSamples {
    /**
     * Sample code: HubVirtualNetworkConnectionGet.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void hubVirtualNetworkConnectionGet(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .hubVirtualNetworkConnections()
            .getWithResponse("rg1", "virtualHub1", "connection1", Context.NONE);
    }
}
