// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for IpAllocations ListByResourceGroup. */
public final class IpAllocationsListByResourceGroupSamples {
    /**
     * Sample code: List IpAllocations in resource group.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listIpAllocationsInResourceGroup(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.ipAllocations().listByResourceGroup("rg1", Context.NONE);
    }
}
