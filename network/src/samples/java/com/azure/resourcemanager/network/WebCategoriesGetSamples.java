// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for WebCategories Get. */
public final class WebCategoriesGetSamples {
    /**
     * Sample code: Get Azure Web Category by name.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void getAzureWebCategoryByName(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.webCategories().getWithResponse("Arts", null, Context.NONE);
    }
}