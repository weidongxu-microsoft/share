// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ApplicationSecurityGroups Delete. */
public final class ApplicationSecurityGroupsDeleteSamples {
    /**
     * Sample code: Delete application security group.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deleteApplicationSecurityGroup(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.applicationSecurityGroups().delete("rg1", "test-asg", Context.NONE);
    }
}