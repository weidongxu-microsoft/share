// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.fluent.models.DedicatedHostInner;
import com.azure.resourcemanager.compute.models.DedicatedHostUpdate;
import com.azure.resourcemanager.compute.models.InstanceViewTypes;

/** An instance of this class provides access to all the operations defined in DedicatedHostsClient. */
public interface DedicatedHostsClient {
    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DedicatedHostInner>, DedicatedHostInner> beginCreateOrUpdate(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostInner parameters);

    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DedicatedHostInner>, DedicatedHostInner> beginCreateOrUpdate(
        String resourceGroupName,
        String hostGroupName,
        String hostname,
        DedicatedHostInner parameters,
        Context context);

    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostInner createOrUpdate(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostInner parameters);

    /**
     * Create or update a dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Create Dedicated Host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostInner createOrUpdate(
        String resourceGroupName,
        String hostGroupName,
        String hostname,
        DedicatedHostInner parameters,
        Context context);

    /**
     * Update an dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DedicatedHostInner>, DedicatedHostInner> beginUpdate(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostUpdate parameters);

    /**
     * Update an dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DedicatedHostInner>, DedicatedHostInner> beginUpdate(
        String resourceGroupName,
        String hostGroupName,
        String hostname,
        DedicatedHostUpdate parameters,
        Context context);

    /**
     * Update an dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostInner update(
        String resourceGroupName, String hostGroupName, String hostname, DedicatedHostUpdate parameters);

    /**
     * Update an dedicated host .
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host .
     * @param parameters Parameters supplied to the Update Dedicated Host operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostInner update(
        String resourceGroupName,
        String hostGroupName,
        String hostname,
        DedicatedHostUpdate parameters,
        Context context);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String hostGroupName, String hostname, Context context);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Delete a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String hostGroupName, String hostname, Context context);

    /**
     * Retrieves information about a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DedicatedHostInner get(String resourceGroupName, String hostGroupName, String hostname);

    /**
     * Retrieves information about a dedicated host.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param hostname The name of the dedicated host.
     * @param expand The expand expression to apply on the operation. 'InstanceView' will retrieve the list of instance
     *     views of the dedicated host. 'UserData' is not supported for dedicated host.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the Dedicated host.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DedicatedHostInner> getWithResponse(
        String resourceGroupName, String hostGroupName, String hostname, InstanceViewTypes expand, Context context);

    /**
     * Lists all of the dedicated hosts in the specified dedicated host group. Use the nextLink property in the response
     * to get the next page of dedicated hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list dedicated host operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedHostInner> listByHostGroup(String resourceGroupName, String hostGroupName);

    /**
     * Lists all of the dedicated hosts in the specified dedicated host group. Use the nextLink property in the response
     * to get the next page of dedicated hosts.
     *
     * @param resourceGroupName The name of the resource group.
     * @param hostGroupName The name of the dedicated host group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list dedicated host operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DedicatedHostInner> listByHostGroup(String resourceGroupName, String hostGroupName, Context context);
}
