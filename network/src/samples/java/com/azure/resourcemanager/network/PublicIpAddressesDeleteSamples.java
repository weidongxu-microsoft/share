// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for PublicIpAddresses Delete. */
public final class PublicIpAddressesDeleteSamples {
    /**
     * Sample code: Delete public IP address.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deletePublicIPAddress(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.publicIpAddresses().delete("rg1", "test-ip", Context.NONE);
    }
}
