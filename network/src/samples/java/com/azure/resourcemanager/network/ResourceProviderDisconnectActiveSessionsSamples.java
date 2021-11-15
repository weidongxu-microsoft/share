// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.models.SessionIds;

/** Samples for ResourceProvider DisconnectActiveSessions. */
public final class ResourceProviderDisconnectActiveSessionsSamples {
    /**
     * Sample code: Deletes the specified active session.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deletesTheSpecifiedActiveSession(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .resourceProviders()
            .disconnectActiveSessions("rg1", "bastionhosttenant", new SessionIds(), Context.NONE);
    }
}