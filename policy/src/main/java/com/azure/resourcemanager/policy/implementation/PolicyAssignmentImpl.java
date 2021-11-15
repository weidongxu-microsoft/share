// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policy.fluent.models.PolicyAssignmentInner;
import com.azure.resourcemanager.policy.models.EnforcementMode;
import com.azure.resourcemanager.policy.models.Identity;
import com.azure.resourcemanager.policy.models.NonComplianceMessage;
import com.azure.resourcemanager.policy.models.ParameterValuesValue;
import com.azure.resourcemanager.policy.models.PolicyAssignment;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class PolicyAssignmentImpl implements PolicyAssignment, PolicyAssignment.Definition {
    private PolicyAssignmentInner innerObject;

    private final com.azure.resourcemanager.policy.PolicyManager serviceManager;

    PolicyAssignmentImpl(
        PolicyAssignmentInner innerObject, com.azure.resourcemanager.policy.PolicyManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Identity identity() {
        return this.innerModel().identity();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public String policyDefinitionId() {
        return this.innerModel().policyDefinitionId();
    }

    public String scope() {
        return this.innerModel().scope();
    }

    public List<String> notScopes() {
        List<String> inner = this.innerModel().notScopes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Map<String, ParameterValuesValue> parameters() {
        Map<String, ParameterValuesValue> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String description() {
        return this.innerModel().description();
    }

    public Object metadata() {
        return this.innerModel().metadata();
    }

    public EnforcementMode enforcementMode() {
        return this.innerModel().enforcementMode();
    }

    public List<NonComplianceMessage> nonComplianceMessages() {
        List<NonComplianceMessage> inner = this.innerModel().nonComplianceMessages();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public PolicyAssignmentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.policy.PolicyManager manager() {
        return this.serviceManager;
    }

    private String scope;

    private String policyAssignmentName;

    public PolicyAssignmentImpl withExistingScope(String scope) {
        this.scope = scope;
        return this;
    }

    public PolicyAssignment create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicyAssignments()
                .createWithResponse(scope, policyAssignmentName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public PolicyAssignment create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicyAssignments()
                .createWithResponse(scope, policyAssignmentName, this.innerModel(), context)
                .getValue();
        return this;
    }

    PolicyAssignmentImpl(String name, com.azure.resourcemanager.policy.PolicyManager serviceManager) {
        this.innerObject = new PolicyAssignmentInner();
        this.serviceManager = serviceManager;
        this.policyAssignmentName = name;
    }

    public PolicyAssignment refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicyAssignments()
                .getWithResponse(scope, policyAssignmentName, Context.NONE)
                .getValue();
        return this;
    }

    public PolicyAssignment refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPolicyAssignments()
                .getWithResponse(scope, policyAssignmentName, context)
                .getValue();
        return this;
    }

    public PolicyAssignmentImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PolicyAssignmentImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PolicyAssignmentImpl withIdentity(Identity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public PolicyAssignmentImpl withDisplayName(String displayName) {
        this.innerModel().withDisplayName(displayName);
        return this;
    }

    public PolicyAssignmentImpl withPolicyDefinitionId(String policyDefinitionId) {
        this.innerModel().withPolicyDefinitionId(policyDefinitionId);
        return this;
    }

    public PolicyAssignmentImpl withNotScopes(List<String> notScopes) {
        this.innerModel().withNotScopes(notScopes);
        return this;
    }

    public PolicyAssignmentImpl withParameters(Map<String, ParameterValuesValue> parameters) {
        this.innerModel().withParameters(parameters);
        return this;
    }

    public PolicyAssignmentImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public PolicyAssignmentImpl withMetadata(Object metadata) {
        this.innerModel().withMetadata(metadata);
        return this;
    }

    public PolicyAssignmentImpl withEnforcementMode(EnforcementMode enforcementMode) {
        this.innerModel().withEnforcementMode(enforcementMode);
        return this;
    }

    public PolicyAssignmentImpl withNonComplianceMessages(List<NonComplianceMessage> nonComplianceMessages) {
        this.innerModel().withNonComplianceMessages(nonComplianceMessages);
        return this;
    }
}
