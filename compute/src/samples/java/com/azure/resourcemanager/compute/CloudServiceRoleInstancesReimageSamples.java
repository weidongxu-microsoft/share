// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for CloudServiceRoleInstances Reimage. */
public final class CloudServiceRoleInstancesReimageSamples {
    /**
     * Sample code: Reimage Cloud Service Role Instance.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void reimageCloudServiceRoleInstance(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .cloudServiceRoleInstances()
            .reimage("{roleInstance-name}", "ConstosoRG", "{cs-name}", Context.NONE);
    }
}
