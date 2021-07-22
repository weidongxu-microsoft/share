// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuits GetStats. */
public final class ExpressRouteCircuitsGetStatsSamples {
    /**
     * Sample code: Get ExpressRoute Circuit Traffic Stats.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getExpressRouteCircuitTrafficStats(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.expressRouteCircuits().getStatsWithResponse("rg1", "circuitName", Context.NONE);
    }
}
