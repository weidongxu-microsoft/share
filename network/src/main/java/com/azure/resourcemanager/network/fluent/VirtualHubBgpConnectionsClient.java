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
import com.azure.resourcemanager.network.fluent.models.BgpConnectionInner;
import com.azure.resourcemanager.network.fluent.models.PeerRouteListInner;

/** An instance of this class provides access to all the operations defined in VirtualHubBgpConnectionsClient. */
public interface VirtualHubBgpConnectionsClient {
    /**
     * Retrieves the details of a Virtual Hub Bgp Connection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Appliance Site resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BgpConnectionInner get(String resourceGroupName, String virtualHubName, String connectionName);

    /**
     * Retrieves the details of a Virtual Hub Bgp Connection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Appliance Site resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<BgpConnectionInner> getWithResponse(
        String resourceGroupName, String virtualHubName, String connectionName, Context context);

    /**
     * Creates a VirtualHubBgpConnection resource if it doesn't exist else updates the existing VirtualHubBgpConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @param parameters Parameters of Bgp connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Appliance Site resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BgpConnectionInner>, BgpConnectionInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualHubName, String connectionName, BgpConnectionInner parameters);

    /**
     * Creates a VirtualHubBgpConnection resource if it doesn't exist else updates the existing VirtualHubBgpConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @param parameters Parameters of Bgp connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Appliance Site resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<BgpConnectionInner>, BgpConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String connectionName,
        BgpConnectionInner parameters,
        Context context);

    /**
     * Creates a VirtualHubBgpConnection resource if it doesn't exist else updates the existing VirtualHubBgpConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @param parameters Parameters of Bgp connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Appliance Site resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BgpConnectionInner createOrUpdate(
        String resourceGroupName, String virtualHubName, String connectionName, BgpConnectionInner parameters);

    /**
     * Creates a VirtualHubBgpConnection resource if it doesn't exist else updates the existing VirtualHubBgpConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @param parameters Parameters of Bgp connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Appliance Site resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    BgpConnectionInner createOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String connectionName,
        BgpConnectionInner parameters,
        Context context);

    /**
     * Deletes a VirtualHubBgpConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualHubName, String connectionName);

    /**
     * Deletes a VirtualHubBgpConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String virtualHubName, String connectionName, Context context);

    /**
     * Deletes a VirtualHubBgpConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName, String connectionName);

    /**
     * Deletes a VirtualHubBgpConnection.
     *
     * @param resourceGroupName The resource group name of the VirtualHubBgpConnection.
     * @param virtualHubName The name of the VirtualHub.
     * @param connectionName The name of the connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName, String connectionName, Context context);

    /**
     * Retrieves the details of all VirtualHubBgpConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubBgpConnections list.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BgpConnectionInner> list(String resourceGroupName, String virtualHubName);

    /**
     * Retrieves the details of all VirtualHubBgpConnections.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHubBgpConnections list.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<BgpConnectionInner> list(String resourceGroupName, String virtualHubName, Context context);

    /**
     * Retrieves a list of routes the virtual hub bgp connection has learned.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the virtual hub.
     * @param connectionName The name of the virtual hub bgp connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual router peer routes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PeerRouteListInner>, PeerRouteListInner> beginListLearnedRoutes(
        String resourceGroupName, String hubName, String connectionName);

    /**
     * Retrieves a list of routes the virtual hub bgp connection has learned.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the virtual hub.
     * @param connectionName The name of the virtual hub bgp connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual router peer routes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PeerRouteListInner>, PeerRouteListInner> beginListLearnedRoutes(
        String resourceGroupName, String hubName, String connectionName, Context context);

    /**
     * Retrieves a list of routes the virtual hub bgp connection has learned.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the virtual hub.
     * @param connectionName The name of the virtual hub bgp connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual router peer routes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PeerRouteListInner listLearnedRoutes(String resourceGroupName, String hubName, String connectionName);

    /**
     * Retrieves a list of routes the virtual hub bgp connection has learned.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the virtual hub.
     * @param connectionName The name of the virtual hub bgp connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual router peer routes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PeerRouteListInner listLearnedRoutes(
        String resourceGroupName, String hubName, String connectionName, Context context);

    /**
     * Retrieves a list of routes the virtual hub bgp connection is advertising to the specified peer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the virtual hub.
     * @param connectionName The name of the virtual hub bgp connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual router peer routes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PeerRouteListInner>, PeerRouteListInner> beginListAdvertisedRoutes(
        String resourceGroupName, String hubName, String connectionName);

    /**
     * Retrieves a list of routes the virtual hub bgp connection is advertising to the specified peer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the virtual hub.
     * @param connectionName The name of the virtual hub bgp connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual router peer routes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<PeerRouteListInner>, PeerRouteListInner> beginListAdvertisedRoutes(
        String resourceGroupName, String hubName, String connectionName, Context context);

    /**
     * Retrieves a list of routes the virtual hub bgp connection is advertising to the specified peer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the virtual hub.
     * @param connectionName The name of the virtual hub bgp connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual router peer routes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PeerRouteListInner listAdvertisedRoutes(String resourceGroupName, String hubName, String connectionName);

    /**
     * Retrieves a list of routes the virtual hub bgp connection is advertising to the specified peer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hubName The name of the virtual hub.
     * @param connectionName The name of the virtual hub bgp connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual router peer routes.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PeerRouteListInner listAdvertisedRoutes(
        String resourceGroupName, String hubName, String connectionName, Context context);
}
