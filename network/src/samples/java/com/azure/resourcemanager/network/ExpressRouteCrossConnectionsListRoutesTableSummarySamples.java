// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCrossConnections ListRoutesTableSummary. */
public final class ExpressRouteCrossConnectionsListRoutesTableSummarySamples {
    /**
     * Sample code: GetExpressRouteCrossConnectionsRouteTableSummary.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getExpressRouteCrossConnectionsRouteTableSummary(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .expressRouteCrossConnections()
            .listRoutesTableSummary(
                "CrossConnection-SiliconValley", "<circuitServiceKey>", "AzurePrivatePeering", "primary", Context.NONE);
    }
}