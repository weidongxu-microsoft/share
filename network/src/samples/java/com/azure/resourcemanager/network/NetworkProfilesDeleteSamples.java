// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for NetworkProfiles Delete. */
public final class NetworkProfilesDeleteSamples {
    /**
     * Sample code: Delete network profile.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deleteNetworkProfile(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.networkProfiles().delete("rg1", "networkProfile1", Context.NONE);
    }
}
