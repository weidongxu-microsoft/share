// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.AvailableProvidersListParameters;
import java.util.Arrays;

/** Samples for NetworkWatchers ListAvailableProviders. */
public final class NetworkWatchersListAvailableProvidersSamples {
    /**
     * Sample code: Get Available Providers List.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getAvailableProvidersList(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .networkWatchers()
            .listAvailableProviders(
                "rg1",
                "nw1",
                new AvailableProvidersListParameters()
                    .withAzureLocations(Arrays.asList("West US"))
                    .withCountry("United States")
                    .withState("washington")
                    .withCity("seattle"),
                Context.NONE);
    }
}
