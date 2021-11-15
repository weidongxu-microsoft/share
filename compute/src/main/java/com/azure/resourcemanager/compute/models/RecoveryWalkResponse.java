// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.resourcemanager.compute.fluent.models.RecoveryWalkResponseInner;

/** An immutable client-side representation of RecoveryWalkResponse. */
public interface RecoveryWalkResponse {
    /**
     * Gets the walkPerformed property: Whether the recovery walk was performed.
     *
     * @return the walkPerformed value.
     */
    Boolean walkPerformed();

    /**
     * Gets the nextPlatformUpdateDomain property: The next update domain that needs to be walked. Null means walk
     * spanning all update domains has been completed.
     *
     * @return the nextPlatformUpdateDomain value.
     */
    Integer nextPlatformUpdateDomain();

    /**
     * Gets the inner com.azure.resourcemanager.compute.fluent.models.RecoveryWalkResponseInner object.
     *
     * @return the inner object.
     */
    RecoveryWalkResponseInner innerModel();
}