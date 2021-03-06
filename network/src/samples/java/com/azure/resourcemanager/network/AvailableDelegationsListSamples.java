// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for AvailableDelegations List. */
public final class AvailableDelegationsListSamples {
    /**
     * Sample code: Get available delegations.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getAvailableDelegations(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.availableDelegations().list("westcentralus", Context.NONE);
    }
}
