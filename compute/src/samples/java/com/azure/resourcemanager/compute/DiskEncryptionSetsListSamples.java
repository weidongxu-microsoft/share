// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for DiskEncryptionSets List. */
public final class DiskEncryptionSetsListSamples {
    /**
     * Sample code: List all disk encryption sets in a subscription.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listAllDiskEncryptionSetsInASubscription(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.diskEncryptionSets().list(Context.NONE);
    }
}
