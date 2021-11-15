// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.VirtualHubRouteTableV2Inner;

/** An instance of this class provides access to all the operations defined in VirtualHubRouteTableV2SClient. */
public interface VirtualHubRouteTableV2SClient {
    /**
     * Retrieves the details of a VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHubRouteTableV2.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubRouteTableV2 Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualHubRouteTableV2Inner get(String resourceGroupName, String virtualHubName, String routeTableName);

    /**
     * Retrieves the details of a VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHubRouteTableV2.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubRouteTableV2 Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualHubRouteTableV2Inner> getWithResponse(
        String resourceGroupName, String virtualHubName, String routeTableName, Context context);

    /**
     * Creates a VirtualHubRouteTableV2 resource if it doesn't exist else updates the existing VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @param virtualHubRouteTableV2Parameters Parameters supplied to create or update VirtualHubRouteTableV2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubRouteTableV2 Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualHubRouteTableV2Inner>, VirtualHubRouteTableV2Inner> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String routeTableName,
        VirtualHubRouteTableV2Inner virtualHubRouteTableV2Parameters);

    /**
     * Creates a VirtualHubRouteTableV2 resource if it doesn't exist else updates the existing VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @param virtualHubRouteTableV2Parameters Parameters supplied to create or update VirtualHubRouteTableV2.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubRouteTableV2 Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<VirtualHubRouteTableV2Inner>, VirtualHubRouteTableV2Inner> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String routeTableName,
        VirtualHubRouteTableV2Inner virtualHubRouteTableV2Parameters,
        Context context);

    /**
     * Creates a VirtualHubRouteTableV2 resource if it doesn't exist else updates the existing VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @param virtualHubRouteTableV2Parameters Parameters supplied to create or update VirtualHubRouteTableV2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubRouteTableV2 Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualHubRouteTableV2Inner createOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String routeTableName,
        VirtualHubRouteTableV2Inner virtualHubRouteTableV2Parameters);

    /**
     * Creates a VirtualHubRouteTableV2 resource if it doesn't exist else updates the existing VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @param virtualHubRouteTableV2Parameters Parameters supplied to create or update VirtualHubRouteTableV2.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubRouteTableV2 Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualHubRouteTableV2Inner createOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String routeTableName,
        VirtualHubRouteTableV2Inner virtualHubRouteTableV2Parameters,
        Context context);

    /**
     * Deletes a VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHubRouteTableV2.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualHubName, String routeTableName);

    /**
     * Deletes a VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHubRouteTableV2.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualHubName, String routeTableName, Context context);

    /**
     * Deletes a VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHubRouteTableV2.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName, String routeTableName);

    /**
     * Deletes a VirtualHubRouteTableV2.
     *
     * @param resourceGroupName The resource group name of the VirtualHubRouteTableV2.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the VirtualHubRouteTableV2.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName, String routeTableName, Context context);

    /**
     * Retrieves the details of all VirtualHubRouteTableV2s.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualHubRouteTableV2s and a URL nextLink to get the next set of results.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualHubRouteTableV2Inner> list(String resourceGroupName, String virtualHubName);

    /**
     * Retrieves the details of all VirtualHubRouteTableV2s.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of VirtualHubRouteTableV2s and a URL nextLink to get the next set of results.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualHubRouteTableV2Inner> list(String resourceGroupName, String virtualHubName, Context context);
}
