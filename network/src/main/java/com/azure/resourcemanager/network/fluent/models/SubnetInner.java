// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ApplicationGatewayIpConfiguration;
import com.azure.resourcemanager.network.models.Delegation;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.ResourceNavigationLink;
import com.azure.resourcemanager.network.models.ServiceAssociationLink;
import com.azure.resourcemanager.network.models.ServiceEndpointPropertiesFormat;
import com.azure.resourcemanager.network.models.VirtualNetworkPrivateEndpointNetworkPolicies;
import com.azure.resourcemanager.network.models.VirtualNetworkPrivateLinkServiceNetworkPolicies;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Subnet in a virtual network resource. */
@JsonFlatten
@Fluent
public class SubnetInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubnetInner.class);

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource type.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The address prefix for the subnet.
     */
    @JsonProperty(value = "properties.addressPrefix")
    private String addressPrefix;

    /*
     * List of address prefixes for the subnet.
     */
    @JsonProperty(value = "properties.addressPrefixes")
    private List<String> addressPrefixes;

    /*
     * The reference to the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private NetworkSecurityGroupInner networkSecurityGroup;

    /*
     * The reference to the RouteTable resource.
     */
    @JsonProperty(value = "properties.routeTable")
    private RouteTableInner routeTable;

    /*
     * Nat gateway associated with this subnet.
     */
    @JsonProperty(value = "properties.natGateway")
    private SubResource natGateway;

    /*
     * An array of service endpoints.
     */
    @JsonProperty(value = "properties.serviceEndpoints")
    private List<ServiceEndpointPropertiesFormat> serviceEndpoints;

    /*
     * An array of service endpoint policies.
     */
    @JsonProperty(value = "properties.serviceEndpointPolicies")
    private List<ServiceEndpointPolicyInner> serviceEndpointPolicies;

    /*
     * An array of references to private endpoints.
     */
    @JsonProperty(value = "properties.privateEndpoints", access = JsonProperty.Access.WRITE_ONLY)
    private List<PrivateEndpointInner> privateEndpoints;

    /*
     * An array of references to the network interface IP configurations using
     * subnet.
     */
    @JsonProperty(value = "properties.ipConfigurations", access = JsonProperty.Access.WRITE_ONLY)
    private List<IpConfigurationInner> ipConfigurations;

    /*
     * Array of IP configuration profiles which reference this subnet.
     */
    @JsonProperty(value = "properties.ipConfigurationProfiles", access = JsonProperty.Access.WRITE_ONLY)
    private List<IpConfigurationProfileInner> ipConfigurationProfiles;

    /*
     * Array of IpAllocation which reference this subnet.
     */
    @JsonProperty(value = "properties.ipAllocations")
    private List<SubResource> ipAllocations;

    /*
     * An array of references to the external resources using subnet.
     */
    @JsonProperty(value = "properties.resourceNavigationLinks", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceNavigationLink> resourceNavigationLinks;

    /*
     * An array of references to services injecting into this subnet.
     */
    @JsonProperty(value = "properties.serviceAssociationLinks", access = JsonProperty.Access.WRITE_ONLY)
    private List<ServiceAssociationLink> serviceAssociationLinks;

    /*
     * An array of references to the delegations on the subnet.
     */
    @JsonProperty(value = "properties.delegations")
    private List<Delegation> delegations;

    /*
     * A read-only string identifying the intention of use for this subnet
     * based on delegations and other user-defined properties.
     */
    @JsonProperty(value = "properties.purpose", access = JsonProperty.Access.WRITE_ONLY)
    private String purpose;

    /*
     * The provisioning state of the subnet resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Enable or Disable apply network policies on private end point in the
     * subnet.
     */
    @JsonProperty(value = "properties.privateEndpointNetworkPolicies")
    private VirtualNetworkPrivateEndpointNetworkPolicies privateEndpointNetworkPolicies;

    /*
     * Enable or Disable apply network policies on private link service in the
     * subnet.
     */
    @JsonProperty(value = "properties.privateLinkServiceNetworkPolicies")
    private VirtualNetworkPrivateLinkServiceNetworkPolicies privateLinkServiceNetworkPolicies;

    /*
     * Application gateway IP configurations of virtual network resource.
     */
    @JsonProperty(value = "properties.applicationGatewayIpConfigurations")
    private List<ApplicationGatewayIpConfiguration> applicationGatewayIpConfigurations;

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withName(String name) {
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
     * Get the type property: Resource type.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Resource type.
     *
     * @param type the type value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the addressPrefix property: The address prefix for the subnet.
     *
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: The address prefix for the subnet.
     *
     * @param addressPrefix the addressPrefix value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the addressPrefixes property: List of address prefixes for the subnet.
     *
     * @return the addressPrefixes value.
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

    /**
     * Set the addressPrefixes property: List of address prefixes for the subnet.
     *
     * @param addressPrefixes the addressPrefixes value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withAddressPrefixes(List<String> addressPrefixes) {
        this.addressPrefixes = addressPrefixes;
        return this;
    }

    /**
     * Get the networkSecurityGroup property: The reference to the NetworkSecurityGroup resource.
     *
     * @return the networkSecurityGroup value.
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup property: The reference to the NetworkSecurityGroup resource.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the routeTable property: The reference to the RouteTable resource.
     *
     * @return the routeTable value.
     */
    public RouteTableInner routeTable() {
        return this.routeTable;
    }

    /**
     * Set the routeTable property: The reference to the RouteTable resource.
     *
     * @param routeTable the routeTable value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withRouteTable(RouteTableInner routeTable) {
        this.routeTable = routeTable;
        return this;
    }

    /**
     * Get the natGateway property: Nat gateway associated with this subnet.
     *
     * @return the natGateway value.
     */
    public SubResource natGateway() {
        return this.natGateway;
    }

    /**
     * Set the natGateway property: Nat gateway associated with this subnet.
     *
     * @param natGateway the natGateway value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withNatGateway(SubResource natGateway) {
        this.natGateway = natGateway;
        return this;
    }

    /**
     * Get the serviceEndpoints property: An array of service endpoints.
     *
     * @return the serviceEndpoints value.
     */
    public List<ServiceEndpointPropertiesFormat> serviceEndpoints() {
        return this.serviceEndpoints;
    }

    /**
     * Set the serviceEndpoints property: An array of service endpoints.
     *
     * @param serviceEndpoints the serviceEndpoints value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withServiceEndpoints(List<ServiceEndpointPropertiesFormat> serviceEndpoints) {
        this.serviceEndpoints = serviceEndpoints;
        return this;
    }

    /**
     * Get the serviceEndpointPolicies property: An array of service endpoint policies.
     *
     * @return the serviceEndpointPolicies value.
     */
    public List<ServiceEndpointPolicyInner> serviceEndpointPolicies() {
        return this.serviceEndpointPolicies;
    }

    /**
     * Set the serviceEndpointPolicies property: An array of service endpoint policies.
     *
     * @param serviceEndpointPolicies the serviceEndpointPolicies value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withServiceEndpointPolicies(List<ServiceEndpointPolicyInner> serviceEndpointPolicies) {
        this.serviceEndpointPolicies = serviceEndpointPolicies;
        return this;
    }

    /**
     * Get the privateEndpoints property: An array of references to private endpoints.
     *
     * @return the privateEndpoints value.
     */
    public List<PrivateEndpointInner> privateEndpoints() {
        return this.privateEndpoints;
    }

    /**
     * Get the ipConfigurations property: An array of references to the network interface IP configurations using
     * subnet.
     *
     * @return the ipConfigurations value.
     */
    public List<IpConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get the ipConfigurationProfiles property: Array of IP configuration profiles which reference this subnet.
     *
     * @return the ipConfigurationProfiles value.
     */
    public List<IpConfigurationProfileInner> ipConfigurationProfiles() {
        return this.ipConfigurationProfiles;
    }

    /**
     * Get the ipAllocations property: Array of IpAllocation which reference this subnet.
     *
     * @return the ipAllocations value.
     */
    public List<SubResource> ipAllocations() {
        return this.ipAllocations;
    }

    /**
     * Set the ipAllocations property: Array of IpAllocation which reference this subnet.
     *
     * @param ipAllocations the ipAllocations value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withIpAllocations(List<SubResource> ipAllocations) {
        this.ipAllocations = ipAllocations;
        return this;
    }

    /**
     * Get the resourceNavigationLinks property: An array of references to the external resources using subnet.
     *
     * @return the resourceNavigationLinks value.
     */
    public List<ResourceNavigationLink> resourceNavigationLinks() {
        return this.resourceNavigationLinks;
    }

    /**
     * Get the serviceAssociationLinks property: An array of references to services injecting into this subnet.
     *
     * @return the serviceAssociationLinks value.
     */
    public List<ServiceAssociationLink> serviceAssociationLinks() {
        return this.serviceAssociationLinks;
    }

    /**
     * Get the delegations property: An array of references to the delegations on the subnet.
     *
     * @return the delegations value.
     */
    public List<Delegation> delegations() {
        return this.delegations;
    }

    /**
     * Set the delegations property: An array of references to the delegations on the subnet.
     *
     * @param delegations the delegations value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withDelegations(List<Delegation> delegations) {
        this.delegations = delegations;
        return this;
    }

    /**
     * Get the purpose property: A read-only string identifying the intention of use for this subnet based on
     * delegations and other user-defined properties.
     *
     * @return the purpose value.
     */
    public String purpose() {
        return this.purpose;
    }

    /**
     * Get the provisioningState property: The provisioning state of the subnet resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the privateEndpointNetworkPolicies property: Enable or Disable apply network policies on private end point in
     * the subnet.
     *
     * @return the privateEndpointNetworkPolicies value.
     */
    public VirtualNetworkPrivateEndpointNetworkPolicies privateEndpointNetworkPolicies() {
        return this.privateEndpointNetworkPolicies;
    }

    /**
     * Set the privateEndpointNetworkPolicies property: Enable or Disable apply network policies on private end point in
     * the subnet.
     *
     * @param privateEndpointNetworkPolicies the privateEndpointNetworkPolicies value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withPrivateEndpointNetworkPolicies(
        VirtualNetworkPrivateEndpointNetworkPolicies privateEndpointNetworkPolicies) {
        this.privateEndpointNetworkPolicies = privateEndpointNetworkPolicies;
        return this;
    }

    /**
     * Get the privateLinkServiceNetworkPolicies property: Enable or Disable apply network policies on private link
     * service in the subnet.
     *
     * @return the privateLinkServiceNetworkPolicies value.
     */
    public VirtualNetworkPrivateLinkServiceNetworkPolicies privateLinkServiceNetworkPolicies() {
        return this.privateLinkServiceNetworkPolicies;
    }

    /**
     * Set the privateLinkServiceNetworkPolicies property: Enable or Disable apply network policies on private link
     * service in the subnet.
     *
     * @param privateLinkServiceNetworkPolicies the privateLinkServiceNetworkPolicies value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withPrivateLinkServiceNetworkPolicies(
        VirtualNetworkPrivateLinkServiceNetworkPolicies privateLinkServiceNetworkPolicies) {
        this.privateLinkServiceNetworkPolicies = privateLinkServiceNetworkPolicies;
        return this;
    }

    /**
     * Get the applicationGatewayIpConfigurations property: Application gateway IP configurations of virtual network
     * resource.
     *
     * @return the applicationGatewayIpConfigurations value.
     */
    public List<ApplicationGatewayIpConfiguration> applicationGatewayIpConfigurations() {
        return this.applicationGatewayIpConfigurations;
    }

    /**
     * Set the applicationGatewayIpConfigurations property: Application gateway IP configurations of virtual network
     * resource.
     *
     * @param applicationGatewayIpConfigurations the applicationGatewayIpConfigurations value to set.
     * @return the SubnetInner object itself.
     */
    public SubnetInner withApplicationGatewayIpConfigurations(
        List<ApplicationGatewayIpConfiguration> applicationGatewayIpConfigurations) {
        this.applicationGatewayIpConfigurations = applicationGatewayIpConfigurations;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SubnetInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkSecurityGroup() != null) {
            networkSecurityGroup().validate();
        }
        if (routeTable() != null) {
            routeTable().validate();
        }
        if (serviceEndpoints() != null) {
            serviceEndpoints().forEach(e -> e.validate());
        }
        if (serviceEndpointPolicies() != null) {
            serviceEndpointPolicies().forEach(e -> e.validate());
        }
        if (privateEndpoints() != null) {
            privateEndpoints().forEach(e -> e.validate());
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (ipConfigurationProfiles() != null) {
            ipConfigurationProfiles().forEach(e -> e.validate());
        }
        if (resourceNavigationLinks() != null) {
            resourceNavigationLinks().forEach(e -> e.validate());
        }
        if (serviceAssociationLinks() != null) {
            serviceAssociationLinks().forEach(e -> e.validate());
        }
        if (delegations() != null) {
            delegations().forEach(e -> e.validate());
        }
        if (applicationGatewayIpConfigurations() != null) {
            applicationGatewayIpConfigurations().forEach(e -> e.validate());
        }
    }
}
