// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.HubVirtualNetworkConnectionInner;

/** Resource collection API of HubVirtualNetworkConnections. */
public interface HubVirtualNetworkConnections {
    /**
     * Creates a hub virtual network connection if it doesn't exist else updates the existing one.
     *
     * @param resourceGroupName The resource group name of the HubVirtualNetworkConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the HubVirtualNetworkConnection.
     * @param hubVirtualNetworkConnectionParameters Parameters supplied to create or update a hub virtual network
     *     connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hubVirtualNetworkConnection Resource.
     */
    HubVirtualNetworkConnection createOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String connectionName,
        HubVirtualNetworkConnectionInner hubVirtualNetworkConnectionParameters);

    /**
     * Creates a hub virtual network connection if it doesn't exist else updates the existing one.
     *
     * @param resourceGroupName The resource group name of the HubVirtualNetworkConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the HubVirtualNetworkConnection.
     * @param hubVirtualNetworkConnectionParameters Parameters supplied to create or update a hub virtual network
     *     connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hubVirtualNetworkConnection Resource.
     */
    HubVirtualNetworkConnection createOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String connectionName,
        HubVirtualNetworkConnectionInner hubVirtualNetworkConnectionParameters,
        Context context);

    /**
     * Deletes a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the HubVirtualNetworkConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualHubName, String connectionName);

    /**
     * Deletes a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the HubVirtualNetworkConnection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualHubName, String connectionName, Context context);

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hubVirtualNetworkConnection Resource.
     */
    HubVirtualNetworkConnection get(String resourceGroupName, String virtualHubName, String connectionName);

    /**
     * Retrieves the details of a HubVirtualNetworkConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the vpn connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return hubVirtualNetworkConnection Resource.
     */
    Response<HubVirtualNetworkConnection> getWithResponse(
        String resourceGroupName, String virtualHubName, String connectionName, Context context);

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HubVirtualNetworkConnections and a URL nextLink to get the next set of results.
     */
    PagedIterable<HubVirtualNetworkConnection> list(String resourceGroupName, String virtualHubName);

    /**
     * Retrieves the details of all HubVirtualNetworkConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of HubVirtualNetworkConnections and a URL nextLink to get the next set of results.
     */
    PagedIterable<HubVirtualNetworkConnection> list(String resourceGroupName, String virtualHubName, Context context);
}
