// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.resourcemanager.compute.fluent.models.DiskRestorePointInner;
import com.azure.resourcemanager.compute.models.DiskRestorePoint;
import com.azure.resourcemanager.compute.models.Encryption;
import com.azure.resourcemanager.compute.models.HyperVGeneration;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.PurchasePlanAutoGenerated;
import java.time.OffsetDateTime;

public final class DiskRestorePointImpl implements DiskRestorePoint {
    private DiskRestorePointInner innerObject;

    private final com.azure.resourcemanager.compute.ComputeManager serviceManager;

    DiskRestorePointImpl(
        DiskRestorePointInner innerObject, com.azure.resourcemanager.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public OffsetDateTime timeCreated() {
        return this.innerModel().timeCreated();
    }

    public String sourceResourceId() {
        return this.innerModel().sourceResourceId();
    }

    public OperatingSystemTypes osType() {
        return this.innerModel().osType();
    }

    public HyperVGeneration hyperVGeneration() {
        return this.innerModel().hyperVGeneration();
    }

    public PurchasePlanAutoGenerated purchasePlan() {
        return this.innerModel().purchasePlan();
    }

    public String familyId() {
        return this.innerModel().familyId();
    }

    public String sourceUniqueId() {
        return this.innerModel().sourceUniqueId();
    }

    public Encryption encryption() {
        return this.innerModel().encryption();
    }

    public Boolean supportsHibernation() {
        return this.innerModel().supportsHibernation();
    }

    public DiskRestorePointInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.ComputeManager manager() {
        return this.serviceManager;
    }
}
