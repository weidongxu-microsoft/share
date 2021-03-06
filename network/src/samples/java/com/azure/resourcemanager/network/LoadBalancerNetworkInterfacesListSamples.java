// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for LoadBalancerNetworkInterfaces List. */
public final class LoadBalancerNetworkInterfacesListSamples {
    /**
     * Sample code: LoadBalancerNetworkInterfaceListVmss.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void loadBalancerNetworkInterfaceListVmss(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.loadBalancerNetworkInterfaces().list("testrg", "lb", Context.NONE);
    }

    /**
     * Sample code: LoadBalancerNetworkInterfaceListSimple.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void loadBalancerNetworkInterfaceListSimple(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.loadBalancerNetworkInterfaces().list("testrg", "lb", Context.NONE);
    }
}
