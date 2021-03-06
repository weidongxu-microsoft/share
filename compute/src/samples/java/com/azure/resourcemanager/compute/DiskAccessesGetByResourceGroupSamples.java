// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for DiskAccesses GetByResourceGroup. */
public final class DiskAccessesGetByResourceGroupSamples {
    /**
     * Sample code: Get information about a disk access resource.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void getInformationAboutADiskAccessResource(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.diskAccesses().getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", Context.NONE);
    }

    /**
     * Sample code: Get information about a disk access resource with private endpoints.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void getInformationAboutADiskAccessResourceWithPrivateEndpoints(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.diskAccesses().getByResourceGroupWithResponse("myResourceGroup", "myDiskAccess", Context.NONE);
    }
}
