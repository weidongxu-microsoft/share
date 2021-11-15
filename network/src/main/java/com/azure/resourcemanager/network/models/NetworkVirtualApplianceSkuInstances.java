// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** List of available Sku and instances. */
@Immutable
public final class NetworkVirtualApplianceSkuInstances {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkVirtualApplianceSkuInstances.class);

    /*
     * Scale Unit.
     */
    @JsonProperty(value = "scaleUnit", access = JsonProperty.Access.WRITE_ONLY)
    private String scaleUnit;

    /*
     * Instance Count.
     */
    @JsonProperty(value = "instanceCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer instanceCount;

    /**
     * Get the scaleUnit property: Scale Unit.
     *
     * @return the scaleUnit value.
     */
    public String scaleUnit() {
        return this.scaleUnit;
    }

    /**
     * Get the instanceCount property: Instance Count.
     *
     * @return the instanceCount value.
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
