// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.VpnPacketCaptureStartParameters;

/** Samples for VirtualNetworkGatewayConnections StartPacketCapture. */
public final class VirtualNetworkGatewayConnectionsStartPacketCaptureSamples {
    /**
     * Sample code: Start packet capture on virtual network gateway connection without filter.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void startPacketCaptureOnVirtualNetworkGatewayConnectionWithoutFilter(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualNetworkGatewayConnections().startPacketCapture("rg1", "vpngwcn1", null, Context.NONE);
    }

    /**
     * Sample code: Start packet capture on virtual network gateway connection with filter.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void startPacketCaptureOnVirtualNetworkGatewayConnectionWithFilter(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .virtualNetworkGatewayConnections()
            .startPacketCapture(
                "rg1",
                "vpngwcn1",
                new VpnPacketCaptureStartParameters()
                    .withFilterData(
                        "{'TracingFlags': 11,'MaxPacketBufferSize': 120,'MaxFileSize': 200,'Filters':"
                            + " [{'SourceSubnets': ['20.1.1.0/24'],'DestinationSubnets': ['10.1.1.0/24'],'SourcePort':"
                            + " [500],'DestinationPort': [4500],'Protocol': 6,'TcpFlags':"
                            + " 16,'CaptureSingleDirectionTrafficOnly': true}]}"),
                Context.NONE);
    }
}