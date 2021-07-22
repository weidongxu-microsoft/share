// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for Galleries Delete. */
public final class GalleriesDeleteSamples {
    /**
     * Sample code: Delete a gallery.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void deleteAGallery(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.galleries().delete("myResourceGroup", "myGalleryName", Context.NONE);
    }
}