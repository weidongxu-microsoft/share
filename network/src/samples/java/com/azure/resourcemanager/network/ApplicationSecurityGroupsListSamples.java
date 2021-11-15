// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ApplicationSecurityGroups List. */
public final class ApplicationSecurityGroupsListSamples {
    /**
     * Sample code: List all application security groups.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void listAllApplicationSecurityGroups(
        com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.applicationSecurityGroups().list(Context.NONE);
    }
}