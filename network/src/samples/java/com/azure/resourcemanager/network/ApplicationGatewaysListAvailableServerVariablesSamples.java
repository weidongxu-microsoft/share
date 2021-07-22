// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ApplicationGateways ListAvailableServerVariables. */
public final class ApplicationGatewaysListAvailableServerVariablesSamples {
    /**
     * Sample code: Get Available Server Variables.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getAvailableServerVariables(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.applicationGateways().listAvailableServerVariablesWithResponse(Context.NONE);
    }
}