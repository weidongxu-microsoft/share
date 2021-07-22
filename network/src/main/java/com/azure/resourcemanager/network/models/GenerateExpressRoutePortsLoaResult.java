// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.resourcemanager.network.fluent.models.GenerateExpressRoutePortsLoaResultInner;

/** An immutable client-side representation of GenerateExpressRoutePortsLoaResult. */
public interface GenerateExpressRoutePortsLoaResult {
    /**
     * Gets the encodedContent property: The content as a base64 encoded string.
     *
     * @return the encodedContent value.
     */
    String encodedContent();

    /**
     * Gets the inner com.azure.resourcemanager.network.fluent.models.GenerateExpressRoutePortsLoaResultInner object.
     *
     * @return the inner object.
     */
    GenerateExpressRoutePortsLoaResultInner innerModel();
}