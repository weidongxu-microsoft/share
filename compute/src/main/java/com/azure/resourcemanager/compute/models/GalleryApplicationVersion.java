// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.GalleryApplicationVersionInner;
import java.util.Map;

/** An immutable client-side representation of GalleryApplicationVersion. */
public interface GalleryApplicationVersion {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the publishingProfile property: The publishing profile of a gallery image version.
     *
     * @return the publishingProfile value.
     */
    GalleryApplicationVersionPublishingProfile publishingProfile();

    /**
     * Gets the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    GalleryApplicationVersionPropertiesProvisioningState provisioningState();

    /**
     * Gets the replicationStatus property: This is the replication status of the gallery image version.
     *
     * @return the replicationStatus value.
     */
    ReplicationStatus replicationStatus();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.compute.fluent.models.GalleryApplicationVersionInner object.
     *
     * @return the inner object.
     */
    GalleryApplicationVersionInner innerModel();

    /** The entirety of the GalleryApplicationVersion definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The GalleryApplicationVersion definition stages. */
    interface DefinitionStages {
        /** The first stage of the GalleryApplicationVersion definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the GalleryApplicationVersion definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the GalleryApplicationVersion definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, galleryName, galleryApplicationName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param galleryName The name of the Shared Application Gallery in which the Application Definition
             *     resides.
             * @param galleryApplicationName The name of the gallery Application Definition in which the Application
             *     Version is to be created.
             * @return the next definition stage.
             */
            WithCreate withExistingApplication(
                String resourceGroupName, String galleryName, String galleryApplicationName);
        }
        /**
         * The stage of the GalleryApplicationVersion definition which contains all the minimum required properties for
         * the resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate extends DefinitionStages.WithTags, DefinitionStages.WithPublishingProfile {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            GalleryApplicationVersion create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GalleryApplicationVersion create(Context context);
        }
        /** The stage of the GalleryApplicationVersion definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the GalleryApplicationVersion definition allowing to specify publishingProfile. */
        interface WithPublishingProfile {
            /**
             * Specifies the publishingProfile property: The publishing profile of a gallery image version..
             *
             * @param publishingProfile The publishing profile of a gallery image version.
             * @return the next definition stage.
             */
            WithCreate withPublishingProfile(GalleryApplicationVersionPublishingProfile publishingProfile);
        }
    }
    /**
     * Begins update for the GalleryApplicationVersion resource.
     *
     * @return the stage of resource update.
     */
    GalleryApplicationVersion.Update update();

    /** The template for GalleryApplicationVersion update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithPublishingProfile {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        GalleryApplicationVersion apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GalleryApplicationVersion apply(Context context);
    }
    /** The GalleryApplicationVersion update stages. */
    interface UpdateStages {
        /** The stage of the GalleryApplicationVersion update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the GalleryApplicationVersion update allowing to specify publishingProfile. */
        interface WithPublishingProfile {
            /**
             * Specifies the publishingProfile property: The publishing profile of a gallery image version..
             *
             * @param publishingProfile The publishing profile of a gallery image version.
             * @return the next definition stage.
             */
            Update withPublishingProfile(GalleryApplicationVersionPublishingProfile publishingProfile);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    GalleryApplicationVersion refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    GalleryApplicationVersion refresh(Context context);
}
