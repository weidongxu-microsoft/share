// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for SharedGalleryImageVersions Get. */
public final class SharedGalleryImageVersionsGetSamples {
    /**
     * Sample code: Get a gallery.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void getAGallery(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .sharedGalleryImageVersions()
            .getWithResponse(
                "myLocation", "galleryUniqueName", "myGalleryImageName", "myGalleryImageVersionName", Context.NONE);
    }
}
