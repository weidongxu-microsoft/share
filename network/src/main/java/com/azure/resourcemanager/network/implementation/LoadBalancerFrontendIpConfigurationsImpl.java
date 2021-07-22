// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.LoadBalancerFrontendIpConfigurationsClient;
import com.azure.resourcemanager.network.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.models.FrontendIpConfiguration;
import com.azure.resourcemanager.network.models.LoadBalancerFrontendIpConfigurations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class LoadBalancerFrontendIpConfigurationsImpl implements LoadBalancerFrontendIpConfigurations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LoadBalancerFrontendIpConfigurationsImpl.class);

    private final LoadBalancerFrontendIpConfigurationsClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public LoadBalancerFrontendIpConfigurationsImpl(
        LoadBalancerFrontendIpConfigurationsClient innerClient,
        com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<FrontendIpConfiguration> list(String resourceGroupName, String loadBalancerName) {
        PagedIterable<FrontendIpConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, loadBalancerName);
        return Utils.mapPage(inner, inner1 -> new FrontendIpConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<FrontendIpConfiguration> list(
        String resourceGroupName, String loadBalancerName, Context context) {
        PagedIterable<FrontendIpConfigurationInner> inner =
            this.serviceClient().list(resourceGroupName, loadBalancerName, context);
        return Utils.mapPage(inner, inner1 -> new FrontendIpConfigurationImpl(inner1, this.manager()));
    }

    public FrontendIpConfiguration get(
        String resourceGroupName, String loadBalancerName, String frontendIpConfigurationName) {
        FrontendIpConfigurationInner inner =
            this.serviceClient().get(resourceGroupName, loadBalancerName, frontendIpConfigurationName);
        if (inner != null) {
            return new FrontendIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<FrontendIpConfiguration> getWithResponse(
        String resourceGroupName, String loadBalancerName, String frontendIpConfigurationName, Context context) {
        Response<FrontendIpConfigurationInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, loadBalancerName, frontendIpConfigurationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new FrontendIpConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private LoadBalancerFrontendIpConfigurationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
