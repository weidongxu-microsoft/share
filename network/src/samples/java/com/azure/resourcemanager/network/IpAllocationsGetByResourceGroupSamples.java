// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for IpAllocations GetByResourceGroup. */
public final class IpAllocationsGetByResourceGroupSamples {
    /**
     * Sample code: Get IpAllocation.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getIpAllocation(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.ipAllocations().getByResourceGroupWithResponse("rg1", "test-ipallocation", null, Context.NONE);
    }
}
