// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.VpnServerConfiguration;
import java.util.HashMap;
import java.util.Map;

/** Samples for VpnServerConfigurations UpdateTags. */
public final class VpnServerConfigurationsUpdateTagsSamples {
    /**
     * Sample code: VpnServerConfigurationUpdate.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void vpnServerConfigurationUpdate(com.azure.resourcemanager.network.NetworkManager networkManager) {
        VpnServerConfiguration resource =
            networkManager
                .vpnServerConfigurations()
                .getByResourceGroupWithResponse("rg1", "vpnServerConfiguration1", Context.NONE)
                .getValue();
        resource.update().withTags(mapOf("key1", "value1", "key2", "value2")).apply();
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
