// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.resourcemanager.compute.models.Sku;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/** Samples for CapacityReservations CreateOrUpdate. */
public final class CapacityReservationsCreateOrUpdateSamples {
    /**
     * Sample code: Create or update a capacity reservation .
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void createOrUpdateACapacityReservation(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .capacityReservations()
            .define("myCapacityReservation")
            .withRegion("westus")
            .withExistingCapacityReservationGroup("myResourceGroup", "myCapacityReservationGroup")
            .withSku(new Sku().withName("Standard_DS1_v2").withCapacity(4L))
            .withTags(mapOf("department", "HR"))
            .withZones(Arrays.asList("1"))
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
