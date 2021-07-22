// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.resourcemanager.network.fluent.models.UsageInner;

/** An immutable client-side representation of Usage. */
public interface Usage {
    /**
     * Gets the id property: Resource identifier.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the unit property: An enum describing the unit of measurement.
     *
     * @return the unit value.
     */
    UsageUnit unit();

    /**
     * Gets the currentValue property: The current value of the usage.
     *
     * @return the currentValue value.
     */
    long currentValue();

    /**
     * Gets the limit property: The limit of usage.
     *
     * @return the limit value.
     */
    long limit();

    /**
     * Gets the name property: The name of the type of usage.
     *
     * @return the name value.
     */
    UsageName name();

    /**
     * Gets the inner com.azure.resourcemanager.network.fluent.models.UsageInner object.
     *
     * @return the inner object.
     */
    UsageInner innerModel();
}