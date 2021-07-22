// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRoutePorts ListByResourceGroup. */
public final class ExpressRoutePortsListByResourceGroupSamples {
    /**
     * Sample code: ExpressRoutePortListByResourceGroup.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void expressRoutePortListByResourceGroup(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.expressRoutePorts().listByResourceGroup("rg1", Context.NONE);
    }
}
