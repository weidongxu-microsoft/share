// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.SecurityProviderName;
import java.util.HashMap;
import java.util.Map;

/** Samples for SecurityPartnerProviders CreateOrUpdate. */
public final class SecurityPartnerProvidersCreateOrUpdateSamples {
    /**
     * Sample code: Create Security Partner Provider.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createSecurityPartnerProvider(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .securityPartnerProviders()
            .define("securityPartnerProvider")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "value1"))
            .withSecurityProviderName(SecurityProviderName.ZSCALER)
            .withVirtualHub(
                new SubResource()
                    .withId("/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualHubs/hub1"))
            .create();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}