// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuitPeerings List. */
public final class ExpressRouteCircuitPeeringsListSamples {
    /**
     * Sample code: List ExpressRouteCircuit Peerings.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listExpressRouteCircuitPeerings(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.expressRouteCircuitPeerings().list("rg1", "circuitName", Context.NONE);
    }
}