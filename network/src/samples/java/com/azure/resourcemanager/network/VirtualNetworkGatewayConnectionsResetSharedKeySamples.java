// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.ConnectionResetSharedKeyInner;

/** Samples for VirtualNetworkGatewayConnections ResetSharedKey. */
public final class VirtualNetworkGatewayConnectionsResetSharedKeySamples {
    /**
     * Sample code: ResetVirtualNetworkGatewayConnectionSharedKey.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void resetVirtualNetworkGatewayConnectionSharedKey(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .virtualNetworkGatewayConnections()
            .resetSharedKey("rg1", "conn1", new ConnectionResetSharedKeyInner().withKeyLength(128), Context.NONE);
    }
}
