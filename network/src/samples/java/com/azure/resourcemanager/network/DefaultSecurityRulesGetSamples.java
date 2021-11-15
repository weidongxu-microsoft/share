// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for DefaultSecurityRules Get. */
public final class DefaultSecurityRulesGetSamples {
    /**
     * Sample code: DefaultSecurityRuleGet.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void defaultSecurityRuleGet(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.defaultSecurityRules().getWithResponse("testrg", "nsg1", "AllowVnetInBound", Context.NONE);
    }
}
