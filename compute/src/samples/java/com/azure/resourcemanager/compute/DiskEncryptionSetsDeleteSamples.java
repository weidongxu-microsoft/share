// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for DiskEncryptionSets Delete. */
public final class DiskEncryptionSetsDeleteSamples {
    /**
     * Sample code: Delete a disk encryption set.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void deleteADiskEncryptionSet(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.diskEncryptionSets().delete("myResourceGroup", "myDiskEncryptionSet", Context.NONE);
    }
}
