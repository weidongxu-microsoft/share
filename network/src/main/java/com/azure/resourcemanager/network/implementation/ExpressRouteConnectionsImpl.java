// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.ExpressRouteConnectionsClient;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteConnectionInner;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteConnectionListInner;
import com.azure.resourcemanager.network.models.ExpressRouteConnection;
import com.azure.resourcemanager.network.models.ExpressRouteConnectionList;
import com.azure.resourcemanager.network.models.ExpressRouteConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExpressRouteConnectionsImpl implements ExpressRouteConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteConnectionsImpl.class);

    private final ExpressRouteConnectionsClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public ExpressRouteConnectionsImpl(
        ExpressRouteConnectionsClient innerClient, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ExpressRouteConnection createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        ExpressRouteConnectionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName, expressRouteGatewayName, connectionName, putExpressRouteConnectionParameters);
        if (inner != null) {
            return new ExpressRouteConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteConnection createOrUpdate(
        String resourceGroupName,
        String expressRouteGatewayName,
        String connectionName,
        ExpressRouteConnectionInner putExpressRouteConnectionParameters,
        Context context) {
        ExpressRouteConnectionInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName,
                    expressRouteGatewayName,
                    connectionName,
                    putExpressRouteConnectionParameters,
                    context);
        if (inner != null) {
            return new ExpressRouteConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteConnection get(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        ExpressRouteConnectionInner inner =
            this.serviceClient().get(resourceGroupName, expressRouteGatewayName, connectionName);
        if (inner != null) {
            return new ExpressRouteConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteConnection> getWithResponse(
        String resourceGroupName, String expressRouteGatewayName, String connectionName, Context context) {
        Response<ExpressRouteConnectionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, expressRouteGatewayName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExpressRouteConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        this.serviceClient().delete(resourceGroupName, expressRouteGatewayName, connectionName);
    }

    public void delete(
        String resourceGroupName, String expressRouteGatewayName, String connectionName, Context context) {
        this.serviceClient().delete(resourceGroupName, expressRouteGatewayName, connectionName, context);
    }

    public ExpressRouteConnectionList list(String resourceGroupName, String expressRouteGatewayName) {
        ExpressRouteConnectionListInner inner = this.serviceClient().list(resourceGroupName, expressRouteGatewayName);
        if (inner != null) {
            return new ExpressRouteConnectionListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteConnectionList> listWithResponse(
        String resourceGroupName, String expressRouteGatewayName, Context context) {
        Response<ExpressRouteConnectionListInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, expressRouteGatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExpressRouteConnectionListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ExpressRouteConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
