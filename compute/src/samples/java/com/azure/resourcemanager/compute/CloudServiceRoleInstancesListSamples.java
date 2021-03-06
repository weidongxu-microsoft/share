// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for CloudServiceRoleInstances List. */
public final class CloudServiceRoleInstancesListSamples {
    /**
     * Sample code: List Role Instances in a Cloud Service.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listRoleInstancesInACloudService(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.cloudServiceRoleInstances().list("ConstosoRG", "{cs-name}", null, Context.NONE);
    }
}
