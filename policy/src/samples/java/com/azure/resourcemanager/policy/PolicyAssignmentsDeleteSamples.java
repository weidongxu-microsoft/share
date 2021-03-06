// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy;

import com.azure.core.util.Context;

/** Samples for PolicyAssignments Delete. */
public final class PolicyAssignmentsDeleteSamples {
    /**
     * Sample code: Delete a policy assignment.
     *
     * @param policyManager Entry point to PolicyManager. To manage and control access to your resources, you can define
     *     customized policies and assign them at a scope.
     */
    public static void deleteAPolicyAssignment(com.azure.resourcemanager.policy.PolicyManager policyManager) {
        policyManager
            .policyAssignments()
            .deleteWithResponse("subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2", "EnforceNaming", Context.NONE);
    }
}
