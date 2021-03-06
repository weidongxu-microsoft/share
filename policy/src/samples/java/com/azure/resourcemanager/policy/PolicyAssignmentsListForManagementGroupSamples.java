// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy;

import com.azure.core.util.Context;

/** Samples for PolicyAssignments ListForManagementGroup. */
public final class PolicyAssignmentsListForManagementGroupSamples {
    /**
     * Sample code: List policy assignments that apply to a management group.
     *
     * @param policyManager Entry point to PolicyManager. To manage and control access to your resources, you can define
     *     customized policies and assign them at a scope.
     */
    public static void listPolicyAssignmentsThatApplyToAManagementGroup(
        com.azure.resourcemanager.policy.PolicyManager policyManager) {
        policyManager
            .policyAssignments()
            .listForManagementGroup("TestManagementGroup", "atScope()", null, Context.NONE);
    }
}
