// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for AvailablePrivateEndpointTypes List. */
public final class AvailablePrivateEndpointTypesListSamples {
    /**
     * Sample code: Get available PrivateEndpoint types.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getAvailablePrivateEndpointTypes(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.availablePrivateEndpointTypes().list("regionName", Context.NONE);
    }
}