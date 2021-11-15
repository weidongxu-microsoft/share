// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.RoleInstances;
import java.util.Arrays;

/** Samples for CloudServices Reimage. */
public final class CloudServicesReimageSamples {
    /**
     * Sample code: Reimage Cloud Service Role Instances.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void reimageCloudServiceRoleInstances(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .cloudServices()
            .reimage(
                "ConstosoRG",
                "{cs-name}",
                new RoleInstances().withRoleInstances(Arrays.asList("ContosoFrontend_IN_0", "ContosoBackend_IN_1")),
                Context.NONE);
    }
}