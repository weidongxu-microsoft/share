// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways ListAvailableSslOptions. */
public final class ApplicationGatewaysListAvailableSslOptionsSamples {
    /**
     * Sample code: Get Available Ssl Options.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getAvailableSslOptions(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.applicationGateways().listAvailableSslOptionsWithResponse(Context.NONE);
    }
}
