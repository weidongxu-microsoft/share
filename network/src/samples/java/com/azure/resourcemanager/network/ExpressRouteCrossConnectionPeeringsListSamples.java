// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCrossConnectionPeerings List. */
public final class ExpressRouteCrossConnectionPeeringsListSamples {
    /**
     * Sample code: ExpressRouteCrossConnectionBgpPeeringList.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void expressRouteCrossConnectionBgpPeeringList(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .expressRouteCrossConnectionPeerings()
            .list("CrossConnection-SiliconValley", "<circuitServiceKey>", Context.NONE);
    }
}