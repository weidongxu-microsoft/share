// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for AvailableResourceGroupDelegations List. */
public final class AvailableResourceGroupDelegationsListSamples {
    /**
     * Sample code: Get available delegations in the resource group.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getAvailableDelegationsInTheResourceGroup(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.availableResourceGroupDelegations().list("westcentralus", "rg1", Context.NONE);
    }
}
