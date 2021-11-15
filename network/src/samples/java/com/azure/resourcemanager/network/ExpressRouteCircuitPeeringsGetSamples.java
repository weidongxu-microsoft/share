// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuitPeerings Get. */
public final class ExpressRouteCircuitPeeringsGetSamples {
    /**
     * Sample code: Get ExpressRouteCircuit Peering.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getExpressRouteCircuitPeering(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .expressRouteCircuitPeerings()
            .getWithResponse("rg1", "circuitName", "MicrosoftPeering", Context.NONE);
    }
}
