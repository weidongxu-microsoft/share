// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for ResourceSkus List. */
public final class ResourceSkusListSamples {
    /**
     * Sample code: Lists all available Resource SKUs.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listsAllAvailableResourceSKUs(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.resourceSkus().list(null, Context.NONE);
    }

    /**
     * Sample code: Lists all available Resource SKUs for the specified region.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listsAllAvailableResourceSKUsForTheSpecifiedRegion(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.resourceSkus().list("location eq 'westus'", Context.NONE);
    }
}