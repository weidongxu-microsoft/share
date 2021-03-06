// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for Galleries ListByResourceGroup. */
public final class GalleriesListByResourceGroupSamples {
    /**
     * Sample code: List galleries in a resource group.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listGalleriesInAResourceGroup(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.galleries().listByResourceGroup("myResourceGroup", Context.NONE);
    }
}
