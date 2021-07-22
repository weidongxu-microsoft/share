// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.resourcemanager.network.models.IpVersion;
import com.azure.resourcemanager.network.models.PublicIpPrefixSku;
import com.azure.resourcemanager.network.models.PublicIpPrefixSkuName;
import com.azure.resourcemanager.network.models.PublicIpPrefixSkuTier;

/** Samples for PublicIpPrefixes CreateOrUpdate. */
public final class PublicIpPrefixesCreateOrUpdateSamples {
    /**
     * Sample code: Create public IP prefix defaults.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createPublicIPPrefixDefaults(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .publicIpPrefixes()
            .define("test-ipprefix")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .withSku(new PublicIpPrefixSku().withName(PublicIpPrefixSkuName.STANDARD))
            .withPrefixLength(30)
            .create();
    }

    /**
     * Sample code: Create public IP prefix allocation method.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createPublicIPPrefixAllocationMethod(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .publicIpPrefixes()
            .define("test-ipprefix")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .withSku(
                new PublicIpPrefixSku()
                    .withName(PublicIpPrefixSkuName.STANDARD)
                    .withTier(PublicIpPrefixSkuTier.REGIONAL))
            .withPublicIpAddressVersion(IpVersion.IPV4)
            .withPrefixLength(30)
            .create();
    }
}
