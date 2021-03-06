// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for AvailabilitySets List. */
public final class AvailabilitySetsListSamples {
    /**
     * Sample code: List availability sets in a subscription.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listAvailabilitySetsInASubscription(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.availabilitySets().list("virtualMachines\\$ref", Context.NONE);
    }
}
