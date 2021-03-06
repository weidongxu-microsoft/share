// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.AvailableDelegationsClient;
import com.azure.resourcemanager.network.fluent.models.AvailableDelegationInner;
import com.azure.resourcemanager.network.models.AvailableDelegation;
import com.azure.resourcemanager.network.models.AvailableDelegations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class AvailableDelegationsImpl implements AvailableDelegations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableDelegationsImpl.class);

    private final AvailableDelegationsClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public AvailableDelegationsImpl(
        AvailableDelegationsClient innerClient, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<AvailableDelegation> list(String location) {
        PagedIterable<AvailableDelegationInner> inner = this.serviceClient().list(location);
        return Utils.mapPage(inner, inner1 -> new AvailableDelegationImpl(inner1, this.manager()));
    }

    public PagedIterable<AvailableDelegation> list(String location, Context context) {
        PagedIterable<AvailableDelegationInner> inner = this.serviceClient().list(location, context);
        return Utils.mapPage(inner, inner1 -> new AvailableDelegationImpl(inner1, this.manager()));
    }

    private AvailableDelegationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
