// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.AzureFirewallInner;
import com.azure.resourcemanager.network.models.AzureFirewall;
import com.azure.resourcemanager.network.models.AzureFirewallApplicationRuleCollection;
import com.azure.resourcemanager.network.models.AzureFirewallIpConfiguration;
import com.azure.resourcemanager.network.models.AzureFirewallIpGroups;
import com.azure.resourcemanager.network.models.AzureFirewallNatRuleCollection;
import com.azure.resourcemanager.network.models.AzureFirewallNetworkRuleCollection;
import com.azure.resourcemanager.network.models.AzureFirewallSku;
import com.azure.resourcemanager.network.models.AzureFirewallThreatIntelMode;
import com.azure.resourcemanager.network.models.HubIpAddresses;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class AzureFirewallImpl implements AzureFirewall, AzureFirewall.Definition, AzureFirewall.Update {
    private AzureFirewallInner innerObject;

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

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public List<AzureFirewallApplicationRuleCollection> applicationRuleCollections() {
        List<AzureFirewallApplicationRuleCollection> inner = this.innerModel().applicationRuleCollections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AzureFirewallNatRuleCollection> natRuleCollections() {
        List<AzureFirewallNatRuleCollection> inner = this.innerModel().natRuleCollections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AzureFirewallNetworkRuleCollection> networkRuleCollections() {
        List<AzureFirewallNetworkRuleCollection> inner = this.innerModel().networkRuleCollections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<AzureFirewallIpConfiguration> ipConfigurations() {
        List<AzureFirewallIpConfiguration> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AzureFirewallIpConfiguration managementIpConfiguration() {
        return this.innerModel().managementIpConfiguration();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public AzureFirewallThreatIntelMode threatIntelMode() {
        return this.innerModel().threatIntelMode();
    }

    public SubResource virtualHub() {
        return this.innerModel().virtualHub();
    }

    public SubResource firewallPolicy() {
        return this.innerModel().firewallPolicy();
    }

    public HubIpAddresses hubIpAddresses() {
        return this.innerModel().hubIpAddresses();
    }

    public List<AzureFirewallIpGroups> ipGroups() {
        List<AzureFirewallIpGroups> inner = this.innerModel().ipGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AzureFirewallSku sku() {
        return this.innerModel().sku();
    }

    public Map<String, String> additionalProperties() {
        Map<String, String> inner = this.innerModel().additionalProperties();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
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

    public AzureFirewallInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String azureFirewallName;

    private TagsObject updateParameters;

    public AzureFirewallImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AzureFirewall create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .createOrUpdate(resourceGroupName, azureFirewallName, this.innerModel(), Context.NONE);
        return this;
    }

    public AzureFirewall create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .createOrUpdate(resourceGroupName, azureFirewallName, this.innerModel(), context);
        return this;
    }

    AzureFirewallImpl(String name, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = new AzureFirewallInner();
        this.serviceManager = serviceManager;
        this.azureFirewallName = name;
    }

    public AzureFirewallImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public AzureFirewall apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .updateTags(resourceGroupName, azureFirewallName, updateParameters, Context.NONE);
        return this;
    }

    public AzureFirewall apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .updateTags(resourceGroupName, azureFirewallName, updateParameters, context);
        return this;
    }

    AzureFirewallImpl(AzureFirewallInner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.azureFirewallName = Utils.getValueFromIdByName(innerObject.id(), "azureFirewalls");
    }

    public AzureFirewall refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .getByResourceGroupWithResponse(resourceGroupName, azureFirewallName, Context.NONE)
                .getValue();
        return this;
    }

    public AzureFirewall refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAzureFirewalls()
                .getByResourceGroupWithResponse(resourceGroupName, azureFirewallName, context)
                .getValue();
        return this;
    }

    public AzureFirewallImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AzureFirewallImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AzureFirewallImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public AzureFirewallImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public AzureFirewallImpl withApplicationRuleCollections(
        List<AzureFirewallApplicationRuleCollection> applicationRuleCollections) {
        this.innerModel().withApplicationRuleCollections(applicationRuleCollections);
        return this;
    }

    public AzureFirewallImpl withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections) {
        this.innerModel().withNatRuleCollections(natRuleCollections);
        return this;
    }

    public AzureFirewallImpl withNetworkRuleCollections(
        List<AzureFirewallNetworkRuleCollection> networkRuleCollections) {
        this.innerModel().withNetworkRuleCollections(networkRuleCollections);
        return this;
    }

    public AzureFirewallImpl withIpConfigurations(List<AzureFirewallIpConfiguration> ipConfigurations) {
        this.innerModel().withIpConfigurations(ipConfigurations);
        return this;
    }

    public AzureFirewallImpl withManagementIpConfiguration(AzureFirewallIpConfiguration managementIpConfiguration) {
        this.innerModel().withManagementIpConfiguration(managementIpConfiguration);
        return this;
    }

    public AzureFirewallImpl withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode) {
        this.innerModel().withThreatIntelMode(threatIntelMode);
        return this;
    }

    public AzureFirewallImpl withVirtualHub(SubResource virtualHub) {
        this.innerModel().withVirtualHub(virtualHub);
        return this;
    }

    public AzureFirewallImpl withFirewallPolicy(SubResource firewallPolicy) {
        this.innerModel().withFirewallPolicy(firewallPolicy);
        return this;
    }

    public AzureFirewallImpl withHubIpAddresses(HubIpAddresses hubIpAddresses) {
        this.innerModel().withHubIpAddresses(hubIpAddresses);
        return this;
    }

    public AzureFirewallImpl withSku(AzureFirewallSku sku) {
        this.innerModel().withSku(sku);
        return this;
    }

    public AzureFirewallImpl withAdditionalProperties(Map<String, String> additionalProperties) {
        this.innerModel().withAdditionalProperties(additionalProperties);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
