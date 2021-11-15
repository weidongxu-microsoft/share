// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for DiskRestorePoint RevokeAccess. */
public final class DiskRestorePointRevokeAccessSamples {
    /**
     * Sample code: Revokes access to a diskRestorePoint.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void revokesAccessToADiskRestorePoint(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .diskRestorePoints()
            .revokeAccess(
                "myResourceGroup",
                "rpc",
                "vmrp",
                "TestDisk45ceb03433006d1baee0_b70cd924-3362-4a80-93c2-9415eaa12745",
                Context.NONE);
    }
}