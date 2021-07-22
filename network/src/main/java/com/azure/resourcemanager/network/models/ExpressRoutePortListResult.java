// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.models.ExpressRoutePortInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for ListExpressRoutePorts API service call. */
@Fluent
public final class ExpressRoutePortListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRoutePortListResult.class);

    /*
     * A list of ExpressRoutePort resources.
     */
    @JsonProperty(value = "value")
    private List<ExpressRoutePortInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A list of ExpressRoutePort resources.
     *
     * @return the value value.
     */
    public List<ExpressRoutePortInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of ExpressRoutePort resources.
     *
     * @param value the value value to set.
     * @return the ExpressRoutePortListResult object itself.
     */
    public ExpressRoutePortListResult withValue(List<ExpressRoutePortInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ExpressRoutePortListResult object itself.
     */
    public ExpressRoutePortListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
