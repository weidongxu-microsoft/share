// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuits GetPeeringStats. */
public final class ExpressRouteCircuitsGetPeeringStatsSamples {
    /**
     * Sample code: Get ExpressRoute Circuit Peering Traffic Stats.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getExpressRouteCircuitPeeringTrafficStats(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .expressRouteCircuits()
            .getPeeringStatsWithResponse("rg1", "circuitName", "peeringName", Context.NONE);
    }
}
