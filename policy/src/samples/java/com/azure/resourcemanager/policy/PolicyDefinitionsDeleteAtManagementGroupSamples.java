// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy;

import com.azure.core.util.Context;

/** Samples for PolicyDefinitions DeleteAtManagementGroup. */
public final class PolicyDefinitionsDeleteAtManagementGroupSamples {
    /**
     * Sample code: Delete a policy definition at management group level.
     *
     * @param policyManager Entry point to PolicyManager. To manage and control access to your resources, you can define
     *     customized policies and assign them at a scope.
     */
    public static void deleteAPolicyDefinitionAtManagementGroupLevel(
        com.azure.resourcemanager.policy.PolicyManager policyManager) {
        policyManager
            .policyDefinitions()
            .deleteAtManagementGroupWithResponse("ResourceNaming", "MyManagementGroup", Context.NONE);
    }
}
