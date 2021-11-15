// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for RouteFilterRules Get. */
public final class RouteFilterRulesGetSamples {
    /**
     * Sample code: RouteFilterRuleGet.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void routeFilterRuleGet(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.routeFilterRules().getWithResponse("rg1", "filterName", "filterName", Context.NONE);
    }
}
