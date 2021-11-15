// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.resourcemanager.compute.fluent.models.RunCommandDocumentInner;
import com.azure.resourcemanager.compute.models.OperatingSystemTypes;
import com.azure.resourcemanager.compute.models.RunCommandDocument;
import com.azure.resourcemanager.compute.models.RunCommandParameterDefinition;
import java.util.Collections;
import java.util.List;

public final class RunCommandDocumentImpl implements RunCommandDocument {
    private RunCommandDocumentInner innerObject;

    private final com.azure.resourcemanager.compute.ComputeManager serviceManager;

    RunCommandDocumentImpl(
        RunCommandDocumentInner innerObject, com.azure.resourcemanager.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String schema() {
        return this.innerModel().schema();
    }

    public String id() {
        return this.innerModel().id();
    }

    public OperatingSystemTypes osType() {
        return this.innerModel().osType();
    }

    public String label() {
        return this.innerModel().label();
    }

    public String description() {
        return this.innerModel().description();
    }

    public List<String> script() {
        List<String> inner = this.innerModel().script();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<RunCommandParameterDefinition> parameters() {
        List<RunCommandParameterDefinition> inner = this.innerModel().parameters();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public RunCommandDocumentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.ComputeManager manager() {
        return this.serviceManager;
    }
}
