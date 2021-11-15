// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for GalleryImages Delete. */
public final class GalleryImagesDeleteSamples {
    /**
     * Sample code: Delete a gallery image.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void deleteAGalleryImage(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.galleryImages().delete("myResourceGroup", "myGalleryName", "myGalleryImageName", Context.NONE);
    }
}
