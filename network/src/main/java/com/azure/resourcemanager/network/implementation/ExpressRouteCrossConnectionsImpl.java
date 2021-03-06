// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.ExpressRouteCrossConnectionsClient;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteCircuitsArpTableListResultInner;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteCircuitsRoutesTableListResultInner;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteCrossConnectionInner;
import com.azure.resourcemanager.network.fluent.models.ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitsArpTableListResult;
import com.azure.resourcemanager.network.models.ExpressRouteCircuitsRoutesTableListResult;
import com.azure.resourcemanager.network.models.ExpressRouteCrossConnection;
import com.azure.resourcemanager.network.models.ExpressRouteCrossConnections;
import com.azure.resourcemanager.network.models.ExpressRouteCrossConnectionsRoutesTableSummaryListResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ExpressRouteCrossConnectionsImpl implements ExpressRouteCrossConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExpressRouteCrossConnectionsImpl.class);

    private final ExpressRouteCrossConnectionsClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public ExpressRouteCrossConnectionsImpl(
        ExpressRouteCrossConnectionsClient innerClient,
        com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ExpressRouteCrossConnection> list() {
        PagedIterable<ExpressRouteCrossConnectionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ExpressRouteCrossConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCrossConnection> list(Context context) {
        PagedIterable<ExpressRouteCrossConnectionInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ExpressRouteCrossConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCrossConnection> listByResourceGroup(String resourceGroupName) {
        PagedIterable<ExpressRouteCrossConnectionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new ExpressRouteCrossConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCrossConnection> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<ExpressRouteCrossConnectionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new ExpressRouteCrossConnectionImpl(inner1, this.manager()));
    }

    public ExpressRouteCrossConnection getByResourceGroup(String resourceGroupName, String crossConnectionName) {
        ExpressRouteCrossConnectionInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, crossConnectionName);
        if (inner != null) {
            return new ExpressRouteCrossConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteCrossConnection> getByResourceGroupWithResponse(
        String resourceGroupName, String crossConnectionName, Context context) {
        Response<ExpressRouteCrossConnectionInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, crossConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExpressRouteCrossConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsArpTableListResult listArpTable(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath) {
        ExpressRouteCircuitsArpTableListResultInner inner =
            this.serviceClient().listArpTable(resourceGroupName, crossConnectionName, peeringName, devicePath);
        if (inner != null) {
            return new ExpressRouteCircuitsArpTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsArpTableListResult listArpTable(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath, Context context) {
        ExpressRouteCircuitsArpTableListResultInner inner =
            this.serviceClient().listArpTable(resourceGroupName, crossConnectionName, peeringName, devicePath, context);
        if (inner != null) {
            return new ExpressRouteCircuitsArpTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCrossConnectionsRoutesTableSummaryListResult listRoutesTableSummary(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath) {
        ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner inner =
            this
                .serviceClient()
                .listRoutesTableSummary(resourceGroupName, crossConnectionName, peeringName, devicePath);
        if (inner != null) {
            return new ExpressRouteCrossConnectionsRoutesTableSummaryListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCrossConnectionsRoutesTableSummaryListResult listRoutesTableSummary(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath, Context context) {
        ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner inner =
            this
                .serviceClient()
                .listRoutesTableSummary(resourceGroupName, crossConnectionName, peeringName, devicePath, context);
        if (inner != null) {
            return new ExpressRouteCrossConnectionsRoutesTableSummaryListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsRoutesTableListResult listRoutesTable(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath) {
        ExpressRouteCircuitsRoutesTableListResultInner inner =
            this.serviceClient().listRoutesTable(resourceGroupName, crossConnectionName, peeringName, devicePath);
        if (inner != null) {
            return new ExpressRouteCircuitsRoutesTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitsRoutesTableListResult listRoutesTable(
        String resourceGroupName, String crossConnectionName, String peeringName, String devicePath, Context context) {
        ExpressRouteCircuitsRoutesTableListResultInner inner =
            this
                .serviceClient()
                .listRoutesTable(resourceGroupName, crossConnectionName, peeringName, devicePath, context);
        if (inner != null) {
            return new ExpressRouteCircuitsRoutesTableListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCrossConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String crossConnectionName = Utils.getValueFromIdByName(id, "expressRouteCrossConnections");
        if (crossConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'expressRouteCrossConnections'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, crossConnectionName, Context.NONE).getValue();
    }

    public Response<ExpressRouteCrossConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String crossConnectionName = Utils.getValueFromIdByName(id, "expressRouteCrossConnections");
        if (crossConnectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment"
                                    + " 'expressRouteCrossConnections'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, crossConnectionName, context);
    }

    private ExpressRouteCrossConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }

    public ExpressRouteCrossConnectionImpl define(String name) {
        return new ExpressRouteCrossConnectionImpl(name, this.manager());
    }
}
