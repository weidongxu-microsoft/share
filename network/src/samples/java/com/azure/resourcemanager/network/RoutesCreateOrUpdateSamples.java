// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.resourcemanager.network.models.RouteNextHopType;

/** Samples for Routes CreateOrUpdate. */
public final class RoutesCreateOrUpdateSamples {
    /**
     * Sample code: Create route.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createRoute(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .routes()
            .define("route1")
            .withExistingRouteTable("rg1", "testrt")
            .withAddressPrefix("10.0.3.0/24")
            .withNextHopType(RouteNextHopType.VIRTUAL_NETWORK_GATEWAY)
            .create();
    }
}
