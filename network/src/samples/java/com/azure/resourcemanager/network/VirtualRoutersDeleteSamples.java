// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for VirtualRouters Delete. */
public final class VirtualRoutersDeleteSamples {
    /**
     * Sample code: Delete VirtualRouter.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deleteVirtualRouter(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.virtualRouters().delete("rg1", "virtualRouter", Context.NONE);
    }
}
