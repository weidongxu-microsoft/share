// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for AzureFirewallFqdnTags List. */
public final class AzureFirewallFqdnTagsListSamples {
    /**
     * Sample code: List all Azure Firewall FQDN Tags for a given subscription.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listAllAzureFirewallFQDNTagsForAGivenSubscription(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.azureFirewallFqdnTags().list(Context.NONE);
    }
}
