// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.ServiceTagsClient;
import com.azure.resourcemanager.network.fluent.models.ServiceTagsListResultInner;
import com.azure.resourcemanager.network.models.ServiceTags;
import com.azure.resourcemanager.network.models.ServiceTagsListResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ServiceTagsImpl implements ServiceTags {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceTagsImpl.class);

    private final ServiceTagsClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public ServiceTagsImpl(
        ServiceTagsClient innerClient, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServiceTagsListResult list(String location) {
        ServiceTagsListResultInner inner = this.serviceClient().list(location);
        if (inner != null) {
            return new ServiceTagsListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServiceTagsListResult> listWithResponse(String location, Context context) {
        Response<ServiceTagsListResultInner> inner = this.serviceClient().listWithResponse(location, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceTagsListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ServiceTagsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}