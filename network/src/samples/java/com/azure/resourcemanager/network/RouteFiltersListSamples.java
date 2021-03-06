// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for RouteFilters List. */
public final class RouteFiltersListSamples {
    /**
     * Sample code: RouteFilterList.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void routeFilterList(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.routeFilters().list(Context.NONE);
    }
}
