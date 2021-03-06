// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ApplicationGatewayPrivateEndpointConnections List. */
public final class ApplicationGatewayPrivateEndpointConnectionsListSamples {
    /**
     * Sample code: Lists all private endpoint connections on application gateway.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listsAllPrivateEndpointConnectionsOnApplicationGateway(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.applicationGatewayPrivateEndpointConnections().list("rg1", "appgw", Context.NONE);
    }
}
