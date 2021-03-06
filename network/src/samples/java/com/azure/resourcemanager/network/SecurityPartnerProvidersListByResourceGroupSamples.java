// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for SecurityPartnerProviders ListByResourceGroup. */
public final class SecurityPartnerProvidersListByResourceGroupSamples {
    /**
     * Sample code: List all Security Partner Providers for a given resource group.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listAllSecurityPartnerProvidersForAGivenResourceGroup(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.securityPartnerProviders().listByResourceGroup("rg1", Context.NONE);
    }
}
