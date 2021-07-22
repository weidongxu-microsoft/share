// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.AuthenticationMethod;
import com.azure.resourcemanager.network.models.P2SVpnProfileParameters;

/** Samples for P2SVpnGateways GenerateVpnProfile. */
public final class P2SVpnGatewaysGenerateVpnProfileSamples {
    /**
     * Sample code: GenerateP2SVpnGatewayVPNProfile.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void generateP2SVpnGatewayVPNProfile(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .p2SVpnGateways()
            .generateVpnProfile(
                "rg1",
                "p2sVpnGateway1",
                new P2SVpnProfileParameters().withAuthenticationMethod(AuthenticationMethod.EAPTLS),
                Context.NONE);
    }
}
