// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for Images List. */
public final class ImagesListSamples {
    /**
     * Sample code: List all virtual machine images in a subscription.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listAllVirtualMachineImagesInASubscription(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.images().list(Context.NONE);
    }
}