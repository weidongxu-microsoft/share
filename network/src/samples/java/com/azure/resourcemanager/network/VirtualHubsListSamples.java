// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualHubs List. */
public final class VirtualHubsListSamples {
    /**
     * Sample code: VirtualHubList.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void virtualHubList(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualHubs().list(Context.NONE);
    }
}