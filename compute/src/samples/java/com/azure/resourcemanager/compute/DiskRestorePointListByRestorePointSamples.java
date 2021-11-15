// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for DiskRestorePoint ListByRestorePoint. */
public final class DiskRestorePointListByRestorePointSamples {
    /**
     * Sample code: Get an incremental disk restorePoint resource.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void getAnIncrementalDiskRestorePointResource(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.diskRestorePoints().listByRestorePoint("myResourceGroup", "rpc", "vmrp", Context.NONE);
    }
}