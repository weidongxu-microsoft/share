// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.IpGroupInner;
import com.azure.resourcemanager.network.models.IpGroup;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class IpGroupImpl implements IpGroup, IpGroup.Definition, IpGroup.Update {
    private IpGroupInner innerObject;

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

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<String> ipAddresses() {
        List<String> inner = this.innerModel().ipAddresses();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> firewalls() {
        List<SubResource> inner = this.innerModel().firewalls();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> firewallPolicies() {
        List<SubResource> inner = this.innerModel().firewallPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
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

    public IpGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String ipGroupsName;

    private TagsObject updateParameters;

    public IpGroupImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public IpGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpGroups()
                .createOrUpdate(resourceGroupName, ipGroupsName, this.innerModel(), Context.NONE);
        return this;
    }

    public IpGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpGroups()
                .createOrUpdate(resourceGroupName, ipGroupsName, this.innerModel(), context);
        return this;
    }

    IpGroupImpl(String name, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = new IpGroupInner();
        this.serviceManager = serviceManager;
        this.ipGroupsName = name;
    }

    public IpGroupImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public IpGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpGroups()
                .updateGroupsWithResponse(resourceGroupName, ipGroupsName, updateParameters, Context.NONE)
                .getValue();
        return this;
    }

    public IpGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpGroups()
                .updateGroupsWithResponse(resourceGroupName, ipGroupsName, updateParameters, context)
                .getValue();
        return this;
    }

    IpGroupImpl(IpGroupInner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.ipGroupsName = Utils.getValueFromIdByName(innerObject.id(), "ipGroups");
    }

    public IpGroup refresh() {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpGroups()
                .getByResourceGroupWithResponse(resourceGroupName, ipGroupsName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public IpGroup refresh(Context context) {
        String localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIpGroups()
                .getByResourceGroupWithResponse(resourceGroupName, ipGroupsName, localExpand, context)
                .getValue();
        return this;
    }

    public IpGroupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public IpGroupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public IpGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public IpGroupImpl withIpAddresses(List<String> ipAddresses) {
        this.innerModel().withIpAddresses(ipAddresses);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
