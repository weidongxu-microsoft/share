// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.VirtualHubInner;
import com.azure.resourcemanager.network.fluent.models.VirtualHubRouteTableV2Inner;
import com.azure.resourcemanager.network.models.EffectiveRoutesParameters;
import com.azure.resourcemanager.network.models.PreferredRoutingGateway;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RoutingState;
import com.azure.resourcemanager.network.models.TagsObject;
import com.azure.resourcemanager.network.models.VirtualHub;
import com.azure.resourcemanager.network.models.VirtualHubRouteTable;
import com.azure.resourcemanager.network.models.VirtualHubRouteTableV2;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class VirtualHubImpl implements VirtualHub, VirtualHub.Definition, VirtualHub.Update {
    private VirtualHubInner innerObject;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public SubResource virtualWan() {
        return this.innerModel().virtualWan();
    }

    public SubResource vpnGateway() {
        return this.innerModel().vpnGateway();
    }

    public SubResource p2SVpnGateway() {
        return this.innerModel().p2SVpnGateway();
    }

    public SubResource expressRouteGateway() {
        return this.innerModel().expressRouteGateway();
    }

    public SubResource azureFirewall() {
        return this.innerModel().azureFirewall();
    }

    public SubResource securityPartnerProvider() {
        return this.innerModel().securityPartnerProvider();
    }

    public String addressPrefix() {
        return this.innerModel().addressPrefix();
    }

    public VirtualHubRouteTable routeTable() {
        return this.innerModel().routeTable();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String securityProviderName() {
        return this.innerModel().securityProviderName();
    }

    public List<VirtualHubRouteTableV2> virtualHubRouteTableV2S() {
        List<VirtualHubRouteTableV2Inner> inner = this.innerModel().virtualHubRouteTableV2S();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new VirtualHubRouteTableV2Impl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String sku() {
        return this.innerModel().sku();
    }

    public RoutingState routingState() {
        return this.innerModel().routingState();
    }

    public List<SubResource> bgpConnections() {
        List<SubResource> inner = this.innerModel().bgpConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> ipConfigurations() {
        List<SubResource> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Long virtualRouterAsn() {
        return this.innerModel().virtualRouterAsn();
    }

    public List<String> virtualRouterIps() {
        List<String> inner = this.innerModel().virtualRouterIps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean allowBranchToBranchTraffic() {
        return this.innerModel().allowBranchToBranchTraffic();
    }

    public PreferredRoutingGateway preferredRoutingGateway() {
        return this.innerModel().preferredRoutingGateway();
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

    public VirtualHubInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualHubName;

    private TagsObject updateVirtualHubParameters;

    public VirtualHubImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualHub create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .createOrUpdate(resourceGroupName, virtualHubName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualHub create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .createOrUpdate(resourceGroupName, virtualHubName, this.innerModel(), context);
        return this;
    }

    VirtualHubImpl(String name, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = new VirtualHubInner();
        this.serviceManager = serviceManager;
        this.virtualHubName = name;
    }

    public VirtualHubImpl update() {
        this.updateVirtualHubParameters = new TagsObject();
        return this;
    }

    public VirtualHub apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .updateTagsWithResponse(resourceGroupName, virtualHubName, updateVirtualHubParameters, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualHub apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .updateTagsWithResponse(resourceGroupName, virtualHubName, updateVirtualHubParameters, context)
                .getValue();
        return this;
    }

    VirtualHubImpl(VirtualHubInner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualHubName = Utils.getValueFromIdByName(innerObject.id(), "virtualHubs");
    }

    public VirtualHub refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .getByResourceGroupWithResponse(resourceGroupName, virtualHubName, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualHub refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualHubs()
                .getByResourceGroupWithResponse(resourceGroupName, virtualHubName, context)
                .getValue();
        return this;
    }

    public void getEffectiveVirtualHubRoutes(EffectiveRoutesParameters effectiveRoutesParameters) {
        serviceManager
            .virtualHubs()
            .getEffectiveVirtualHubRoutes(resourceGroupName, virtualHubName, effectiveRoutesParameters);
    }

    public void getEffectiveVirtualHubRoutes() {
        serviceManager.virtualHubs().getEffectiveVirtualHubRoutes(resourceGroupName, virtualHubName);
    }

    public void getEffectiveVirtualHubRoutes(EffectiveRoutesParameters effectiveRoutesParameters, Context context) {
        serviceManager
            .virtualHubs()
            .getEffectiveVirtualHubRoutes(resourceGroupName, virtualHubName, effectiveRoutesParameters, context);
    }

    public VirtualHubImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualHubImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualHubImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateVirtualHubParameters.withTags(tags);
            return this;
        }
    }

    public VirtualHubImpl withVirtualWan(SubResource virtualWan) {
        this.innerModel().withVirtualWan(virtualWan);
        return this;
    }

    public VirtualHubImpl withVpnGateway(SubResource vpnGateway) {
        this.innerModel().withVpnGateway(vpnGateway);
        return this;
    }

    public VirtualHubImpl withP2SVpnGateway(SubResource p2SVpnGateway) {
        this.innerModel().withP2SVpnGateway(p2SVpnGateway);
        return this;
    }

    public VirtualHubImpl withExpressRouteGateway(SubResource expressRouteGateway) {
        this.innerModel().withExpressRouteGateway(expressRouteGateway);
        return this;
    }

    public VirtualHubImpl withAzureFirewall(SubResource azureFirewall) {
        this.innerModel().withAzureFirewall(azureFirewall);
        return this;
    }

    public VirtualHubImpl withSecurityPartnerProvider(SubResource securityPartnerProvider) {
        this.innerModel().withSecurityPartnerProvider(securityPartnerProvider);
        return this;
    }

    public VirtualHubImpl withAddressPrefix(String addressPrefix) {
        this.innerModel().withAddressPrefix(addressPrefix);
        return this;
    }

    public VirtualHubImpl withRouteTable(VirtualHubRouteTable routeTable) {
        this.innerModel().withRouteTable(routeTable);
        return this;
    }

    public VirtualHubImpl withSecurityProviderName(String securityProviderName) {
        this.innerModel().withSecurityProviderName(securityProviderName);
        return this;
    }

    public VirtualHubImpl withVirtualHubRouteTableV2S(List<VirtualHubRouteTableV2Inner> virtualHubRouteTableV2S) {
        this.innerModel().withVirtualHubRouteTableV2S(virtualHubRouteTableV2S);
        return this;
    }

    public VirtualHubImpl withSku(String sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public VirtualHubImpl withVirtualRouterAsn(Long virtualRouterAsn) {
        this.innerModel().withVirtualRouterAsn(virtualRouterAsn);
        return this;
    }

    public VirtualHubImpl withVirtualRouterIps(List<String> virtualRouterIps) {
        this.innerModel().withVirtualRouterIps(virtualRouterIps);
        return this;
    }

    public VirtualHubImpl withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic) {
        this.innerModel().withAllowBranchToBranchTraffic(allowBranchToBranchTraffic);
        return this;
    }

    public VirtualHubImpl withPreferredRoutingGateway(PreferredRoutingGateway preferredRoutingGateway) {
        this.innerModel().withPreferredRoutingGateway(preferredRoutingGateway);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
