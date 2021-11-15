// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for DscpConfiguration GetByResourceGroup. */
public final class DscpConfigurationGetByResourceGroupSamples {
    /**
     * Sample code: Get Dscp Configuration.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getDscpConfiguration(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.dscpConfigurations().getByResourceGroupWithResponse("rg1", "mydscpConfig", Context.NONE);
    }
}
