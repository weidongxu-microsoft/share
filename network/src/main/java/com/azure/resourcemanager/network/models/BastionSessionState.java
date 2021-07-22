// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.resourcemanager.network.fluent.models.BastionSessionStateInner;

/** An immutable client-side representation of BastionSessionState. */
public interface BastionSessionState {
    /**
     * Gets the sessionId property: A unique id for the session.
     *
     * @return the sessionId value.
     */
    String sessionId();

    /**
     * Gets the message property: Used for extra information.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the state property: The state of the session. Disconnected/Failed/NotFound.
     *
     * @return the state value.
     */
    String state();

    /**
     * Gets the inner com.azure.resourcemanager.network.fluent.models.BastionSessionStateInner object.
     *
     * @return the inner object.
     */
    BastionSessionStateInner innerModel();
}
