// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

/** Samples for NetworkWatchers CreateOrUpdate. */
public final class NetworkWatchersCreateOrUpdateSamples {
    /**
     * Sample code: Create network watcher.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createNetworkWatcher(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.networkWatchers().define("nw1").withRegion("eastus").withExistingResourceGroup("rg1").create();
    }
}