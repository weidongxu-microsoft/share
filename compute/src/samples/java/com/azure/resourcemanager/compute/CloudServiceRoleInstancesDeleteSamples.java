// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for CloudServiceRoleInstances Delete. */
public final class CloudServiceRoleInstancesDeleteSamples {
    /**
     * Sample code: Delete Cloud Service Role Instance.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void deleteCloudServiceRoleInstance(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .cloudServiceRoleInstances()
            .delete("{roleInstance-name}", "ConstosoRG", "{cs-name}", Context.NONE);
    }
}