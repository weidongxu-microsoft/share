// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for RouteTables ListByResourceGroup. */
public final class RouteTablesListByResourceGroupSamples {
    /**
     * Sample code: List route tables in resource group.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listRouteTablesInResourceGroup(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.routeTables().listByResourceGroup("rg1", Context.NONE);
    }
}
