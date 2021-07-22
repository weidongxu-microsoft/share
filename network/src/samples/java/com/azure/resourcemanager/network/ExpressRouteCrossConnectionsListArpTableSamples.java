// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCrossConnections ListArpTable. */
public final class ExpressRouteCrossConnectionsListArpTableSamples {
    /**
     * Sample code: GetExpressRouteCrossConnectionsArpTable.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getExpressRouteCrossConnectionsArpTable(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .expressRouteCrossConnections()
            .listArpTable(
                "CrossConnection-SiliconValley", "<circuitServiceKey>", "AzurePrivatePeering", "primary", Context.NONE);
    }
}