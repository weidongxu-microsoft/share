// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for SecurityRules Get. */
public final class SecurityRulesGetSamples {
    /**
     * Sample code: Get network security rule in network security group.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getNetworkSecurityRuleInNetworkSecurityGroup(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.securityRules().getWithResponse("rg1", "testnsg", "rule1", Context.NONE);
    }
}