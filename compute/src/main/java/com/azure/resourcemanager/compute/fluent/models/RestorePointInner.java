// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.ApiEntityReference;
import com.azure.resourcemanager.compute.models.ConsistencyModeTypes;
import com.azure.resourcemanager.compute.models.RestorePointProvisioningDetails;
import com.azure.resourcemanager.compute.models.RestorePointSourceMetadata;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Restore Point details. */
@JsonFlatten
@Fluent
public class RestorePointInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RestorePointInner.class);

    /*
     * List of disk resource ids that the customer wishes to exclude from the
     * restore point. If no disks are specified, all disks will be included.
     */
    @JsonProperty(value = "properties.excludeDisks")
    private List<ApiEntityReference> excludeDisks;

    /*
     * Gets the details of the VM captured at the time of the restore point
     * creation.
     */
    @JsonProperty(value = "properties.sourceMetadata", access = JsonProperty.Access.WRITE_ONLY)
    private RestorePointSourceMetadata sourceMetadata;

    /*
     * Gets the provisioning state of the restore point.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * Gets the consistency mode for the restore point. Please refer to
     * https://aka.ms/RestorePoints for more details.
     */
    @JsonProperty(value = "properties.consistencyMode", access = JsonProperty.Access.WRITE_ONLY)
    private ConsistencyModeTypes consistencyMode;

    /*
     * Gets the provisioning details set by the server during Create restore
     * point operation.
     */
    @JsonProperty(value = "properties.provisioningDetails", access = JsonProperty.Access.WRITE_ONLY)
    private RestorePointProvisioningDetails provisioningDetails;

    /**
     * Get the excludeDisks property: List of disk resource ids that the customer wishes to exclude from the restore
     * point. If no disks are specified, all disks will be included.
     *
     * @return the excludeDisks value.
     */
    public List<ApiEntityReference> excludeDisks() {
        return this.excludeDisks;
    }

    /**
     * Set the excludeDisks property: List of disk resource ids that the customer wishes to exclude from the restore
     * point. If no disks are specified, all disks will be included.
     *
     * @param excludeDisks the excludeDisks value to set.
     * @return the RestorePointInner object itself.
     */
    public RestorePointInner withExcludeDisks(List<ApiEntityReference> excludeDisks) {
        this.excludeDisks = excludeDisks;
        return this;
    }

    /**
     * Get the sourceMetadata property: Gets the details of the VM captured at the time of the restore point creation.
     *
     * @return the sourceMetadata value.
     */
    public RestorePointSourceMetadata sourceMetadata() {
        return this.sourceMetadata;
    }

    /**
     * Get the provisioningState property: Gets the provisioning state of the restore point.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the consistencyMode property: Gets the consistency mode for the restore point. Please refer to
     * https://aka.ms/RestorePoints for more details.
     *
     * @return the consistencyMode value.
     */
    public ConsistencyModeTypes consistencyMode() {
        return this.consistencyMode;
    }

    /**
     * Get the provisioningDetails property: Gets the provisioning details set by the server during Create restore point
     * operation.
     *
     * @return the provisioningDetails value.
     */
    public RestorePointProvisioningDetails provisioningDetails() {
        return this.provisioningDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (excludeDisks() != null) {
            excludeDisks().forEach(e -> e.validate());
        }
        if (sourceMetadata() != null) {
            sourceMetadata().validate();
        }
        if (provisioningDetails() != null) {
            provisioningDetails().validate();
        }
    }
}
