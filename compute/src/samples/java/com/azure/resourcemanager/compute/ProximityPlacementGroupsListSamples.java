// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for ProximityPlacementGroups List. */
public final class ProximityPlacementGroupsListSamples {
    /**
     * Sample code: Create a proximity placement group.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void createAProximityPlacementGroup(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.proximityPlacementGroups().list(Context.NONE);
    }
}
