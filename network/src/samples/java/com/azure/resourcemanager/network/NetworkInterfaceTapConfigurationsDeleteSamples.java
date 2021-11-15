// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaceTapConfigurations Delete. */
public final class NetworkInterfaceTapConfigurationsDeleteSamples {
    /**
     * Sample code: Delete tap configuration.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deleteTapConfiguration(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .networkInterfaceTapConfigurations()
            .delete("rg1", "test-networkinterface", "test-tapconfiguration", Context.NONE);
    }
}
