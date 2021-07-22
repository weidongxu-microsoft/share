// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.PrivateDnsZoneGroupInner;

/** Resource collection API of PrivateDnsZoneGroups. */
public interface PrivateDnsZoneGroups {
    /**
     * Deletes the specified private dns zone group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Deletes the specified private dns zone group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName, Context context);

    /**
     * Gets the private dns zone group resource by specified private dns zone group name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private dns zone group resource by specified private dns zone group name.
     */
    PrivateDnsZoneGroup get(String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName);

    /**
     * Gets the private dns zone group resource by specified private dns zone group name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the private dns zone group resource by specified private dns zone group name.
     */
    Response<PrivateDnsZoneGroup> getWithResponse(
        String resourceGroupName, String privateEndpointName, String privateDnsZoneGroupName, Context context);

    /**
     * Creates or updates a private dns zone group in the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param parameters Parameters supplied to the create or update private dns zone group operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private dns zone group resource.
     */
    PrivateDnsZoneGroup createOrUpdate(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters);

    /**
     * Creates or updates a private dns zone group in the specified private endpoint.
     *
     * @param resourceGroupName The name of the resource group.
     * @param privateEndpointName The name of the private endpoint.
     * @param privateDnsZoneGroupName The name of the private dns zone group.
     * @param parameters Parameters supplied to the create or update private dns zone group operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private dns zone group resource.
     */
    PrivateDnsZoneGroup createOrUpdate(
        String resourceGroupName,
        String privateEndpointName,
        String privateDnsZoneGroupName,
        PrivateDnsZoneGroupInner parameters,
        Context context);

    /**
     * Gets all private dns zone groups in a private endpoint.
     *
     * @param privateEndpointName The name of the private endpoint.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private dns zone groups in a private endpoint.
     */
    PagedIterable<PrivateDnsZoneGroup> list(String privateEndpointName, String resourceGroupName);

    /**
     * Gets all private dns zone groups in a private endpoint.
     *
     * @param privateEndpointName The name of the private endpoint.
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private dns zone groups in a private endpoint.
     */
    PagedIterable<PrivateDnsZoneGroup> list(String privateEndpointName, String resourceGroupName, Context context);
}
