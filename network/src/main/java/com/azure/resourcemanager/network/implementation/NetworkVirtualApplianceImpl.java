// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.NetworkVirtualApplianceInner;
import com.azure.resourcemanager.network.models.ManagedServiceIdentity;
import com.azure.resourcemanager.network.models.NetworkVirtualAppliance;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.TagsObject;
import com.azure.resourcemanager.network.models.VirtualApplianceNicProperties;
import com.azure.resourcemanager.network.models.VirtualApplianceSkuProperties;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class NetworkVirtualApplianceImpl
    implements NetworkVirtualAppliance, NetworkVirtualAppliance.Definition, NetworkVirtualAppliance.Update {
    private NetworkVirtualApplianceInner innerObject;

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

    public ManagedServiceIdentity identity() {
        return this.innerModel().identity();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public VirtualApplianceSkuProperties nvaSku() {
        return this.innerModel().nvaSku();
    }

    public String addressPrefix() {
        return this.innerModel().addressPrefix();
    }

    public List<String> bootStrapConfigurationBlobs() {
        List<String> inner = this.innerModel().bootStrapConfigurationBlobs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SubResource virtualHub() {
        return this.innerModel().virtualHub();
    }

    public List<String> cloudInitConfigurationBlobs() {
        List<String> inner = this.innerModel().cloudInitConfigurationBlobs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String cloudInitConfiguration() {
        return this.innerModel().cloudInitConfiguration();
    }

    public Long virtualApplianceAsn() {
        return this.innerModel().virtualApplianceAsn();
    }

    public List<VirtualApplianceNicProperties> virtualApplianceNics() {
        List<VirtualApplianceNicProperties> inner = this.innerModel().virtualApplianceNics();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> virtualApplianceSites() {
        List<SubResource> inner = this.innerModel().virtualApplianceSites();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> inboundSecurityRules() {
        List<SubResource> inner = this.innerModel().inboundSecurityRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
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

    public NetworkVirtualApplianceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkVirtualApplianceName;

    private TagsObject updateParameters;

    public NetworkVirtualApplianceImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NetworkVirtualAppliance create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkVirtualAppliances()
                .createOrUpdate(resourceGroupName, networkVirtualApplianceName, this.innerModel(), Context.NONE);
        return this;
    }

    public NetworkVirtualAppliance create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkVirtualAppliances()
                .createOrUpdate(resourceGroupName, networkVirtualApplianceName, this.innerModel(), context);
        return this;
    }

    NetworkVirtualApplianceImpl(String name, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = new NetworkVirtualApplianceInner();
        this.serviceManager = serviceManager;
        this.networkVirtualApplianceName = name;
    }

    public NetworkVirtualApplianceImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public NetworkVirtualAppliance apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkVirtualAppliances()
                .updateTagsWithResponse(resourceGroupName, networkVirtualApplianceName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkVirtualAppliance apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkVirtualAppliances()
                .updateTagsWithResponse(resourceGroupName, networkVirtualApplianceName, updateParameters, context)
                .getValue();
        return this;
    }

    NetworkVirtualApplianceImpl(
        NetworkVirtualApplianceInner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkVirtualApplianceName = Utils.getValueFromIdByName(innerObject.id(), "networkVirtualAppliances");
    }

    public NetworkVirtualAppliance refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkVirtualAppliances()
                .getByResourceGroupWithResponse(
                    resourceGroupName, networkVirtualApplianceName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkVirtualAppliance refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkVirtualAppliances()
                .getByResourceGroupWithResponse(resourceGroupName, networkVirtualApplianceName, localExpand, context)
                .getValue();
        return this;
    }

    public NetworkVirtualApplianceImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkVirtualApplianceImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkVirtualApplianceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NetworkVirtualApplianceImpl withIdentity(ManagedServiceIdentity identity) {
        this.innerModel().withIdentity(identity);
        return this;
    }

    public NetworkVirtualApplianceImpl withNvaSku(VirtualApplianceSkuProperties nvaSku) {
        this.innerModel().withNvaSku(nvaSku);
        return this;
    }

    public NetworkVirtualApplianceImpl withBootStrapConfigurationBlobs(List<String> bootStrapConfigurationBlobs) {
        this.innerModel().withBootStrapConfigurationBlobs(bootStrapConfigurationBlobs);
        return this;
    }

    public NetworkVirtualApplianceImpl withVirtualHub(SubResource virtualHub) {
        this.innerModel().withVirtualHub(virtualHub);
        return this;
    }

    public NetworkVirtualApplianceImpl withCloudInitConfigurationBlobs(List<String> cloudInitConfigurationBlobs) {
        this.innerModel().withCloudInitConfigurationBlobs(cloudInitConfigurationBlobs);
        return this;
    }

    public NetworkVirtualApplianceImpl withCloudInitConfiguration(String cloudInitConfiguration) {
        this.innerModel().withCloudInitConfiguration(cloudInitConfiguration);
        return this;
    }

    public NetworkVirtualApplianceImpl withVirtualApplianceAsn(Long virtualApplianceAsn) {
        this.innerModel().withVirtualApplianceAsn(virtualApplianceAsn);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
