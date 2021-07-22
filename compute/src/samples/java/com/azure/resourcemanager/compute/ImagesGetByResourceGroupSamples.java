// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for Images GetByResourceGroup. */
public final class ImagesGetByResourceGroupSamples {
    /**
     * Sample code: Get information about a virtual machine image.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void getInformationAboutAVirtualMachineImage(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.images().getByResourceGroupWithResponse("myResourceGroup", "myImage", null, Context.NONE);
    }
}
