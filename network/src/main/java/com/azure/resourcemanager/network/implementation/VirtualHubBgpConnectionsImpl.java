// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.VirtualHubBgpConnectionsClient;
import com.azure.resourcemanager.network.fluent.models.BgpConnectionInner;
import com.azure.resourcemanager.network.fluent.models.PeerRouteListInner;
import com.azure.resourcemanager.network.models.BgpConnection;
import com.azure.resourcemanager.network.models.PeerRouteList;
import com.azure.resourcemanager.network.models.VirtualHubBgpConnections;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualHubBgpConnectionsImpl implements VirtualHubBgpConnections {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualHubBgpConnectionsImpl.class);

    private final VirtualHubBgpConnectionsClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public VirtualHubBgpConnectionsImpl(
        VirtualHubBgpConnectionsClient innerClient, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public BgpConnection get(String resourceGroupName, String virtualHubName, String connectionName) {
        BgpConnectionInner inner = this.serviceClient().get(resourceGroupName, virtualHubName, connectionName);
        if (inner != null) {
            return new BgpConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<BgpConnection> getWithResponse(
        String resourceGroupName, String virtualHubName, String connectionName, Context context) {
        Response<BgpConnectionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, virtualHubName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new BgpConnectionImpl(inner.getValue(), this.manager()));
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

    public PagedIterable<BgpConnection> list(String resourceGroupName, String virtualHubName) {
        PagedIterable<BgpConnectionInner> inner = this.serviceClient().list(resourceGroupName, virtualHubName);
        return Utils.mapPage(inner, inner1 -> new BgpConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<BgpConnection> list(String resourceGroupName, String virtualHubName, Context context) {
        PagedIterable<BgpConnectionInner> inner = this.serviceClient().list(resourceGroupName, virtualHubName, context);
        return Utils.mapPage(inner, inner1 -> new BgpConnectionImpl(inner1, this.manager()));
    }

    public PeerRouteList listLearnedRoutes(String resourceGroupName, String hubName, String connectionName) {
        PeerRouteListInner inner = this.serviceClient().listLearnedRoutes(resourceGroupName, hubName, connectionName);
        if (inner != null) {
            return new PeerRouteListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PeerRouteList listLearnedRoutes(
        String resourceGroupName, String hubName, String connectionName, Context context) {
        PeerRouteListInner inner =
            this.serviceClient().listLearnedRoutes(resourceGroupName, hubName, connectionName, context);
        if (inner != null) {
            return new PeerRouteListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PeerRouteList listAdvertisedRoutes(String resourceGroupName, String hubName, String connectionName) {
        PeerRouteListInner inner =
            this.serviceClient().listAdvertisedRoutes(resourceGroupName, hubName, connectionName);
        if (inner != null) {
            return new PeerRouteListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PeerRouteList listAdvertisedRoutes(
        String resourceGroupName, String hubName, String connectionName, Context context) {
        PeerRouteListInner inner =
            this.serviceClient().listAdvertisedRoutes(resourceGroupName, hubName, connectionName, context);
        if (inner != null) {
            return new PeerRouteListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public BgpConnection getById(String id) {
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
        String connectionName = Utils.getValueFromIdByName(id, "bgpConnections");
        if (connectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'bgpConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualHubName, connectionName, Context.NONE).getValue();
    }

    public Response<BgpConnection> getByIdWithResponse(String id, Context context) {
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
        String connectionName = Utils.getValueFromIdByName(id, "bgpConnections");
        if (connectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'bgpConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, virtualHubName, connectionName, context);
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
        String connectionName = Utils.getValueFromIdByName(id, "bgpConnections");
        if (connectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'bgpConnections'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, connectionName, Context.NONE);
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
        String connectionName = Utils.getValueFromIdByName(id, "bgpConnections");
        if (connectionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'bgpConnections'.", id)));
        }
        this.delete(resourceGroupName, virtualHubName, connectionName, context);
    }

    private VirtualHubBgpConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }

    public BgpConnectionImpl define(String name) {
        return new BgpConnectionImpl(name, this.manager());
    }
}
