// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.resourcemanager.compute.fluent.models.RunCommandResultInner;
import java.util.List;

/** An immutable client-side representation of RunCommandResult. */
public interface RunCommandResult {
    /**
     * Gets the value property: Run command operation response.
     *
     * @return the value value.
     */
    List<InstanceViewStatus> value();

    /**
     * Gets the inner com.azure.resourcemanager.compute.fluent.models.RunCommandResultInner object.
     *
     * @return the inner object.
     */
    RunCommandResultInner innerModel();
}
