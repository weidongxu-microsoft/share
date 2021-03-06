// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.NatGatewaySku;
import com.azure.resourcemanager.network.models.NatGatewaySkuName;
import java.util.Arrays;

/** Samples for NatGateways CreateOrUpdate. */
public final class NatGatewaysCreateOrUpdateSamples {
    /**
     * Sample code: Create nat gateway.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createNatGateway(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .natGateways()
            .define("test-natgateway")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .withSku(new NatGatewaySku().withName(NatGatewaySkuName.STANDARD))
            .withPublicIpAddresses(
                Arrays
                    .asList(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/PublicIpAddress1")))
            .withPublicIpPrefixes(
                Arrays
                    .asList(
                        new SubResource()
                            .withId(
                                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPPrefixes/PublicIpPrefix1")))
            .create();
    }
}
