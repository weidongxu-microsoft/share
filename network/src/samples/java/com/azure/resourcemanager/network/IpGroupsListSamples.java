// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for IpGroups List. */
public final class IpGroupsListSamples {
    /**
     * Sample code: List_IpGroups.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listIpGroups(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.ipGroups().list(Context.NONE);
    }
}
