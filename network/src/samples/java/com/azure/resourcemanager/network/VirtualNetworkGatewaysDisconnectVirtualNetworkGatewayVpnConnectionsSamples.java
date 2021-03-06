// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.P2SVpnConnectionRequest;
import java.util.Arrays;

/** Samples for VirtualNetworkGateways DisconnectVirtualNetworkGatewayVpnConnections. */
public final class VirtualNetworkGatewaysDisconnectVirtualNetworkGatewayVpnConnectionsSamples {
    /**
     * Sample code: Disconnect VpnConnections from Virtual Network Gateway.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void disconnectVpnConnectionsFromVirtualNetworkGateway(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .virtualNetworkGateways()
            .disconnectVirtualNetworkGatewayVpnConnections(
                "vpn-gateway-test",
                "vpngateway",
                new P2SVpnConnectionRequest().withVpnConnectionIds(Arrays.asList("vpnconnId1", "vpnconnId2")),
                Context.NONE);
    }
}
