// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for AzureFirewalls List. */
public final class AzureFirewallsListSamples {
    /**
     * Sample code: List all Azure Firewalls for a given subscription.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listAllAzureFirewallsForAGivenSubscription(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.azureFirewalls().list(Context.NONE);
    }
}
