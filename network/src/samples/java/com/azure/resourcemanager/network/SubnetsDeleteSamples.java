// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for Subnets Delete. */
public final class SubnetsDeleteSamples {
    /**
     * Sample code: Delete subnet.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deleteSubnet(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.subnets().delete("subnet-test", "vnetname", "subnet1", Context.NONE);
    }
}