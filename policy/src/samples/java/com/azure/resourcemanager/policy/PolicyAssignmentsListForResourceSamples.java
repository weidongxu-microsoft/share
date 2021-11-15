// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy;

import com.azure.core.util.Context;

/** Samples for PolicyAssignments ListForResource. */
public final class PolicyAssignmentsListForResourceSamples {
    /**
     * Sample code: List all policy assignments that apply to a resource.
     *
     * @param policyManager Entry point to PolicyManager. To manage and control access to your resources, you can define
     *     customized policies and assign them at a scope.
     */
    public static void listAllPolicyAssignmentsThatApplyToAResource(
        com.azure.resourcemanager.policy.PolicyManager policyManager) {
        policyManager
            .policyAssignments()
            .listForResource(
                "TestResourceGroup",
                "Microsoft.Compute",
                "virtualMachines/MyTestVm",
                "domainNames",
                "MyTestComputer.cloudapp.net",
                null,
                null,
                Context.NONE);
    }
}