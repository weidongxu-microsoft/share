// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.policy.models.ExemptionCategory;
import java.io.IOException;
import java.util.Arrays;

/** Samples for PolicyExemptions CreateOrUpdate. */
public final class PolicyExemptionsCreateOrUpdateSamples {
    /**
     * Sample code: Create or update a policy exemption.
     *
     * @param policyManager Entry point to PolicyManager. To manage and control access to your resources, you can define
     *     customized policies and assign them at a scope.
     */
    public static void createOrUpdateAPolicyExemption(com.azure.resourcemanager.policy.PolicyManager policyManager)
        throws IOException {
        policyManager
            .policyExemptions()
            .define("DemoExpensiveVM")
            .withExistingScope("subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/resourceGroups/demoCluster")
            .withPolicyAssignmentId(
                "/subscriptions/ae640e6b-ba3e-4256-9d62-2993eecfa6f2/providers/Microsoft.Authorization/policyAssignments/CostManagement")
            .withExemptionCategory(ExemptionCategory.WAIVER)
            .withPolicyDefinitionReferenceIds(Arrays.asList("Limit_Skus"))
            .withDisplayName("Exempt demo cluster")
            .withDescription("Exempt demo cluster from limit sku")
            .withMetadata(
                SerializerFactory
                    .createDefaultManagementSerializerAdapter()
                    .deserialize(
                        "{\"reason\":\"Temporary exemption for a expensive VM demo\"}",
                        Object.class,
                        SerializerEncoding.JSON))
            .create();
    }
}