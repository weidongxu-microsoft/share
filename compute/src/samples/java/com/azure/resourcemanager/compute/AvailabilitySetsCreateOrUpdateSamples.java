// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

/** Samples for AvailabilitySets CreateOrUpdate. */
public final class AvailabilitySetsCreateOrUpdateSamples {
    /**
     * Sample code: Create an availability set.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void createAnAvailabilitySet(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .availabilitySets()
            .define("myAvailabilitySet")
            .withRegion("westus")
            .withExistingResourceGroup("myResourceGroup")
            .withPlatformUpdateDomainCount(20)
            .withPlatformFaultDomainCount(2)
            .create();
    }
}
