// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.CheckPrivateLinkServiceVisibilityRequest;

/** Samples for PrivateLinkServices CheckPrivateLinkServiceVisibility. */
public final class PrivateLinkServicesCheckPrivateLinkServiceVisibilitySamples {
    /**
     * Sample code: Check private link service visibility.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void checkPrivateLinkServiceVisibility(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .privateLinkServices()
            .checkPrivateLinkServiceVisibility(
                "westus",
                new CheckPrivateLinkServiceVisibilityRequest()
                    .withPrivateLinkServiceAlias("mypls.00000000-0000-0000-0000-000000000000.azure.privatelinkservice"),
                Context.NONE);
    }
}
