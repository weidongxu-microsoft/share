// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for BastionHosts GetByResourceGroup. */
public final class BastionHostsGetByResourceGroupSamples {
    /**
     * Sample code: Get Bastion Host.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getBastionHost(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.bastionHosts().getByResourceGroupWithResponse("rg1", "bastionhosttenant'", Context.NONE);
    }
}