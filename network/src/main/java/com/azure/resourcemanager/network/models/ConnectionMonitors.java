// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ConnectionMonitors. */
public interface ConnectionMonitors {
    /**
     * Gets a connection monitor by name.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connection monitor by name.
     */
    ConnectionMonitorResult get(String resourceGroupName, String networkWatcherName, String connectionMonitorName);

    /**
     * Gets a connection monitor by name.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connection monitor by name.
     */
    Response<ConnectionMonitorResult> getWithResponse(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context);

    /**
     * Deletes the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkWatcherName, String connectionMonitorName);

    /**
     * Deletes the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context);

    /**
     * Stops the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String networkWatcherName, String connectionMonitorName);

    /**
     * Stops the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context);

    /**
     * Starts the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String networkWatcherName, String connectionMonitorName);

    /**
     * Starts the specified connection monitor.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name of the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context);

    /**
     * Query a snapshot of the most recent connection states.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name given to the connection monitor.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection states snapshots.
     */
    ConnectionMonitorQueryResult query(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName);

    /**
     * Query a snapshot of the most recent connection states.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param connectionMonitorName The name given to the connection monitor.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection states snapshots.
     */
    ConnectionMonitorQueryResult query(
        String resourceGroupName, String networkWatcherName, String connectionMonitorName, Context context);

    /**
     * Lists all connection monitors for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection monitors.
     */
    PagedIterable<ConnectionMonitorResult> list(String resourceGroupName, String networkWatcherName);

    /**
     * Lists all connection monitors for the specified Network Watcher.
     *
     * @param resourceGroupName The name of the resource group containing Network Watcher.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of connection monitors.
     */
    PagedIterable<ConnectionMonitorResult> list(String resourceGroupName, String networkWatcherName, Context context);

    /**
     * Gets a connection monitor by name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connection monitor by name.
     */
    ConnectionMonitorResult getById(String id);

    /**
     * Gets a connection monitor by name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a connection monitor by name.
     */
    Response<ConnectionMonitorResult> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified connection monitor.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified connection monitor.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ConnectionMonitorResult resource.
     *
     * @param name resource name.
     * @return the first stage of the new ConnectionMonitorResult definition.
     */
    ConnectionMonitorResult.DefinitionStages.Blank define(String name);
}
