// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.fluent.DiskAccessesClient;
import com.azure.resourcemanager.compute.fluent.models.DiskAccessInner;
import com.azure.resourcemanager.compute.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.compute.fluent.models.PrivateLinkResourceListResultInner;
import com.azure.resourcemanager.compute.models.DiskAccess;
import com.azure.resourcemanager.compute.models.DiskAccesses;
import com.azure.resourcemanager.compute.models.PrivateEndpointConnection;
import com.azure.resourcemanager.compute.models.PrivateLinkResourceListResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DiskAccessesImpl implements DiskAccesses {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskAccessesImpl.class);

    private final DiskAccessesClient innerClient;

    private final com.azure.resourcemanager.compute.ComputeManager serviceManager;

    public DiskAccessesImpl(
        DiskAccessesClient innerClient, com.azure.resourcemanager.compute.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DiskAccess getByResourceGroup(String resourceGroupName, String diskAccessName) {
        DiskAccessInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, diskAccessName);
        if (inner != null) {
            return new DiskAccessImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DiskAccess> getByResourceGroupWithResponse(
        String resourceGroupName, String diskAccessName, Context context) {
        Response<DiskAccessInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, diskAccessName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DiskAccessImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String diskAccessName) {
        this.serviceClient().delete(resourceGroupName, diskAccessName);
    }

    public void delete(String resourceGroupName, String diskAccessName, Context context) {
        this.serviceClient().delete(resourceGroupName, diskAccessName, context);
    }

    public PagedIterable<DiskAccess> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DiskAccessInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DiskAccessImpl(inner1, this.manager()));
    }

    public PagedIterable<DiskAccess> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<DiskAccessInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new DiskAccessImpl(inner1, this.manager()));
    }

    public PagedIterable<DiskAccess> list() {
        PagedIterable<DiskAccessInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DiskAccessImpl(inner1, this.manager()));
    }

    public PagedIterable<DiskAccess> list(Context context) {
        PagedIterable<DiskAccessInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new DiskAccessImpl(inner1, this.manager()));
    }

    public PrivateLinkResourceListResult getPrivateLinkResources(String resourceGroupName, String diskAccessName) {
        PrivateLinkResourceListResultInner inner =
            this.serviceClient().getPrivateLinkResources(resourceGroupName, diskAccessName);
        if (inner != null) {
            return new PrivateLinkResourceListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateLinkResourceListResult> getPrivateLinkResourcesWithResponse(
        String resourceGroupName, String diskAccessName, Context context) {
        Response<PrivateLinkResourceListResultInner> inner =
            this.serviceClient().getPrivateLinkResourcesWithResponse(resourceGroupName, diskAccessName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateLinkResourceListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection updateAPrivateEndpointConnection(
        String resourceGroupName,
        String diskAccessName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection) {
        PrivateEndpointConnectionInner inner =
            this
                .serviceClient()
                .updateAPrivateEndpointConnection(
                    resourceGroupName, diskAccessName, privateEndpointConnectionName, privateEndpointConnection);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection updateAPrivateEndpointConnection(
        String resourceGroupName,
        String diskAccessName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection,
        Context context) {
        PrivateEndpointConnectionInner inner =
            this
                .serviceClient()
                .updateAPrivateEndpointConnection(
                    resourceGroupName,
                    diskAccessName,
                    privateEndpointConnectionName,
                    privateEndpointConnection,
                    context);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PrivateEndpointConnection getAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName) {
        PrivateEndpointConnectionInner inner =
            this
                .serviceClient()
                .getAPrivateEndpointConnection(resourceGroupName, diskAccessName, privateEndpointConnectionName);
        if (inner != null) {
            return new PrivateEndpointConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PrivateEndpointConnection> getAPrivateEndpointConnectionWithResponse(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName, Context context) {
        Response<PrivateEndpointConnectionInner> inner =
            this
                .serviceClient()
                .getAPrivateEndpointConnectionWithResponse(
                    resourceGroupName, diskAccessName, privateEndpointConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PrivateEndpointConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName) {
        this
            .serviceClient()
            .deleteAPrivateEndpointConnection(resourceGroupName, diskAccessName, privateEndpointConnectionName);
    }

    public void deleteAPrivateEndpointConnection(
        String resourceGroupName, String diskAccessName, String privateEndpointConnectionName, Context context) {
        this
            .serviceClient()
            .deleteAPrivateEndpointConnection(
                resourceGroupName, diskAccessName, privateEndpointConnectionName, context);
    }

    public PagedIterable<PrivateEndpointConnection> listPrivateEndpointConnections(
        String resourceGroupName, String diskAccessName) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listPrivateEndpointConnections(resourceGroupName, diskAccessName);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PrivateEndpointConnection> listPrivateEndpointConnections(
        String resourceGroupName, String diskAccessName, Context context) {
        PagedIterable<PrivateEndpointConnectionInner> inner =
            this.serviceClient().listPrivateEndpointConnections(resourceGroupName, diskAccessName, context);
        return Utils.mapPage(inner, inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()));
    }

    public DiskAccess getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String diskAccessName = Utils.getValueFromIdByName(id, "diskAccesses");
        if (diskAccessName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'diskAccesses'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, diskAccessName, Context.NONE).getValue();
    }

    public Response<DiskAccess> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String diskAccessName = Utils.getValueFromIdByName(id, "diskAccesses");
        if (diskAccessName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'diskAccesses'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, diskAccessName, context);
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
        String diskAccessName = Utils.getValueFromIdByName(id, "diskAccesses");
        if (diskAccessName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'diskAccesses'.", id)));
        }
        this.delete(resourceGroupName, diskAccessName, Context.NONE);
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
        String diskAccessName = Utils.getValueFromIdByName(id, "diskAccesses");
        if (diskAccessName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'diskAccesses'.", id)));
        }
        this.delete(resourceGroupName, diskAccessName, context);
    }

    private DiskAccessesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.ComputeManager manager() {
        return this.serviceManager;
    }

    public DiskAccessImpl define(String name) {
        return new DiskAccessImpl(name, this.manager());
    }
}
