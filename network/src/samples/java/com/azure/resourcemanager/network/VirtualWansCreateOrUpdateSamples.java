// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import java.util.HashMap;
import java.util.Map;

/** Samples for VirtualWans CreateOrUpdate. */
public final class VirtualWansCreateOrUpdateSamples {
    /**
     * Sample code: VirtualWANCreate.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void virtualWANCreate(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .virtualWans()
            .define("wan1")
            .withRegion("West US")
            .withExistingResourceGroup("rg1")
            .withTags(mapOf("key1", "value1"))
            .withDisableVpnEncryption(false)
            .withTypePropertiesType("Basic")
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