// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for InboundNatRules List. */
public final class InboundNatRulesListSamples {
    /**
     * Sample code: InboundNatRuleList.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void inboundNatRuleList(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.inboundNatRules().list("testrg", "lb1", Context.NONE);
    }
}
