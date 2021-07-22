// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for NetworkInterfaces ListEffectiveNetworkSecurityGroups. */
public final class NetworkInterfacesListEffectiveNetworkSecurityGroupsSamples {
    /**
     * Sample code: List network interface effective network security groups.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listNetworkInterfaceEffectiveNetworkSecurityGroups(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.networkInterfaces().listEffectiveNetworkSecurityGroups("rg1", "nic1", Context.NONE);
    }
}