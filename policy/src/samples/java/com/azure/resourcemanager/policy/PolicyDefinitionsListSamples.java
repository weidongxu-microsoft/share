// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy;

import com.azure.core.util.Context;

/** Samples for PolicyDefinitions List. */
public final class PolicyDefinitionsListSamples {
    /**
     * Sample code: List policy definitions by subscription.
     *
     * @param policyManager Entry point to PolicyManager. To manage and control access to your resources, you can define
     *     customized policies and assign them at a scope.
     */
    public static void listPolicyDefinitionsBySubscription(
        com.azure.resourcemanager.policy.PolicyManager policyManager) {
        policyManager.policyDefinitions().list(null, null, Context.NONE);
    }
}
