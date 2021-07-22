// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualWans GetByResourceGroup. */
public final class VirtualWansGetByResourceGroupSamples {
    /**
     * Sample code: VirtualWANGet.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void virtualWANGet(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualWans().getByResourceGroupWithResponse("rg1", "wan1", Context.NONE);
    }
}
