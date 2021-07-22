// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for BastionHosts Delete. */
public final class BastionHostsDeleteSamples {
    /**
     * Sample code: Delete Bastion Host.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deleteBastionHost(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.bastionHosts().delete("rg1", "bastionhosttenant", Context.NONE);
    }
}
