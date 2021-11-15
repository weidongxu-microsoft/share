// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.resourcemanager.compute.models.ApiEntityReference;
import java.util.Arrays;

/** Samples for RestorePoints Create. */
public final class RestorePointsCreateSamples {
    /**
     * Sample code: Create a restore point.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void createARestorePoint(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .restorePoints()
            .define("rpName")
            .withExistingRestorePointCollection("myResourceGroup", "rpcName")
            .withExcludeDisks(
                Arrays
                    .asList(
                        new ApiEntityReference()
                            .withId(
                                "/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/disk123")))
            .create();
    }
}
