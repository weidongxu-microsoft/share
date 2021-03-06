// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.Direction;
import com.azure.resourcemanager.network.models.IpFlowProtocol;
import com.azure.resourcemanager.network.models.VerificationIpFlowParameters;

/** Samples for NetworkWatchers VerifyIpFlow. */
public final class NetworkWatchersVerifyIpFlowSamples {
    /**
     * Sample code: Ip flow verify.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void ipFlowVerify(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .networkWatchers()
            .verifyIpFlow(
                "rg1",
                "nw1",
                new VerificationIpFlowParameters()
                    .withTargetResourceId(
                        "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1")
                    .withDirection(Direction.OUTBOUND)
                    .withProtocol(IpFlowProtocol.TCP)
                    .withLocalPort("80")
                    .withRemotePort("80")
                    .withLocalIpAddress("10.2.0.4")
                    .withRemoteIpAddress("121.10.1.1"),
                Context.NONE);
    }
}
