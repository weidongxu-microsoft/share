// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.ServiceEndpointPolicyDefinitionsClient;
import com.azure.resourcemanager.network.fluent.models.ServiceEndpointPolicyDefinitionInner;
import com.azure.resourcemanager.network.models.ServiceEndpointPolicyDefinition;
import com.azure.resourcemanager.network.models.ServiceEndpointPolicyDefinitions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServiceEndpointPolicyDefinitionsImpl implements ServiceEndpointPolicyDefinitions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceEndpointPolicyDefinitionsImpl.class);

    private final ServiceEndpointPolicyDefinitionsClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public ServiceEndpointPolicyDefinitionsImpl(
        ServiceEndpointPolicyDefinitionsClient innerClient,
        com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName) {
        this.serviceClient().delete(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName);
    }

    public void delete(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context) {
        this
            .serviceClient()
            .delete(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName, context);
    }

    public ServiceEndpointPolicyDefinition get(
        String resourceGroupName, String serviceEndpointPolicyName, String serviceEndpointPolicyDefinitionName) {
        ServiceEndpointPolicyDefinitionInner inner =
            this.serviceClient().get(resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName);
        if (inner != null) {
            return new ServiceEndpointPolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServiceEndpointPolicyDefinition> getWithResponse(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        Context context) {
        Response<ServiceEndpointPolicyDefinitionInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, serviceEndpointPolicyName, serviceEndpointPolicyDefinitionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceEndpointPolicyDefinitionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServiceEndpointPolicyDefinition createOrUpdate(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions) {
        ServiceEndpointPolicyDefinitionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    serviceEndpointPolicyName,
                    serviceEndpointPolicyDefinitionName,
                    serviceEndpointPolicyDefinitions);
        if (inner != null) {
            return new ServiceEndpointPolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServiceEndpointPolicyDefinition createOrUpdate(
        String resourceGroupName,
        String serviceEndpointPolicyName,
        String serviceEndpointPolicyDefinitionName,
        ServiceEndpointPolicyDefinitionInner serviceEndpointPolicyDefinitions,
        Context context) {
        ServiceEndpointPolicyDefinitionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    serviceEndpointPolicyName,
                    serviceEndpointPolicyDefinitionName,
                    serviceEndpointPolicyDefinitions,
                    context);
        if (inner != null) {
            return new ServiceEndpointPolicyDefinitionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ServiceEndpointPolicyDefinition> listByResourceGroup(
        String resourceGroupName, String serviceEndpointPolicyName) {
        PagedIterable<ServiceEndpointPolicyDefinitionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, serviceEndpointPolicyName);
        return Utils.mapPage(inner, inner1 -> new ServiceEndpointPolicyDefinitionImpl(inner1, this.manager()));
    }

    public PagedIterable<ServiceEndpointPolicyDefinition> listByResourceGroup(
        String resourceGroupName, String serviceEndpointPolicyName, Context context) {
        PagedIterable<ServiceEndpointPolicyDefinitionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, serviceEndpointPolicyName, context);
        return Utils.mapPage(inner, inner1 -> new ServiceEndpointPolicyDefinitionImpl(inner1, this.manager()));
    }

    private ServiceEndpointPolicyDefinitionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
