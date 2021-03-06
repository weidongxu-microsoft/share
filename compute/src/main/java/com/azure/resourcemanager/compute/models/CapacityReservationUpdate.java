// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Specifies information about the capacity reservation. Only tags and sku.capacity can be updated. */
@JsonFlatten
@Fluent
public class CapacityReservationUpdate extends UpdateResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CapacityReservationUpdate.class);

    /*
     * SKU of the resource for which capacity needs be reserved. The SKU name
     * and capacity is required to be set. Currently VM Skus with the
     * capability called 'CapacityReservationSupported' set to true are
     * supported. Refer to List Microsoft.Compute SKUs in a region
     * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for
     * supported values.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * A unique id generated and assigned to the capacity reservation by the
     * platform which does not change throughout the lifetime of the resource.
     */
    @JsonProperty(value = "properties.reservationId", access = JsonProperty.Access.WRITE_ONLY)
    private String reservationId;

    /*
     * A list of all virtual machine resource ids that are associated with the
     * capacity reservation.
     */
    @JsonProperty(value = "properties.virtualMachinesAssociated", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResourceReadOnly> virtualMachinesAssociated;

    /*
     * The date time when the capacity reservation was last updated.
     */
    @JsonProperty(value = "properties.provisioningTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime provisioningTime;

    /*
     * The provisioning state, which only appears in the response.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The Capacity reservation instance view.
     */
    @JsonProperty(value = "properties.instanceView", access = JsonProperty.Access.WRITE_ONLY)
    private CapacityReservationInstanceView instanceView;

    /**
     * Get the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
     * required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are
     * supported. Refer to List Microsoft.Compute SKUs in a region
     * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
     * required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are
     * supported. Refer to List Microsoft.Compute SKUs in a region
     * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     *
     * @param sku the sku value to set.
     * @return the CapacityReservationUpdate object itself.
     */
    public CapacityReservationUpdate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the reservationId property: A unique id generated and assigned to the capacity reservation by the platform
     * which does not change throughout the lifetime of the resource.
     *
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Get the virtualMachinesAssociated property: A list of all virtual machine resource ids that are associated with
     * the capacity reservation.
     *
     * @return the virtualMachinesAssociated value.
     */
    public List<SubResourceReadOnly> virtualMachinesAssociated() {
        return this.virtualMachinesAssociated;
    }

    /**
     * Get the provisioningTime property: The date time when the capacity reservation was last updated.
     *
     * @return the provisioningTime value.
     */
    public OffsetDateTime provisioningTime() {
        return this.provisioningTime;
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the instanceView property: The Capacity reservation instance view.
     *
     * @return the instanceView value.
     */
    public CapacityReservationInstanceView instanceView() {
        return this.instanceView;
    }

    /** {@inheritDoc} */
    @Override
    public CapacityReservationUpdate withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (sku() != null) {
            sku().validate();
        }
        if (virtualMachinesAssociated() != null) {
            virtualMachinesAssociated().forEach(e -> e.validate());
        }
        if (instanceView() != null) {
            instanceView().validate();
        }
    }
}
