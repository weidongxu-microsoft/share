// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaceTapConfigurations Get. */
public final class NetworkInterfaceTapConfigurationsGetSamples {
    /**
     * Sample code: Get Network Interface Tap Configurations.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getNetworkInterfaceTapConfigurations(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .networkInterfaceTapConfigurations()
            .getWithResponse("testrg", "mynic", "tapconfiguration1", Context.NONE);
    }
}
