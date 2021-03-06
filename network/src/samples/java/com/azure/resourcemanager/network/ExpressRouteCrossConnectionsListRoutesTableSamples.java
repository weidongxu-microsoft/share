// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCrossConnections ListRoutesTable. */
public final class ExpressRouteCrossConnectionsListRoutesTableSamples {
    /**
     * Sample code: GetExpressRouteCrossConnectionsRouteTable.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getExpressRouteCrossConnectionsRouteTable(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .expressRouteCrossConnections()
            .listRoutesTable(
                "CrossConnection-SiliconValley", "<circuitServiceKey>", "AzurePrivatePeering", "primary", Context.NONE);
    }
}
