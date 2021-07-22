// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for DiskAccesses ListPrivateEndpointConnections. */
public final class DiskAccessesListPrivateEndpointConnectionsSamples {
    /**
     * Sample code: Get information about a private endpoint connection under a disk access resource.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void getInformationAboutAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.diskAccesses().listPrivateEndpointConnections("myResourceGroup", "myDiskAccess", Context.NONE);
    }
}
