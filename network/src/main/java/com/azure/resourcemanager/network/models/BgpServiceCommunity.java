// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.resourcemanager.network.fluent.models.BgpServiceCommunityInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of BgpServiceCommunity. */
public interface BgpServiceCommunity {
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
     * Gets the serviceName property: The name of the bgp community. e.g. Skype.
     *
     * @return the serviceName value.
     */
    String serviceName();

    /**
     * Gets the bgpCommunities property: A list of bgp communities.
     *
     * @return the bgpCommunities value.
     */
    List<BgpCommunity> bgpCommunities();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the inner com.azure.resourcemanager.network.fluent.models.BgpServiceCommunityInner object.
     *
     * @return the inner object.
     */
    BgpServiceCommunityInner innerModel();
}