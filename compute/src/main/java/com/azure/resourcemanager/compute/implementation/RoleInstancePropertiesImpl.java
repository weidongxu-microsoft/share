// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.resourcemanager.compute.fluent.models.RoleInstancePropertiesInner;
import com.azure.resourcemanager.compute.fluent.models.RoleInstanceViewInner;
import com.azure.resourcemanager.compute.models.RoleInstanceNetworkProfile;
import com.azure.resourcemanager.compute.models.RoleInstanceProperties;
import com.azure.resourcemanager.compute.models.RoleInstanceView;

public final class RoleInstancePropertiesImpl implements RoleInstanceProperties {
    private RoleInstancePropertiesInner innerObject;

    private final com.azure.resourcemanager.compute.ComputeManager serviceManager;

    RoleInstancePropertiesImpl(
        RoleInstancePropertiesInner innerObject, com.azure.resourcemanager.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public RoleInstanceNetworkProfile networkProfile() {
        return this.innerModel().networkProfile();
    }

    public RoleInstanceView instanceView() {
        RoleInstanceViewInner inner = this.innerModel().instanceView();
        if (inner != null) {
            return new RoleInstanceViewImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RoleInstancePropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.ComputeManager manager() {
        return this.serviceManager;
    }
}
