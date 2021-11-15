// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayAvailableWafRuleSetsResultInner;
import com.azure.resourcemanager.network.models.ApplicationGatewayAvailableWafRuleSetsResult;
import com.azure.resourcemanager.network.models.ApplicationGatewayFirewallRuleSet;
import java.util.Collections;
import java.util.List;

public final class ApplicationGatewayAvailableWafRuleSetsResultImpl
    implements ApplicationGatewayAvailableWafRuleSetsResult {
    private ApplicationGatewayAvailableWafRuleSetsResultInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    ApplicationGatewayAvailableWafRuleSetsResultImpl(
        ApplicationGatewayAvailableWafRuleSetsResultInner innerObject,
        com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ApplicationGatewayFirewallRuleSet> value() {
        List<ApplicationGatewayFirewallRuleSet> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ApplicationGatewayAvailableWafRuleSetsResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
