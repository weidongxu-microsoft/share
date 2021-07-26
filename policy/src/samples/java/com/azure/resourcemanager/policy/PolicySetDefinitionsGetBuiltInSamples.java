// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy;

import com.azure.core.util.Context;

/** Samples for PolicySetDefinitions GetBuiltIn. */
public final class PolicySetDefinitionsGetBuiltInSamples {
    /**
     * Sample code: Retrieve a built-in policy set definition.
     *
     * @param policyManager Entry point to PolicyManager. To manage and control access to your resources, you can define
     *     customized policies and assign them at a scope.
     */
    public static void retrieveABuiltInPolicySetDefinition(
        com.azure.resourcemanager.policy.PolicyManager policyManager) {
        policyManager
            .policySetDefinitions()
            .getBuiltInWithResponse("1f3afdf9-d0c9-4c3d-847f-89da613e70a8", Context.NONE);
    }
}
