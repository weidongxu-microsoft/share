// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for PublicIpAddresses GetCloudServicePublicIpAddress. */
public final class PublicIpAddressesGetCloudServicePublicIpAddressSamples {
    /**
     * Sample code: GetVMSSPublicIP.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getVMSSPublicIP(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .publicIpAddresses()
            .getCloudServicePublicIpAddressWithResponse(
                "cs-tester", "cs1", "Test_VM_0", "nic1", "ip1", "pub1", null, Context.NONE);
    }
}
