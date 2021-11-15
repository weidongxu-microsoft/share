// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for SharedGalleryImageVersions List. */
public final class SharedGalleryImageVersionsListSamples {
    /**
     * Sample code: Get a gallery.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void getAGallery(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .sharedGalleryImageVersions()
            .list("myLocation", "galleryUniqueName", "myGalleryImageName", null, Context.NONE);
    }
}
