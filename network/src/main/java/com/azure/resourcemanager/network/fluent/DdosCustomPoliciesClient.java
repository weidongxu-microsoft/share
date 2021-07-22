// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.DdosCustomPolicyInner;
import com.azure.resourcemanager.network.models.TagsObject;

/** An instance of this class provides access to all the operations defined in DdosCustomPoliciesClient. */
public interface DdosCustomPoliciesClient {
    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String ddosCustomPolicyName);

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String ddosCustomPolicyName, Context context);

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ddosCustomPolicyName);

    /**
     * Deletes the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String ddosCustomPolicyName, Context context);

    /**
     * Gets information about the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified DDoS custom policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DdosCustomPolicyInner getByResourceGroup(String resourceGroupName, String ddosCustomPolicyName);

    /**
     * Gets information about the specified DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified DDoS custom policy.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DdosCustomPolicyInner> getByResourceGroupWithResponse(
        String resourceGroupName, String ddosCustomPolicyName, Context context);

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS custom policy in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DdosCustomPolicyInner>, DdosCustomPolicyInner> beginCreateOrUpdate(
        String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters);

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS custom policy in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DdosCustomPolicyInner>, DdosCustomPolicyInner> beginCreateOrUpdate(
        String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters, Context context);

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS custom policy in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DdosCustomPolicyInner createOrUpdate(
        String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters);

    /**
     * Creates or updates a DDoS custom policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to the create or update operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS custom policy in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DdosCustomPolicyInner createOrUpdate(
        String resourceGroupName, String ddosCustomPolicyName, DdosCustomPolicyInner parameters, Context context);

    /**
     * Update a DDoS custom policy tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to update DDoS custom policy resource tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS custom policy in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DdosCustomPolicyInner updateTags(String resourceGroupName, String ddosCustomPolicyName, TagsObject parameters);

    /**
     * Update a DDoS custom policy tags.
     *
     * @param resourceGroupName The name of the resource group.
     * @param ddosCustomPolicyName The name of the DDoS custom policy.
     * @param parameters Parameters supplied to update DDoS custom policy resource tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a DDoS custom policy in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DdosCustomPolicyInner> updateTagsWithResponse(
        String resourceGroupName, String ddosCustomPolicyName, TagsObject parameters, Context context);
}
