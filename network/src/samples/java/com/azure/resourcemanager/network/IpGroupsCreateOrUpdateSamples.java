// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for IpGroups CreateOrUpdate. */
public final class IpGroupsCreateOrUpdateSamples {
    /**
     * Sample code: CreateOrUpdate_IpGroups.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createOrUpdateIpGroups(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .ipGroups()
            .define("ipGroups1")
            .withRegion("West US")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("key1", "value1"))
            .withIpAddresses(Arrays.asList("13.64.39.16/32", "40.74.146.80/31", "40.74.147.32/28"))
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
