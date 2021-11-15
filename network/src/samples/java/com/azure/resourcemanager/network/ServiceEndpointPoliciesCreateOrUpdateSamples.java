// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.resourcemanager.network.fluent.models.ServiceEndpointPolicyDefinitionInner;
import java.util.Arrays;

/** Samples for ServiceEndpointPolicies CreateOrUpdate. */
public final class ServiceEndpointPoliciesCreateOrUpdateSamples {
    /**
     * Sample code: Create service endpoint policy.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createServiceEndpointPolicy(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .serviceEndpointPolicies()
            .define("testPolicy")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .create();
    }

    /**
     * Sample code: Create service endpoint policy with definition.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createServiceEndpointPolicyWithDefinition(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .serviceEndpointPolicies()
            .define("testPolicy")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .withServiceEndpointPolicyDefinitions(
                Arrays
                    .asList(
                        new ServiceEndpointPolicyDefinitionInner()
                            .withName("StorageServiceEndpointPolicyDefinition")
                            .withDescription("Storage Service EndpointPolicy Definition")
                            .withService("Microsoft.Storage")
                            .withServiceResources(
                                Arrays
                                    .asList(
                                        "/subscriptions/subid1",
                                        "/subscriptions/subid1/resourceGroups/storageRg",
                                        "/subscriptions/subid1/resourceGroups/storageRg/providers/Microsoft.Storage/storageAccounts/stAccount"))))
            .create();
    }
}
