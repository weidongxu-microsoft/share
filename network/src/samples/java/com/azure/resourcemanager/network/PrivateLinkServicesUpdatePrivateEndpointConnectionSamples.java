// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.network.models.PrivateLinkServiceConnectionState;

/** Samples for PrivateLinkServices UpdatePrivateEndpointConnection. */
public final class PrivateLinkServicesUpdatePrivateEndpointConnectionSamples {
    /**
     * Sample code: approve or reject private end point connection for a private link service.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void approveOrRejectPrivateEndPointConnectionForAPrivateLinkService(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .privateLinkServices()
            .updatePrivateEndpointConnectionWithResponse(
                "rg1",
                "testPls",
                "testPlePeConnection",
                new PrivateEndpointConnectionInner()
                    .withName("testPlePeConnection")
                    .withPrivateLinkServiceConnectionState(
                        new PrivateLinkServiceConnectionState()
                            .withStatus("Approved")
                            .withDescription("approved it for some reason.")),
                Context.NONE);
    }
}