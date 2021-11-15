// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.GatewayLoadBalancerTunnelInterface;
import com.azure.resourcemanager.network.models.LoadBalancerBackendAddress;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Pool of backend IP addresses. */
@JsonFlatten
@Fluent
public class BackendAddressPoolInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BackendAddressPoolInner.class);

    /*
     * The name of the resource that is unique within the set of backend
     * address pools used by the load balancer. This name can be used to access
     * the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The location of the backend address pool.
     */
    @JsonProperty(value = "properties.location")
    private String location;

    /*
     * An array of gateway load balancer tunnel interfaces.
     */
    @JsonProperty(value = "properties.tunnelInterfaces")
    private List<GatewayLoadBalancerTunnelInterface> tunnelInterfaces;

    /*
     * An array of backend addresses.
     */
    @JsonProperty(value = "properties.loadBalancerBackendAddresses")
    private List<LoadBalancerBackendAddress> loadBalancerBackendAddresses;

    /*
     * An array of references to IP addresses defined in network interfaces.
     */
    @JsonProperty(value = "properties.backendIPConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkInterfaceIpConfigurationInner> backendIpConfigurations;

    /*
     * An array of references to load balancing rules that use this backend
     * address pool.
     */
    @JsonProperty(value = "properties.loadBalancingRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> loadBalancingRules;

    /*
     * A reference to an outbound rule that uses this backend address pool.
     */
    @JsonProperty(value = "properties.outboundRule", access = JsonProperty.Access.WRITE_ONLY)
    private SubResource outboundRule;

    /*
     * An array of references to outbound rules that use this backend address
     * pool.
     */
    @JsonProperty(value = "properties.outboundRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> outboundRules;

    /*
     * The provisioning state of the backend address pool resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the name property: The name of the resource that is unique within the set of backend address pools used by
     * the load balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within the set of backend address pools used by
     * the load balancer. This name can be used to access the resource.
     *
     * @param name the name value to set.
     * @return the BackendAddressPoolInner object itself.
     */
    public BackendAddressPoolInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the location property: The location of the backend address pool.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the backend address pool.
     *
     * @param location the location value to set.
     * @return the BackendAddressPoolInner object itself.
     */
    public BackendAddressPoolInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tunnelInterfaces property: An array of gateway load balancer tunnel interfaces.
     *
     * @return the tunnelInterfaces value.
     */
    public List<GatewayLoadBalancerTunnelInterface> tunnelInterfaces() {
        return this.tunnelInterfaces;
    }

    /**
     * Set the tunnelInterfaces property: An array of gateway load balancer tunnel interfaces.
     *
     * @param tunnelInterfaces the tunnelInterfaces value to set.
     * @return the BackendAddressPoolInner object itself.
     */
    public BackendAddressPoolInner withTunnelInterfaces(List<GatewayLoadBalancerTunnelInterface> tunnelInterfaces) {
        this.tunnelInterfaces = tunnelInterfaces;
        return this;
    }

    /**
     * Get the loadBalancerBackendAddresses property: An array of backend addresses.
     *
     * @return the loadBalancerBackendAddresses value.
     */
    public List<LoadBalancerBackendAddress> loadBalancerBackendAddresses() {
        return this.loadBalancerBackendAddresses;
    }

    /**
     * Set the loadBalancerBackendAddresses property: An array of backend addresses.
     *
     * @param loadBalancerBackendAddresses the loadBalancerBackendAddresses value to set.
     * @return the BackendAddressPoolInner object itself.
     */
    public BackendAddressPoolInner withLoadBalancerBackendAddresses(
        List<LoadBalancerBackendAddress> loadBalancerBackendAddresses) {
        this.loadBalancerBackendAddresses = loadBalancerBackendAddresses;
        return this;
    }

    /**
     * Get the backendIpConfigurations property: An array of references to IP addresses defined in network interfaces.
     *
     * @return the backendIpConfigurations value.
     */
    public List<NetworkInterfaceIpConfigurationInner> backendIpConfigurations() {
        return this.backendIpConfigurations;
    }

    /**
     * Get the loadBalancingRules property: An array of references to load balancing rules that use this backend address
     * pool.
     *
     * @return the loadBalancingRules value.
     */
    public List<SubResource> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * Get the outboundRule property: A reference to an outbound rule that uses this backend address pool.
     *
     * @return the outboundRule value.
     */
    public SubResource outboundRule() {
        return this.outboundRule;
    }

    /**
     * Get the outboundRules property: An array of references to outbound rules that use this backend address pool.
     *
     * @return the outboundRules value.
     */
    public List<SubResource> outboundRules() {
        return this.outboundRules;
    }

    /**
     * Get the provisioningState property: The provisioning state of the backend address pool resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /** {@inheritDoc} */
    @Override
    public BackendAddressPoolInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tunnelInterfaces() != null) {
            tunnelInterfaces().forEach(e -> e.validate());
        }
        if (loadBalancerBackendAddresses() != null) {
            loadBalancerBackendAddresses().forEach(e -> e.validate());
        }
        if (backendIpConfigurations() != null) {
            backendIpConfigurations().forEach(e -> e.validate());
        }
    }
}