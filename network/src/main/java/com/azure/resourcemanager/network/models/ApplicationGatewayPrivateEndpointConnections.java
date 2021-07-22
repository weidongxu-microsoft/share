// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayPrivateEndpointConnectionInner;

/** Resource collection API of ApplicationGatewayPrivateEndpointConnections. */
public interface ApplicationGatewayPrivateEndpointConnections {
    /**
     * Deletes the specified private endpoint connection on application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String applicationGatewayName, String connectionName);

    /**
     * Deletes the specified private endpoint connection on application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String applicationGatewayName, String connectionName, Context context);

    /**
     * Updates the specified private endpoint connection on application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param parameters Parameters supplied to update application gateway private endpoint connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint connection on an application gateway.
     */
    ApplicationGatewayPrivateEndpointConnection update(
        String resourceGroupName,
        String applicationGatewayName,
        String connectionName,
        ApplicationGatewayPrivateEndpointConnectionInner parameters);

    /**
     * Updates the specified private endpoint connection on application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param parameters Parameters supplied to update application gateway private endpoint connection operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint connection on an application gateway.
     */
    ApplicationGatewayPrivateEndpointConnection update(
        String resourceGroupName,
        String applicationGatewayName,
        String connectionName,
        ApplicationGatewayPrivateEndpointConnectionInner parameters,
        Context context);

    /**
     * Gets the specified private endpoint connection on application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection on application gateway.
     */
    ApplicationGatewayPrivateEndpointConnection get(
        String resourceGroupName, String applicationGatewayName, String connectionName);

    /**
     * Gets the specified private endpoint connection on application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection on application gateway.
     */
    Response<ApplicationGatewayPrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String applicationGatewayName, String connectionName, Context context);

    /**
     * Lists all private endpoint connections on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateEndpointConnection API service call.
     */
    PagedIterable<ApplicationGatewayPrivateEndpointConnection> list(
        String resourceGroupName, String applicationGatewayName);

    /**
     * Lists all private endpoint connections on an application gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateEndpointConnection API service call.
     */
    PagedIterable<ApplicationGatewayPrivateEndpointConnection> list(
        String resourceGroupName, String applicationGatewayName, Context context);
}
