// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PacketCaptures. */
public interface PacketCaptures {
    /**
     * Create and start a packet capture on the specified VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @param parameters Parameters that define the create packet capture operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about packet capture session.
     */
    PacketCaptureResult create(
        String resourceGroupName, String networkWatcherName, String packetCaptureName, PacketCapture parameters);

    /**
     * Create and start a packet capture on the specified VM.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @param parameters Parameters that define the create packet capture operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about packet capture session.
     */
    PacketCaptureResult create(
        String resourceGroupName,
        String networkWatcherName,
        String packetCaptureName,
        PacketCapture parameters,
        Context context);

    /**
     * Gets a packet capture session by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a packet capture session by name.
     */
    PacketCaptureResult get(String resourceGroupName, String networkWatcherName, String packetCaptureName);

    /**
     * Gets a packet capture session by name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a packet capture session by name.
     */
    Response<PacketCaptureResult> getWithResponse(
        String resourceGroupName, String networkWatcherName, String packetCaptureName, Context context);

    /**
     * Deletes the specified packet capture session.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkWatcherName, String packetCaptureName);

    /**
     * Deletes the specified packet capture session.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkWatcherName, String packetCaptureName, Context context);

    /**
     * Stops a specified packet capture session.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String networkWatcherName, String packetCaptureName);

    /**
     * Stops a specified packet capture session.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the network watcher.
     * @param packetCaptureName The name of the packet capture session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String resourceGroupName, String networkWatcherName, String packetCaptureName, Context context);

    /**
     * Query the status of a running packet capture session.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param packetCaptureName The name given to the packet capture session.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of packet capture session.
     */
    PacketCaptureQueryStatusResult getStatus(
        String resourceGroupName, String networkWatcherName, String packetCaptureName);

    /**
     * Query the status of a running packet capture session.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param packetCaptureName The name given to the packet capture session.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return status of packet capture session.
     */
    PacketCaptureQueryStatusResult getStatus(
        String resourceGroupName, String networkWatcherName, String packetCaptureName, Context context);

    /**
     * Lists all packet capture sessions within the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of packet capture sessions.
     */
    PagedIterable<PacketCaptureResult> list(String resourceGroupName, String networkWatcherName);

    /**
     * Lists all packet capture sessions within the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkWatcherName The name of the Network Watcher resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of packet capture sessions.
     */
    PagedIterable<PacketCaptureResult> list(String resourceGroupName, String networkWatcherName, Context context);
}