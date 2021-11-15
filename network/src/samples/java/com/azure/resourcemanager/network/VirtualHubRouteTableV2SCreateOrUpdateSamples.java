// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.VirtualHubRouteTableV2Inner;
import com.azure.resourcemanager.network.models.VirtualHubRouteV2;
import java.util.Arrays;

/** Samples for VirtualHubRouteTableV2S CreateOrUpdate. */
public final class VirtualHubRouteTableV2SCreateOrUpdateSamples {
    /**
     * Sample code: VirtualHubRouteTableV2Put.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void virtualHubRouteTableV2Put(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .virtualHubRouteTableV2S()
            .createOrUpdate(
                "rg1",
                "virtualHub1",
                "virtualHubRouteTable1a",
                new VirtualHubRouteTableV2Inner()
                    .withRoutes(
                        Arrays
                            .asList(
                                new VirtualHubRouteV2()
                                    .withDestinationType("CIDR")
                                    .withDestinations(Arrays.asList("20.10.0.0/16", "20.20.0.0/16"))
                                    .withNextHopType("IPAddress")
                                    .withNextHops(Arrays.asList("10.0.0.68")),
                                new VirtualHubRouteV2()
                                    .withDestinationType("CIDR")
                                    .withDestinations(Arrays.asList("0.0.0.0/0"))
                                    .withNextHopType("IPAddress")
                                    .withNextHops(Arrays.asList("10.0.0.68"))))
                    .withAttachedConnections(Arrays.asList("All_Vnets")),
                Context.NONE);
    }
}
