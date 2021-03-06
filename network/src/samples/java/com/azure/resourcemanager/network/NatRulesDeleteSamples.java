// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for NatRules Delete. */
public final class NatRulesDeleteSamples {
    /**
     * Sample code: NatRuleDelete.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void natRuleDelete(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.natRules().delete("rg1", "gateway1", "natRule1", Context.NONE);
    }
}
