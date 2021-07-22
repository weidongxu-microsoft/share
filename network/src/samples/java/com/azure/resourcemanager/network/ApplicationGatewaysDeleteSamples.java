// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways Delete. */
public final class ApplicationGatewaysDeleteSamples {
    /**
     * Sample code: Delete ApplicationGateway.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deleteApplicationGateway(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.applicationGateways().delete("rg1", "appgw", Context.NONE);
    }
}