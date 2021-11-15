// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteCrossConnectionPeerings Delete. */
public final class ExpressRouteCrossConnectionPeeringsDeleteSamples {
    /**
     * Sample code: DeleteExpressRouteCrossConnectionBgpPeering.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deleteExpressRouteCrossConnectionBgpPeering(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .expressRouteCrossConnectionPeerings()
            .delete("CrossConnection-SiliconValley", "<circuitServiceKey>", "AzurePrivatePeering", Context.NONE);
    }
}
