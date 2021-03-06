// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ExpressRouteLinks List. */
public final class ExpressRouteLinksListSamples {
    /**
     * Sample code: ExpressRouteLinkGet.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void expressRouteLinkGet(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.expressRouteLinks().list("rg1", "portName", Context.NONE);
    }
}
