// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of NetworkInterfaces. */
public interface NetworkInterfaces {
    /**
     * Gets information about all network interfaces in a role instance in a cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @param roleInstanceName The name of role instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all network interfaces in a role instance in a cloud service.
     */
    PagedIterable<NetworkInterface> listCloudServiceRoleInstanceNetworkInterfaces(
        String resourceGroupName, String cloudServiceName, String roleInstanceName);

    /**
     * Gets information about all network interfaces in a role instance in a cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @param roleInstanceName The name of role instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all network interfaces in a role instance in a cloud service.
     */
    PagedIterable<NetworkInterface> listCloudServiceRoleInstanceNetworkInterfaces(
        String resourceGroupName, String cloudServiceName, String roleInstanceName, Context context);

    /**
     * Gets all network interfaces in a cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a cloud service.
     */
    PagedIterable<NetworkInterface> listCloudServiceNetworkInterfaces(
        String resourceGroupName, String cloudServiceName);

    /**
     * Gets all network interfaces in a cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a cloud service.
     */
    PagedIterable<NetworkInterface> listCloudServiceNetworkInterfaces(
        String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Get the specified network interface in a cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @param roleInstanceName The name of role instance.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface in a cloud service.
     */
    NetworkInterface getCloudServiceNetworkInterface(
        String resourceGroupName, String cloudServiceName, String roleInstanceName, String networkInterfaceName);

    /**
     * Get the specified network interface in a cloud service.
     *
     * @param resourceGroupName The name of the resource group.
     * @param cloudServiceName The name of the cloud service.
     * @param roleInstanceName The name of role instance.
     * @param networkInterfaceName The name of the network interface.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface in a cloud service.
     */
    Response<NetworkInterface> getCloudServiceNetworkInterfaceWithResponse(
        String resourceGroupName,
        String cloudServiceName,
        String roleInstanceName,
        String networkInterfaceName,
        String expand,
        Context context);

    /**
     * Deletes the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String networkInterfaceName);

    /**
     * Deletes the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkInterfaceName, Context context);

    /**
     * Gets information about the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network interface.
     */
    NetworkInterface getByResourceGroup(String resourceGroupName, String networkInterfaceName);

    /**
     * Gets information about the specified network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network interface.
     */
    Response<NetworkInterface> getByResourceGroupWithResponse(
        String resourceGroupName, String networkInterfaceName, String expand, Context context);

    /**
     * Gets all network interfaces in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a subscription.
     */
    PagedIterable<NetworkInterface> list();

    /**
     * Gets all network interfaces in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a subscription.
     */
    PagedIterable<NetworkInterface> list(Context context);

    /**
     * Gets all network interfaces in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a resource group.
     */
    PagedIterable<NetworkInterface> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all network interfaces in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a resource group.
     */
    PagedIterable<NetworkInterface> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all route tables applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables applied to a network interface.
     */
    EffectiveRouteListResult getEffectiveRouteTable(String resourceGroupName, String networkInterfaceName);

    /**
     * Gets all route tables applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all route tables applied to a network interface.
     */
    EffectiveRouteListResult getEffectiveRouteTable(
        String resourceGroupName, String networkInterfaceName, Context context);

    /**
     * Gets all network security groups applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups applied to a network interface.
     */
    EffectiveNetworkSecurityGroupListResult listEffectiveNetworkSecurityGroups(
        String resourceGroupName, String networkInterfaceName);

    /**
     * Gets all network security groups applied to a network interface.
     *
     * @param resourceGroupName The name of the resource group.
     * @param networkInterfaceName The name of the network interface.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network security groups applied to a network interface.
     */
    EffectiveNetworkSecurityGroupListResult listEffectiveNetworkSecurityGroups(
        String resourceGroupName, String networkInterfaceName, Context context);

    /**
     * Gets information about all network interfaces in a virtual machine in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all network interfaces in a virtual machine in a virtual machine scale set.
     */
    PagedIterable<NetworkInterface> listVirtualMachineScaleSetVMNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex);

    /**
     * Gets information about all network interfaces in a virtual machine in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about all network interfaces in a virtual machine in a virtual machine scale set.
     */
    PagedIterable<NetworkInterface> listVirtualMachineScaleSetVMNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName, String virtualmachineIndex, Context context);

    /**
     * Gets all network interfaces in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a virtual machine scale set.
     */
    PagedIterable<NetworkInterface> listVirtualMachineScaleSetNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName);

    /**
     * Gets all network interfaces in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all network interfaces in a virtual machine scale set.
     */
    PagedIterable<NetworkInterface> listVirtualMachineScaleSetNetworkInterfaces(
        String resourceGroupName, String virtualMachineScaleSetName, Context context);

    /**
     * Get the specified network interface in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface in a virtual machine scale set.
     */
    NetworkInterface getVirtualMachineScaleSetNetworkInterface(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName);

    /**
     * Get the specified network interface in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface in a virtual machine scale set.
     */
    Response<NetworkInterface> getVirtualMachineScaleSetNetworkInterfaceWithResponse(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String expand,
        Context context);

    /**
     * Get the specified network interface ip configuration in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface ip configuration in a virtual machine scale set.
     */
    PagedIterable<NetworkInterfaceIpConfiguration> listVirtualMachineScaleSetIpConfigurations(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName);

    /**
     * Get the specified network interface ip configuration in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface ip configuration in a virtual machine scale set.
     */
    PagedIterable<NetworkInterfaceIpConfiguration> listVirtualMachineScaleSetIpConfigurations(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String expand,
        Context context);

    /**
     * Get the specified network interface ip configuration in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface ip configuration in a virtual machine scale set.
     */
    NetworkInterfaceIpConfiguration getVirtualMachineScaleSetIpConfiguration(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName);

    /**
     * Get the specified network interface ip configuration in a virtual machine scale set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualMachineScaleSetName The name of the virtual machine scale set.
     * @param virtualmachineIndex The virtual machine index.
     * @param networkInterfaceName The name of the network interface.
     * @param ipConfigurationName The name of the ip configuration.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified network interface ip configuration in a virtual machine scale set.
     */
    Response<NetworkInterfaceIpConfiguration> getVirtualMachineScaleSetIpConfigurationWithResponse(
        String resourceGroupName,
        String virtualMachineScaleSetName,
        String virtualmachineIndex,
        String networkInterfaceName,
        String ipConfigurationName,
        String expand,
        Context context);

    /**
     * Gets information about the specified network interface.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network interface.
     */
    NetworkInterface getById(String id);

    /**
     * Gets information about the specified network interface.
     *
     * @param id the resource ID.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified network interface.
     */
    Response<NetworkInterface> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Deletes the specified network interface.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified network interface.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new NetworkInterface resource.
     *
     * @param name resource name.
     * @return the first stage of the new NetworkInterface definition.
     */
    NetworkInterface.DefinitionStages.Blank define(String name);
}
