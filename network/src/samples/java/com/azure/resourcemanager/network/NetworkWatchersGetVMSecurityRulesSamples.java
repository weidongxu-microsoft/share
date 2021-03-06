// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.SecurityGroupViewParameters;

/** Samples for NetworkWatchers GetVMSecurityRules. */
public final class NetworkWatchersGetVMSecurityRulesSamples {
    /**
     * Sample code: Get security group view.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getSecurityGroupView(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .networkWatchers()
            .getVMSecurityRules(
                "rg1",
                "nw1",
                new SecurityGroupViewParameters()
                    .withTargetResourceId(
                        "/subscriptions/subid/resourceGroups/rg2/providers/Microsoft.Compute/virtualMachines/vm1"),
                Context.NONE);
    }
}
