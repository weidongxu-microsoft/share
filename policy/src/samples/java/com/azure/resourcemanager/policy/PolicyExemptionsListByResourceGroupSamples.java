// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy;

import com.azure.core.util.Context;

/** Samples for PolicyExemptions ListByResourceGroup. */
public final class PolicyExemptionsListByResourceGroupSamples {
    /**
     * Sample code: List policy exemptions that apply to a resource group.
     *
     * @param policyManager Entry point to PolicyManager. To manage and control access to your resources, you can define
     *     customized policies and assign them at a scope.
     */
    public static void listPolicyExemptionsThatApplyToAResourceGroup(
        com.azure.resourcemanager.policy.PolicyManager policyManager) {
        policyManager.policyExemptions().listByResourceGroup("TestResourceGroup", "atScope()", Context.NONE);
    }
}
