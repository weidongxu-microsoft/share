// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for LoadBalancerProbes List. */
public final class LoadBalancerProbesListSamples {
    /**
     * Sample code: LoadBalancerProbeList.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void loadBalancerProbeList(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.loadBalancerProbes().list("testrg", "lb", Context.NONE);
    }
}
