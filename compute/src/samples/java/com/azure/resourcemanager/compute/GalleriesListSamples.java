// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for Galleries List. */
public final class GalleriesListSamples {
    /**
     * Sample code: List galleries in a subscription.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listGalleriesInASubscription(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.galleries().list(Context.NONE);
    }
}
