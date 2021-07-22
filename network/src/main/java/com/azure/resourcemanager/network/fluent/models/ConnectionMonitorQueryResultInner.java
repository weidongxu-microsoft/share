// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ConnectionMonitorSourceStatus;
import com.azure.resourcemanager.network.models.ConnectionStateSnapshot;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of connection states snapshots. */
@Fluent
public final class ConnectionMonitorQueryResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorQueryResultInner.class);

    /*
     * Status of connection monitor source.
     */
    @JsonProperty(value = "sourceStatus")
    private ConnectionMonitorSourceStatus sourceStatus;

    /*
     * Information about connection states.
     */
    @JsonProperty(value = "states")
    private List<ConnectionStateSnapshot> states;

    /**
     * Get the sourceStatus property: Status of connection monitor source.
     *
     * @return the sourceStatus value.
     */
    public ConnectionMonitorSourceStatus sourceStatus() {
        return this.sourceStatus;
    }

    /**
     * Set the sourceStatus property: Status of connection monitor source.
     *
     * @param sourceStatus the sourceStatus value to set.
     * @return the ConnectionMonitorQueryResultInner object itself.
     */
    public ConnectionMonitorQueryResultInner withSourceStatus(ConnectionMonitorSourceStatus sourceStatus) {
        this.sourceStatus = sourceStatus;
        return this;
    }

    /**
     * Get the states property: Information about connection states.
     *
     * @return the states value.
     */
    public List<ConnectionStateSnapshot> states() {
        return this.states;
    }

    /**
     * Set the states property: Information about connection states.
     *
     * @param states the states value to set.
     * @return the ConnectionMonitorQueryResultInner object itself.
     */
    public ConnectionMonitorQueryResultInner withStates(List<ConnectionStateSnapshot> states) {
        this.states = states;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (states() != null) {
            states().forEach(e -> e.validate());
        }
    }
}
