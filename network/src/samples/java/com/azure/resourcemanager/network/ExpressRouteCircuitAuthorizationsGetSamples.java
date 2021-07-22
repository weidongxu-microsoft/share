// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCircuitAuthorizations Get. */
public final class ExpressRouteCircuitAuthorizationsGetSamples {
    /**
     * Sample code: Get ExpressRouteCircuit Authorization.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getExpressRouteCircuitAuthorization(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .expressRouteCircuitAuthorizations()
            .getWithResponse("rg1", "circuitName", "authorizationName", Context.NONE);
    }
}
