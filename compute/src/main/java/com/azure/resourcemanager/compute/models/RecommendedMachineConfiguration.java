// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties describe the recommended machine configuration for this Image Definition. These properties are
 * updatable.
 */
@Fluent
public final class RecommendedMachineConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecommendedMachineConfiguration.class);

    /*
     * Describes the resource range.
     */
    @JsonProperty(value = "vCPUs")
    private ResourceRange vCPUs;

    /*
     * Describes the resource range.
     */
    @JsonProperty(value = "memory")
    private ResourceRange memory;

    /**
     * Get the vCPUs property: Describes the resource range.
     *
     * @return the vCPUs value.
     */
    public ResourceRange vCPUs() {
        return this.vCPUs;
    }

    /**
     * Set the vCPUs property: Describes the resource range.
     *
     * @param vCPUs the vCPUs value to set.
     * @return the RecommendedMachineConfiguration object itself.
     */
    public RecommendedMachineConfiguration withVCPUs(ResourceRange vCPUs) {
        this.vCPUs = vCPUs;
        return this;
    }

    /**
     * Get the memory property: Describes the resource range.
     *
     * @return the memory value.
     */
    public ResourceRange memory() {
        return this.memory;
    }

    /**
     * Set the memory property: Describes the resource range.
     *
     * @param memory the memory value to set.
     * @return the RecommendedMachineConfiguration object itself.
     */
    public RecommendedMachineConfiguration withMemory(ResourceRange memory) {
        this.memory = memory;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vCPUs() != null) {
            vCPUs().validate();
        }
        if (memory() != null) {
            memory().validate();
        }
    }
}