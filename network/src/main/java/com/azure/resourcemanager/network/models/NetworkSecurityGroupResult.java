// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Network configuration diagnostic result corresponded provided traffic query. */
@Fluent
public final class NetworkSecurityGroupResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkSecurityGroupResult.class);

    /*
     * The network traffic is allowed or denied.
     */
    @JsonProperty(value = "securityRuleAccessResult")
    private SecurityRuleAccess securityRuleAccessResult;

    /*
     * List of results network security groups diagnostic.
     */
    @JsonProperty(value = "evaluatedNetworkSecurityGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<EvaluatedNetworkSecurityGroup> evaluatedNetworkSecurityGroups;

    /**
     * Get the securityRuleAccessResult property: The network traffic is allowed or denied.
     *
     * @return the securityRuleAccessResult value.
     */
    public SecurityRuleAccess securityRuleAccessResult() {
        return this.securityRuleAccessResult;
    }

    /**
     * Set the securityRuleAccessResult property: The network traffic is allowed or denied.
     *
     * @param securityRuleAccessResult the securityRuleAccessResult value to set.
     * @return the NetworkSecurityGroupResult object itself.
     */
    public NetworkSecurityGroupResult withSecurityRuleAccessResult(SecurityRuleAccess securityRuleAccessResult) {
        this.securityRuleAccessResult = securityRuleAccessResult;
        return this;
    }

    /**
     * Get the evaluatedNetworkSecurityGroups property: List of results network security groups diagnostic.
     *
     * @return the evaluatedNetworkSecurityGroups value.
     */
    public List<EvaluatedNetworkSecurityGroup> evaluatedNetworkSecurityGroups() {
        return this.evaluatedNetworkSecurityGroups;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (evaluatedNetworkSecurityGroups() != null) {
            evaluatedNetworkSecurityGroups().forEach(e -> e.validate());
        }
    }
}