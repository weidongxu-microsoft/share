// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.resourcemanager.compute.fluent.models.DiskRestorePointInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of DiskRestorePoint. */
public interface DiskRestorePoint {
    /**
     * Gets the id property: Resource Id.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: Resource name.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the timeCreated property: The timestamp of restorePoint creation.
     *
     * @return the timeCreated value.
     */
    OffsetDateTime timeCreated();

    /**
     * Gets the sourceResourceId property: arm id of source disk.
     *
     * @return the sourceResourceId value.
     */
    String sourceResourceId();

    /**
     * Gets the osType property: The Operating System type.
     *
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * Gets the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     *
     * @return the hyperVGeneration value.
     */
    HyperVGeneration hyperVGeneration();

    /**
     * Gets the purchasePlan property: Purchase plan information for the the image from which the OS disk was created.
     *
     * @return the purchasePlan value.
     */
    PurchasePlanAutoGenerated purchasePlan();

    /**
     * Gets the familyId property: id of the backing snapshot's MIS family.
     *
     * @return the familyId value.
     */
    String familyId();

    /**
     * Gets the sourceUniqueId property: unique incarnation id of the source disk.
     *
     * @return the sourceUniqueId value.
     */
    String sourceUniqueId();

    /**
     * Gets the encryption property: Encryption property can be used to encrypt data at rest with customer managed keys
     * or platform managed keys.
     *
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * Gets the supportsHibernation property: Indicates the OS on a disk supports hibernation.
     *
     * @return the supportsHibernation value.
     */
    Boolean supportsHibernation();

    /**
     * Gets the inner com.azure.resourcemanager.compute.fluent.models.DiskRestorePointInner object.
     *
     * @return the inner object.
     */
    DiskRestorePointInner innerModel();
}
