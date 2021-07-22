// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.AvailablePrivateEndpointTypesClient;
import com.azure.resourcemanager.network.fluent.models.AvailablePrivateEndpointTypeInner;
import com.azure.resourcemanager.network.models.AvailablePrivateEndpointType;
import com.azure.resourcemanager.network.models.AvailablePrivateEndpointTypes;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AvailablePrivateEndpointTypesImpl implements AvailablePrivateEndpointTypes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailablePrivateEndpointTypesImpl.class);

    private final AvailablePrivateEndpointTypesClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public AvailablePrivateEndpointTypesImpl(
        AvailablePrivateEndpointTypesClient innerClient,
        com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AvailablePrivateEndpointType> list(String location) {
        PagedIterable<AvailablePrivateEndpointTypeInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new AvailablePrivateEndpointTypeImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailablePrivateEndpointType> list(String location, Context context) {
        PagedIterable<AvailablePrivateEndpointTypeInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new AvailablePrivateEndpointTypeImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailablePrivateEndpointType> listByResourceGroup(String location, String resourceGroupName) {
        PagedIterable<AvailablePrivateEndpointTypeInner> inner =
            this.serviceClient().listByResourceGroup(location, resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new AvailablePrivateEndpointTypeImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailablePrivateEndpointType> listByResourceGroup(
        String location, String resourceGroupName, Context context) {
        PagedIterable<AvailablePrivateEndpointTypeInner> inner =
            this.serviceClient().listByResourceGroup(location, resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new AvailablePrivateEndpointTypeImpl(inner1, this.manager()));
    }

    private AvailablePrivateEndpointTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}