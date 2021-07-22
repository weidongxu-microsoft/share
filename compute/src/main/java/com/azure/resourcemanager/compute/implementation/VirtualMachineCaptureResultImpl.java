// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.resourcemanager.compute.fluent.models.VirtualMachineCaptureResultInner;
import com.azure.resourcemanager.compute.models.VirtualMachineCaptureResult;
import java.util.Collections;
import java.util.List;

public final class VirtualMachineCaptureResultImpl implements VirtualMachineCaptureResult {
    private VirtualMachineCaptureResultInner innerObject;

    private final com.azure.resourcemanager.compute.ComputeManager serviceManager;

    VirtualMachineCaptureResultImpl(
        VirtualMachineCaptureResultInner innerObject, com.azure.resourcemanager.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String schema() {
        return this.innerModel().schema();
    }

    public String contentVersion() {
        return this.innerModel().contentVersion();
    }

    public Object parameters() {
        return this.innerModel().parameters();
    }

    public List<Object> resources() {
        List<Object> inner = this.innerModel().resources();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualMachineCaptureResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.ComputeManager manager() {
        return this.serviceManager;
    }
}
