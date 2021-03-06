// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

/** Samples for DdosProtectionPlans CreateOrUpdate. */
public final class DdosProtectionPlansCreateOrUpdateSamples {
    /**
     * Sample code: Create DDoS protection plan.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createDDoSProtectionPlan(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .ddosProtectionPlans()
            .define("test-plan")
            .withRegion("westus")
            .withExistingResourceGroup("rg1")
            .create();
    }
}
