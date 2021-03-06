// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.resourcemanager.compute.models.RestorePointCollectionSourceProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for RestorePointCollections CreateOrUpdate. */
public final class RestorePointCollectionsCreateOrUpdateSamples {
    /**
     * Sample code: Create or update a restore point collection.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void createOrUpdateARestorePointCollection(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .restorePointCollections()
            .define("myRpc")
            .withRegion("norwayeast")
            .withExistingResourceGroup("myResourceGroup")
            .withTags(mapOf("myTag1", "tagValue1"))
            .withSource(
                new RestorePointCollectionSourceProperties()
                    .withId(
                        "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/virtualMachines/myVM"))
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
