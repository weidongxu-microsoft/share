// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.VpnConnectionPacketCaptureStartParameters;
import java.util.Arrays;

/** Samples for VpnConnections StartPacketCapture. */
public final class VpnConnectionsStartPacketCaptureSamples {
    /**
     * Sample code: Start packet capture on vpn connection with filter.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void startPacketCaptureOnVpnConnectionWithFilter(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .vpnConnections()
            .startPacketCapture(
                "rg1",
                "gateway1",
                "vpnConnection1",
                new VpnConnectionPacketCaptureStartParameters()
                    .withFilterData(
                        "{'TracingFlags': 11,'MaxPacketBufferSize': 120,'MaxFileSize': 200,'Filters':"
                            + " [{'SourceSubnets': ['20.1.1.0/24'],'DestinationSubnets': ['10.1.1.0/24'],'SourcePort':"
                            + " [500],'DestinationPort': [4500],'Protocol': 6,'TcpFlags':"
                            + " 16,'CaptureSingleDirectionTrafficOnly': true}]}")
                    .withLinkConnectionNames(Arrays.asList("siteLink1", "siteLink2")),
                Context.NONE);
    }

    /**
     * Sample code: Start packet capture on vpn connection without filter.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void startPacketCaptureOnVpnConnectionWithoutFilter(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .vpnConnections()
            .startPacketCapture(
                "rg1",
                "gateway1",
                "vpnConnection1",
                new VpnConnectionPacketCaptureStartParameters()
                    .withLinkConnectionNames(Arrays.asList("siteLink1", "siteLink2")),
                Context.NONE);
    }
}
