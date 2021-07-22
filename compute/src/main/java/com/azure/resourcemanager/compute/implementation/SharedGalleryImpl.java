// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.resourcemanager.compute.fluent.models.SharedGalleryInner;
import com.azure.resourcemanager.compute.models.SharedGallery;

public final class SharedGalleryImpl implements SharedGallery {
    private SharedGalleryInner innerObject;

    private final com.azure.resourcemanager.compute.ComputeManager serviceManager;

    SharedGalleryImpl(SharedGalleryInner innerObject, com.azure.resourcemanager.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String location() {
        return this.innerModel().location();
    }

    public String uniqueId() {
        return this.innerModel().uniqueId();
    }

    public SharedGalleryInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.ComputeManager manager() {
        return this.serviceManager;
    }
}
