// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for PublicIpAddresses ListCloudServicePublicIpAddresses. */
public final class PublicIpAddressesListCloudServicePublicIpAddressesSamples {
    /**
     * Sample code: ListVMSSPublicIP.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listVMSSPublicIP(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.publicIpAddresses().listCloudServicePublicIpAddresses("cs-tester", "cs1", Context.NONE);
    }
}
