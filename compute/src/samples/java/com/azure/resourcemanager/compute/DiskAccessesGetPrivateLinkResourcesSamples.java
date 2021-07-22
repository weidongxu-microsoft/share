// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for DiskAccesses GetPrivateLinkResources. */
public final class DiskAccessesGetPrivateLinkResourcesSamples {
    /**
     * Sample code: List all possible private link resources under disk access resource.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listAllPossiblePrivateLinkResourcesUnderDiskAccessResource(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .diskAccesses()
            .getPrivateLinkResourcesWithResponse("myResourceGroup", "myDiskAccess", Context.NONE);
    }
}
