// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for CloudServices ListByResourceGroup. */
public final class CloudServicesListByResourceGroupSamples {
    /**
     * Sample code: List Cloud Services in a Resource Group.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listCloudServicesInAResourceGroup(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.cloudServices().listByResourceGroup("ConstosoRG", Context.NONE);
    }
}