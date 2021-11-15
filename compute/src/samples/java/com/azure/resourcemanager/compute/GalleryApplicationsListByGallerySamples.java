// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for GalleryApplications ListByGallery. */
public final class GalleryApplicationsListByGallerySamples {
    /**
     * Sample code: List gallery Applications in a gallery.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listGalleryApplicationsInAGallery(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.galleryApplications().listByGallery("myResourceGroup", "myGalleryName", Context.NONE);
    }
}
