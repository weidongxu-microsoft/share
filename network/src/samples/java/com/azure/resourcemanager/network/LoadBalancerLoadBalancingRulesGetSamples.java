// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for LoadBalancerLoadBalancingRules Get. */
public final class LoadBalancerLoadBalancingRulesGetSamples {
    /**
     * Sample code: LoadBalancerLoadBalancingRuleGet.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void loadBalancerLoadBalancingRuleGet(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.loadBalancerLoadBalancingRules().getWithResponse("testrg", "lb1", "rule1", Context.NONE);
    }
}
