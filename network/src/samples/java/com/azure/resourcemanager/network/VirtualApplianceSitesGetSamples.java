// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualApplianceSites Get. */
public final class VirtualApplianceSitesGetSamples {
    /**
     * Sample code: GetNetwork Virtual Appliance Site.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getNetworkVirtualApplianceSite(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualApplianceSites().getWithResponse("rg1", "nva", "site1", Context.NONE);
    }
}