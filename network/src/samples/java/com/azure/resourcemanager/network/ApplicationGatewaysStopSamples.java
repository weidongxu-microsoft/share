// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways Stop. */
public final class ApplicationGatewaysStopSamples {
    /**
     * Sample code: Stop Application Gateway.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void stopApplicationGateway(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.applicationGateways().stop("rg1", "appgw", Context.NONE);
    }
}