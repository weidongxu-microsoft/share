// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of SecurityPartnerProviders. */
public interface SecurityPartnerProviders {
    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String securityPartnerProviderName);

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String securityPartnerProviderName, Context context);

    /**
     * Gets the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Security Partner Provider.
     */
    SecurityPartnerProvider getByResourceGroup(String resourceGroupName, String securityPartnerProviderName);

    /**
     * Gets the specified Security Partner Provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param securityPartnerProviderName The name of the Security Partner Provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Security Partner Provider.
     */
    Response<SecurityPartnerProvider> getByResourceGroupWithResponse(
        String resourceGroupName, String securityPartnerProviderName, Context context);

    /**
     * Lists all Security Partner Providers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    PagedIterable<SecurityPartnerProvider> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Security Partner Providers in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListSecurityPartnerProviders API service call.
     */
    PagedIterable<SecurityPartnerProvider> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the Security Partner Providers in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Security Partner Providers in a subscription.
     */
    PagedIterable<SecurityPartnerProvider> list();

    /**
     * Gets all the Security Partner Providers in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Security Partner Providers in a subscription.
     */
    PagedIterable<SecurityPartnerProvider> list(Context context);

    /**
     * Gets the specified Security Partner Provider.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Security Partner Provider.
     */
    SecurityPartnerProvider getById(String id);

    /**
     * Gets the specified Security Partner Provider.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Security Partner Provider.
     */
    Response<SecurityPartnerProvider> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified Security Partner Provider.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new SecurityPartnerProvider resource.
     *
     * @param name resource name.
     * @return the first stage of the new SecurityPartnerProvider definition.
     */
    SecurityPartnerProvider.DefinitionStages.Blank define(String name);
}
