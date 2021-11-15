// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for SecurityPartnerProviders Delete. */
public final class SecurityPartnerProvidersDeleteSamples {
    /**
     * Sample code: Delete Security Partner Provider.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deleteSecurityPartnerProvider(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.securityPartnerProviders().delete("rg1", "securityPartnerProvider", Context.NONE);
    }
}
