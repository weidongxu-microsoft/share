// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ServiceTags List. */
public final class ServiceTagsListSamples {
    /**
     * Sample code: Get list of service tags.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getListOfServiceTags(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.serviceTags().listWithResponse("westcentralus", Context.NONE);
    }
}
