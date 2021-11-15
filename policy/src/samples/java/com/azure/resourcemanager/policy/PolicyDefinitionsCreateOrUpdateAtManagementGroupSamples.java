// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy;

import com.azure.core.management.serializer.SerializerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.policy.fluent.models.PolicyDefinitionInner;
import com.azure.resourcemanager.policy.models.ParameterDefinitionsValue;
import com.azure.resourcemanager.policy.models.ParameterDefinitionsValueMetadata;
import com.azure.resourcemanager.policy.models.ParameterType;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/** Samples for PolicyDefinitions CreateOrUpdateAtManagementGroup. */
public final class PolicyDefinitionsCreateOrUpdateAtManagementGroupSamples {
    /**
     * Sample code: Create or update a policy definition at management group level.
     *
     * @param policyManager Entry point to PolicyManager. To manage and control access to your resources, you can define
     *     customized policies and assign them at a scope.
     */
    public static void createOrUpdateAPolicyDefinitionAtManagementGroupLevel(
        com.azure.resourcemanager.policy.PolicyManager policyManager) throws IOException {
        policyManager
            .policyDefinitions()
            .createOrUpdateAtManagementGroupWithResponse(
                "ResourceNaming",
                "MyManagementGroup",
                new PolicyDefinitionInner()
                    .withMode("All")
                    .withDisplayName("Enforce resource naming convention")
                    .withDescription("Force resource names to begin with given 'prefix' and/or end with given 'suffix'")
                    .withPolicyRule(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize(
                                "{\"if\":{\"not\":{\"field\":\"name\",\"like\":\"[concat(parameters('prefix'), '*',"
                                    + " parameters('suffix'))]\"}},\"then\":{\"effect\":\"deny\"}}",
                                Object.class,
                                SerializerEncoding.JSON))
                    .withMetadata(
                        SerializerFactory
                            .createDefaultManagementSerializerAdapter()
                            .deserialize("{\"category\":\"Naming\"}", Object.class, SerializerEncoding.JSON))
                    .withParameters(
                        mapOf(
                            "prefix",
                            new ParameterDefinitionsValue()
                                .withType(ParameterType.STRING)
                                .withMetadata(
                                    new ParameterDefinitionsValueMetadata()
                                        .withDisplayName("Prefix")
                                        .withDescription("Resource name prefix")),
                            "suffix",
                            new ParameterDefinitionsValue()
                                .withType(ParameterType.STRING)
                                .withMetadata(
                                    new ParameterDefinitionsValueMetadata()
                                        .withDisplayName("Suffix")
                                        .withDescription("Resource name suffix")))),
                Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}