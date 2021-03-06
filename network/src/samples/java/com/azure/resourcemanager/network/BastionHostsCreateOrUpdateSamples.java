// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.BastionHostIpConfiguration;
import java.util.Arrays;

/** Samples for BastionHosts CreateOrUpdate. */
public final class BastionHostsCreateOrUpdateSamples {
    /**
     * Sample code: Create Bastion Host.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createBastionHost(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .bastionHosts()
            .define("bastionhosttenant")
            .withRegion((String) null)
            .withExistingResourceGroup("rg1")
            .withIpConfigurations(
                Arrays
                    .asList(
                        new BastionHostIpConfiguration()
                            .withName("bastionHostIpConfiguration")
                            .withSubnet(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnet2/subnets/BastionHostSubnet"))
                            .withPublicIpAddress(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/publicIPAddresses/pipName"))))
            .create();
    }
}
