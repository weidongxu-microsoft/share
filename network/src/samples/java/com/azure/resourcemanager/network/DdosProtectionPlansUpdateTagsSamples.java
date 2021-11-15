// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.DdosProtectionPlan;
import java.util.HashMap;
import java.util.Map;

/** Samples for DdosProtectionPlans UpdateTags. */
public final class DdosProtectionPlansUpdateTagsSamples {
    /**
     * Sample code: DDoS protection plan Update tags.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void dDoSProtectionPlanUpdateTags(com.azure.resourcemanager.network.NetworkManager networkManager) {
        DdosProtectionPlan resource =
            networkManager
                .ddosProtectionPlans()
                .getByResourceGroupWithResponse("rg1", "test-plan", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("tag1", "value1", "tag2", "value2")).apply();
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