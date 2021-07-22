// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.GatewayRoute;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of virtual network gateway routes. */
@Fluent
public final class GatewayRouteListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(GatewayRouteListResultInner.class);

    /*
     * List of gateway routes.
     */
    @JsonProperty(value = "value")
    private List<GatewayRoute> value;

    /**
     * Get the value property: List of gateway routes.
     *
     * @return the value value.
     */
    public List<GatewayRoute> value() {
        return this.value;
    }

    /**
     * Set the value property: List of gateway routes.
     *
     * @param value the value value to set.
     * @return the GatewayRouteListResultInner object itself.
     */
    public GatewayRouteListResultInner withValue(List<GatewayRoute> value) {
        this.value = value;
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
