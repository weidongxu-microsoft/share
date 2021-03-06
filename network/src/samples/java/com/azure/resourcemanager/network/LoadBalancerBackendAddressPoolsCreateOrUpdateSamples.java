// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.BackendAddressPool;
import com.azure.resourcemanager.network.models.LoadBalancerBackendAddress;
import java.util.Arrays;

/** Samples for LoadBalancerBackendAddressPools CreateOrUpdate. */
public final class LoadBalancerBackendAddressPoolsCreateOrUpdateSamples {
    /**
     * Sample code: Update load balancer backend pool with backend addresses containing virtual network and IP address.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void updateLoadBalancerBackendPoolWithBackendAddressesContainingVirtualNetworkAndIPAddress(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        BackendAddressPool resource =
            networkManager
                .loadBalancerBackendAddressPools()
                .getWithResponse("testrg", "lb", "backend", Context.NONE)
                .getValue();
        resource
            .update()
            .withLoadBalancerBackendAddresses(
                Arrays
                    .asList(
                        new LoadBalancerBackendAddress()
                            .withName("address1")
                            .withVirtualNetwork(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb"))
                            .withIpAddress("10.0.0.4"),
                        new LoadBalancerBackendAddress()
                            .withName("address2")
                            .withVirtualNetwork(
                                new SubResource()
                                    .withId(
                                        "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/virtualNetworks/vnetlb"))
                            .withIpAddress("10.0.0.5")))
            .apply();
    }
}
