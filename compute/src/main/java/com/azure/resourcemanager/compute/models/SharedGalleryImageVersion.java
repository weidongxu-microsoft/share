// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.resourcemanager.compute.fluent.models.SharedGalleryImageVersionInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of SharedGalleryImageVersion. */
public interface SharedGalleryImageVersion {
    /**
     * Gets the name property: Resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the location property: Resource location.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the uniqueId property: The unique id of this shared gallery.
     *
     * @return the uniqueId value.
     */
    String uniqueId();

    /**
     * Gets the publishedDate property: The published date of the gallery image version Definition. This property can be
     * used for decommissioning purposes. This property is updatable.
     *
     * @return the publishedDate value.
     */
    OffsetDateTime publishedDate();

    /**
     * Gets the endOfLifeDate property: The end of life date of the gallery image version Definition. This property can
     * be used for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    OffsetDateTime endOfLifeDate();

    /**
     * Gets the inner com.azure.resourcemanager.compute.fluent.models.SharedGalleryImageVersionInner object.
     *
     * @return the inner object.
     */
    SharedGalleryImageVersionInner innerModel();
}