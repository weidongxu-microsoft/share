// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.HubVirtualNetworkConnectionsClient;
import com.azure.resourcemanager.network.fluent.models.HubVirtualNetworkConnectionInner;
import com.azure.resourcemanager.network.models.HubVirtualNetworkConnection;
import com.azure.resourcemanager.network.models.HubVirtualNetworkConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class HubVirtualNetworkConnectionsImpl implements HubVirtualNetworkConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HubVirtualNetworkConnectionsImpl.class);

    private final HubVirtualNetworkConnectionsClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public HubVirtualNetworkConnectionsImpl(
        HubVirtualNetworkConnectionsClient innerClient,
        com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public HubVirtualNetworkConnection createOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String connectionName,
        HubVirtualNetworkConnectionInner hubVirtualNetworkConnectionParameters) {
        HubVirtualNetworkConnectionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName, virtualHubName, connectionName, hubVirtualNetworkConnectionParameters);
        if (inner != null) {
            return new HubVirtualNetworkConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public HubVirtualNetworkConnection createOrUpdate(
        String resourceGroupName,
        String virtualHubName,
        String connectionName,
        HubVirtualNetworkConnectionInner hubVirtualNetworkConnectionParameters,
        Context context) {
        HubVirtualNetworkConnectionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName, virtualHubName, connectionName, hubVirtualNetworkConnectionParameters, context);
        if (inner != null) {
            return new HubVirtualNetworkConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String virtualHubName, String connectionName) {
        this.serviceClient().delete(resourceGroupName, virtualHubName, connectionName);
    }

    public void delete(String resourceGroupName, String virtualHubName, String connectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualHubName, connectionName, context);
    }

    public HubVirtualNetworkConnection get(String resourceGroupName, String virtualHubName, String connectionName) {
        HubVirtualNetworkConnectionInner inner =
            this.serviceClient().get(resourceGroupName, virtualHubName, connectionName);
        if (inner != null) {
            return new HubVirtualNetworkConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HubVirtualNetworkConnection> getWithResponse(
        String resourceGroupName, String virtualHubName, String connectionName, Context context) {
        Response<HubVirtualNetworkConnectionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, virtualHubName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HubVirtualNetworkConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<HubVirtualNetworkConnection> list(String resourceGroupName, String virtualHubName) {
        PagedIterable<HubVirtualNetworkConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, virtualHubName);
        return Utils.mapPage(inner, inner1 -> new HubVirtualNetworkConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<HubVirtualNetworkConnection> list(
        String resourceGroupName, String virtualHubName, Context context) {
        PagedIterable<HubVirtualNetworkConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, virtualHubName, context);
        return Utils.mapPage(inner, inner1 -> new HubVirtualNetworkConnectionImpl(inner1, this.manager()));
    }

    private HubVirtualNetworkConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
