// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Minimum and maximum number of scale units to deploy. */
@Fluent
public final class ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds {
    @JsonIgnore
    private final ClientLogger logger =
        new ClientLogger(ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds.class);

    /*
     * Minimum number of scale units deployed for ExpressRoute gateway.
     */
    @JsonProperty(value = "min")
    private Integer min;

    /*
     * Maximum number of scale units deployed for ExpressRoute gateway.
     */
    @JsonProperty(value = "max")
    private Integer max;

    /**
     * Get the min property: Minimum number of scale units deployed for ExpressRoute gateway.
     *
     * @return the min value.
     */
    public Integer min() {
        return this.min;
    }

    /**
     * Set the min property: Minimum number of scale units deployed for ExpressRoute gateway.
     *
     * @param min the min value to set.
     * @return the ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds object itself.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds withMin(Integer min) {
        this.min = min;
        return this;
    }

    /**
     * Get the max property: Maximum number of scale units deployed for ExpressRoute gateway.
     *
     * @return the max value.
     */
    public Integer max() {
        return this.max;
    }

    /**
     * Set the max property: Maximum number of scale units deployed for ExpressRoute gateway.
     *
     * @param max the max value to set.
     * @return the ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds object itself.
     */
    public ExpressRouteGatewayPropertiesAutoScaleConfigurationBounds withMax(Integer max) {
        this.max = max;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
