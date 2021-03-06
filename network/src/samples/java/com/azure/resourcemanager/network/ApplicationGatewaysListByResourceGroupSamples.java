// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways ListByResourceGroup. */
public final class ApplicationGatewaysListByResourceGroupSamples {
    /**
     * Sample code: Lists all application gateways in a resource group.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listsAllApplicationGatewaysInAResourceGroup(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.applicationGateways().listByResourceGroup("rg1", Context.NONE);
    }
}
