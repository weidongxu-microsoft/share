// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.network.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.network.fluent.models.PrivateLinkServiceInner;
import com.azure.resourcemanager.network.fluent.models.PrivateLinkServiceIpConfigurationInner;
import com.azure.resourcemanager.network.models.ExtendedLocation;
import com.azure.resourcemanager.network.models.FrontendIpConfiguration;
import com.azure.resourcemanager.network.models.NetworkInterface;
import com.azure.resourcemanager.network.models.PrivateEndpointConnection;
import com.azure.resourcemanager.network.models.PrivateLinkService;
import com.azure.resourcemanager.network.models.PrivateLinkServiceIpConfiguration;
import com.azure.resourcemanager.network.models.PrivateLinkServicePropertiesAutoApproval;
import com.azure.resourcemanager.network.models.PrivateLinkServicePropertiesVisibility;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class PrivateLinkServiceImpl
    implements PrivateLinkService, PrivateLinkService.Definition, PrivateLinkService.Update {
    private PrivateLinkServiceInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public List<FrontendIpConfiguration> loadBalancerFrontendIpConfigurations() {
        List<FrontendIpConfigurationInner> inner = this.innerModel().loadBalancerFrontendIpConfigurations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new FrontendIpConfigurationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateLinkServiceIpConfiguration> ipConfigurations() {
        List<PrivateLinkServiceIpConfigurationInner> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateLinkServiceIpConfigurationImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<NetworkInterface> networkInterfaces() {
        List<NetworkInterfaceInner> inner = this.innerModel().networkInterfaces();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new NetworkInterfaceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateLinkServicePropertiesVisibility visibility() {
        return this.innerModel().visibility();
    }

    public PrivateLinkServicePropertiesAutoApproval autoApproval() {
        return this.innerModel().autoApproval();
    }

    public List<String> fqdns() {
        List<String> inner = this.innerModel().fqdns();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String alias() {
        return this.innerModel().alias();
    }

    public Boolean enableProxyProtocol() {
        return this.innerModel().enableProxyProtocol();
    }

    public String id() {
        return this.innerModel().id();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public PrivateLinkServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serviceName;

    public PrivateLinkServiceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public PrivateLinkService create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkServices()
                .createOrUpdate(resourceGroupName, serviceName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateLinkService create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkServices()
                .createOrUpdate(resourceGroupName, serviceName, this.innerModel(), context);
        return this;
    }

    PrivateLinkServiceImpl(String name, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = new PrivateLinkServiceInner();
        this.serviceManager = serviceManager;
        this.serviceName = name;
    }

    public PrivateLinkServiceImpl update() {
        return this;
    }

    public PrivateLinkService apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkServices()
                .createOrUpdate(resourceGroupName, serviceName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateLinkService apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkServices()
                .createOrUpdate(resourceGroupName, serviceName, this.innerModel(), context);
        return this;
    }

    PrivateLinkServiceImpl(
        PrivateLinkServiceInner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serviceName = Utils.getValueFromIdByName(innerObject.id(), "privateLinkServices");
    }

    public PrivateLinkService refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkServices()
                .getByResourceGroupWithResponse(resourceGroupName, serviceName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public PrivateLinkService refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPrivateLinkServices()
                .getByResourceGroupWithResponse(resourceGroupName, serviceName, localExpand, context)
                .getValue();
        return this;
    }

    public PrivateLinkServiceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public PrivateLinkServiceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public PrivateLinkServiceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public PrivateLinkServiceImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public PrivateLinkServiceImpl withLoadBalancerFrontendIpConfigurations(
        List<FrontendIpConfigurationInner> loadBalancerFrontendIpConfigurations) {
        this.innerModel().withLoadBalancerFrontendIpConfigurations(loadBalancerFrontendIpConfigurations);
        return this;
    }

    public PrivateLinkServiceImpl withIpConfigurations(List<PrivateLinkServiceIpConfigurationInner> ipConfigurations) {
        this.innerModel().withIpConfigurations(ipConfigurations);
        return this;
    }

    public PrivateLinkServiceImpl withVisibility(PrivateLinkServicePropertiesVisibility visibility) {
        this.innerModel().withVisibility(visibility);
        return this;
    }

    public PrivateLinkServiceImpl withAutoApproval(PrivateLinkServicePropertiesAutoApproval autoApproval) {
        this.innerModel().withAutoApproval(autoApproval);
        return this;
    }

    public PrivateLinkServiceImpl withFqdns(List<String> fqdns) {
        this.innerModel().withFqdns(fqdns);
        return this;
    }

    public PrivateLinkServiceImpl withEnableProxyProtocol(Boolean enableProxyProtocol) {
        this.innerModel().withEnableProxyProtocol(enableProxyProtocol);
        return this;
    }
}
