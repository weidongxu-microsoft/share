// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.HubRouteTablesClient;
import com.azure.resourcemanager.network.fluent.models.HubRouteTableInner;
import com.azure.resourcemanager.network.models.HubRouteTable;
import com.azure.resourcemanager.network.models.HubRouteTables;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class HubRouteTablesImpl implements HubRouteTables {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HubRouteTablesImpl.class);

    private final HubRouteTablesClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public HubRouteTablesImpl(
        HubRouteTablesClient innerClient, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public HubRouteTable get(String resourceGroupName, String virtualHubName, String routeTableName) {
        HubRouteTableInner inner = this.serviceClient().get(resourceGroupName, virtualHubName, routeTableName);
        if (inner != null) {
            return new HubRouteTableImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HubRouteTable> getWithResponse(
        String resourceGroupName, String virtualHubName, String routeTableName, Context context) {
        Response<HubRouteTableInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, virtualHubName, routeTableName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HubRouteTableImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String virtualHubName, String routeTableName) {
        this.serviceClient().delete(resourceGroupName, virtualHubName, routeTableName);
    }

    public void delete(String resourceGroupName, String virtualHubName, String routeTableName, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualHubName, routeTableName, context);
    }

    public PagedIterable<HubRouteTable> list(String resourceGroupName, String virtualHubName) {
        PagedIterable<HubRouteTableInner> inner = this.serviceClient().list(resourceGroupName, virtualHubName);
        return Utils.mapPage(inner, inner1 -> new HubRouteTableImpl(inner1, this.manager()));
    }

    public PagedIterable<HubRouteTable> list(String resourceGroupName, String virtualHubName, Context context) {
        PagedIterable<HubRouteTableInner> inner = this.serviceClient().list(resourceGroupName, virtualHubName, context);
        return Utils.mapPage(inner, inner1 -> new HubRouteTableImpl(inner1, this.manager()));
    }

    public HubRouteTable getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String routeTableName = Utils.getValueFromIdByName(id, "hubRouteTables");
        if (routeTableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'hubRouteTables'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualHubName, routeTableName, Context.NONE).getValue();
    }

    public Response<HubRouteTable> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String routeTableName = Utils.getValueFromIdByName(id, "hubRouteTables");
        if (routeTableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'hubRouteTables'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualHubName, routeTableName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String routeTableName = Utils.getValueFromIdByName(id, "hubRouteTables");
        if (routeTableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'hubRouteTables'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, routeTableName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualHubName = Utils.getValueFromIdByName(id, "virtualHubs");
        if (virtualHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'virtualHubs'.", id)));
        }
        String routeTableName = Utils.getValueFromIdByName(id, "hubRouteTables");
        if (routeTableName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'hubRouteTables'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, routeTableName, context);
    }

    private HubRouteTablesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }

    public HubRouteTableImpl define(String name) {
        return new HubRouteTableImpl(name, this.manager());
    }
}
