// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.NetworkInterfacesClient;
import com.azure.resourcemanager.network.fluent.models.EffectiveNetworkSecurityGroupListResultInner;
import com.azure.resourcemanager.network.fluent.models.EffectiveRouteListResultInner;
import com.azure.resourcemanager.network.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.network.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.models.EffectiveNetworkSecurityGroupListResult;
import com.azure.resourcemanager.network.models.EffectiveRouteListResult;
import com.azure.resourcemanager.network.models.NetworkInterface;
import com.azure.resourcemanager.network.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.models.NetworkInterfaces;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class NetworkInterfacesImpl implements NetworkInterfaces {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfacesImpl.class);

    private final NetworkInterfacesClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public NetworkInterfacesImpl(
        NetworkInterfacesClient innerClient, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NetworkInterface> listCloudServiceRoleInstanceNetworkInterfaces(
        String resourceGroupName, String cloudServiceName, String roleInstanceName) {
        PagedIterable<NetworkInterfaceInner> inner =
            this
                .serviceClient()
                .listCloudServiceRoleInstanceNetworkInterfaces(resourceGroupName, cloudServiceName, roleInstanceName);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> listCloudServiceRoleInstanceNetworkInterfaces(
        String resourceGroupName, String cloudServiceName, String roleInstanceName, Context context) {
        PagedIterable<NetworkInterfaceInner> inner =
            this
                .serviceClient()
                .listCloudServiceRoleInstanceNetworkInterfaces(
                    resourceGroupName, cloudServiceName, roleInstanceName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> listCloudServiceNetworkInterfaces(
        String resourceGroupName, String cloudServiceName) {
        PagedIterable<NetworkInterfaceInner> inner =
            this.serviceClient().listCloudServiceNetworkInterfaces(resourceGroupName, cloudServiceName);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> listCloudServiceNetworkInterfaces(
        String resourceGroupName, String cloudServiceName, Context context) {
        PagedIterable<NetworkInterfaceInner> inner =
            this.serviceClient().listCloudServiceNetworkInterfaces(resourceGroupName, cloudServiceName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public NetworkInterface getCloudServiceNetworkInterface(
        String resourceGroupName, String cloudServiceName, String roleInstanceName, String networkInterfaceName) {
        NetworkInterfaceInner inner =
            this
                .serviceClient()
                .getCloudServiceNetworkInterface(
                    resourceGroupName, cloudServiceName, roleInstanceName, networkInterfaceName);
        if (inner != null) {
            return new NetworkInterfaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkInterface> getCloudServiceNetworkInterfaceWithResponse(
        String resourceGroupName,
        String cloudServiceName,
        String roleInstanceName,
        String networkInterfaceName,
        String expand,
        Context context) {
        Response<NetworkInterfaceInner> inner =
            this
                .serviceClient()
                .getCloudServiceNetworkInterfaceWithResponse(
                    resourceGroupName, cloudServiceName, roleInstanceName, networkInterfaceName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkInterfaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String networkInterfaceName) {
        this.serviceClient().delete(resourceGroupName, networkInterfaceName);
    }

    public void delete(String resourceGroupName, String networkInterfaceName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkInterfaceName, context);
    }

    public NetworkInterface getByResourceGroup(String resourceGroupName, String networkInterfaceName) {
        NetworkInterfaceInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, networkInterfaceName);
        if (inner != null) {
            return new NetworkInterfaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkInterface> getByResourceGroupWithResponse(
        String resourceGroupName, String networkInterfaceName, String expand, Context context) {
        Response<NetworkInterfaceInner> inner =
            this
                .serviceClient()
                .getByResourceGroupWithResponse(resourceGroupName, networkInterfaceName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkInterfaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkInterface> list() {
        PagedIterable<NetworkInterfaceInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> list(Context context) {
        PagedIterable<NetworkInterfaceInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> listByResourceGroup(String resourceGroupName) {
        PagedIterable<NetworkInterfaceInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<NetworkInterfaceInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public EffectiveRouteListResult getEffectiveRouteTable(String resourceGroupName, String networkInterfaceName) {
        EffectiveRouteListResultInner inner =
            this.serviceClient().getEffectiveRouteTable(resourceGroupName, networkInterfaceName);
        if (inner != null) {
            return new EffectiveRouteListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EffectiveRouteListResult getEffectiveRouteTable(
        String resourceGroupName, String networkInterfaceName, Context context) {
        EffectiveRouteListResultInner inner =
            this.serviceClient().getEffectiveRouteTable(resourceGroupName, networkInterfaceName, context);
        if (inner != null) {
            return new EffectiveRouteListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EffectiveNetworkSecurityGroupListResult listEffectiveNetworkSecurityGroups(
        String resourceGroupName, String networkInterfaceName) {
        EffectiveNetworkSecurityGroupListResultInner inner =
            this.serviceClient().listEffectiveNetworkSecurityGroups(resourceGroupName, networkInterfaceName);
        if (inner != null) {
            return new EffectiveNetworkSecurityGroupListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public EffectiveNetworkSecurityGroupListResult listEffectiveNetworkSecurityGroups(
        String resourceGroupName, String networkInterfaceName, Context context) {
        EffectiveNetworkSecurityGroupListResultInner inner =
            this.serviceClient().listEffectiveNetworkSecurityGroups(resourceGroupName, networkInterfaceName, context);
        if (inner != null) {
            return new EffectiveNetworkSecurityGroupListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkInterface> listVirtualMachineScaleSetVMNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex) {
        PagedIterable<NetworkInterfaceInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetVMNetworkInterfaces(
                    resourceGroupName, virtualMachineScaleSetName, virtualmachineIndex);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> listVirtualMachineScaleSetVMNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, Context context) {
        PagedIterable<NetworkInterfaceInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetVMNetworkInterfaces(
                    resourceGroupName, virtualMachineScaleSetName, virtualmachineIndex, context);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> listVirtualMachineScaleSetNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName) {
        PagedIterable<NetworkInterfaceInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetNetworkInterfaces(resourceGroupName, virtualMachineScaleSetName);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> listVirtualMachineScaleSetNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName, Context context) {
        PagedIterable<NetworkInterfaceInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetNetworkInterfaces(resourceGroupName, virtualMachineScaleSetName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public NetworkInterface getVirtualMachineScaleSetNetworkInterface(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName) {
        NetworkInterfaceInner inner =
            this
                .serviceClient()
                .getVirtualMachineScaleSetNetworkInterface(
                    resourceGroupName, virtualMachineScaleSetName, virtualmachineIndex, networkInterfaceName);
        if (inner != null) {
            return new NetworkInterfaceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkInterface> getVirtualMachineScaleSetNetworkInterfaceWithResponse(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String expand,
        Context context) {
        Response<NetworkInterfaceInner> inner =
            this
                .serviceClient()
                .getVirtualMachineScaleSetNetworkInterfaceWithResponse(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    expand,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkInterfaceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<NetworkInterfaceIpConfiguration> listVirtualMachineScaleSetIpConfigurations(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName) {
        PagedIterable<NetworkInterfaceIpConfigurationInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetIpConfigurations(
                    resourceGroupName, virtualMachineScaleSetName, virtualmachineIndex, networkInterfaceName);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceIpConfigurationImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterfaceIpConfiguration> listVirtualMachineScaleSetIpConfigurations(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String expand,
        Context context) {
        PagedIterable<NetworkInterfaceIpConfigurationInner> inner =
            this
                .serviceClient()
                .listVirtualMachineScaleSetIpConfigurations(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    expand,
                    context);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceIpConfigurationImpl(inner1, this.manager()));
    }

    public NetworkInterfaceIpConfiguration getVirtualMachineScaleSetIpConfiguration(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName) {
        NetworkInterfaceIpConfigurationInner inner =
            this
                .serviceClient()
                .getVirtualMachineScaleSetIpConfiguration(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    ipConfigurationName);
        if (inner != null) {
            return new NetworkInterfaceIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkInterfaceIpConfiguration> getVirtualMachineScaleSetIpConfigurationWithResponse(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String expand,
        Context context) {
        Response<NetworkInterfaceIpConfigurationInner> inner =
            this
                .serviceClient()
                .getVirtualMachineScaleSetIpConfigurationWithResponse(
                    resourceGroupName,
                    virtualMachineScaleSetName,
                    virtualmachineIndex,
                    networkInterfaceName,
                    ipConfigurationName,
                    expand,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkInterfaceIpConfigurationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public NetworkInterface getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkInterfaceName = Utils.getValueFromIdByName(id, "networkInterfaces");
        if (networkInterfaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkInterfaces'.", id)));
        }
        String localExpand = null;
        return this
            .getByResourceGroupWithResponse(resourceGroupName, networkInterfaceName, localExpand, Context.NONE)
            .getValue();
    }

    public Response<NetworkInterface> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkInterfaceName = Utils.getValueFromIdByName(id, "networkInterfaces");
        if (networkInterfaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkInterfaces'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, networkInterfaceName, expand, context);
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
        String networkInterfaceName = Utils.getValueFromIdByName(id, "networkInterfaces");
        if (networkInterfaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkInterfaces'.", id)));
        }
        this.delete(resourceGroupName, networkInterfaceName, Context.NONE);
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
        String networkInterfaceName = Utils.getValueFromIdByName(id, "networkInterfaces");
        if (networkInterfaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkInterfaces'.", id)));
        }
        this.delete(resourceGroupName, networkInterfaceName, context);
    }

    private NetworkInterfacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkInterfaceImpl define(String name) {
        return new NetworkInterfaceImpl(name, this.manager());
    }
}