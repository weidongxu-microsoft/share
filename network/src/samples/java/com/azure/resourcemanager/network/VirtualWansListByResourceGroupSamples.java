// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualWans ListByResourceGroup. */
public final class VirtualWansListByResourceGroupSamples {
    /**
     * Sample code: VirtualWANListByResourceGroup.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void virtualWANListByResourceGroup(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualWans().listByResourceGroup("rg1", Context.NONE);
    }
}
