// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.VirtualNetworkPeeringInner;

/** An immutable client-side representation of VirtualNetworkPeering. */
public interface VirtualNetworkPeering {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Resource type.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space would be able to
     * access the VMs in remote virtual network space.
     *
     * @return the allowVirtualNetworkAccess value.
     */
    Boolean allowVirtualNetworkAccess();

    /**
     * Gets the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local virtual network
     * will be allowed/disallowed in remote virtual network.
     *
     * @return the allowForwardedTraffic value.
     */
    Boolean allowForwardedTraffic();

    /**
     * Gets the allowGatewayTransit property: If gateway links can be used in remote virtual networking to link to this
     * virtual network.
     *
     * @return the allowGatewayTransit value.
     */
    Boolean allowGatewayTransit();

    /**
     * Gets the useRemoteGateways property: If remote gateways can be used on this virtual network. If the flag is set
     * to true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of remote
     * virtual network for transit. Only one peering can have this flag set to true. This flag cannot be set if virtual
     * network already has a gateway.
     *
     * @return the useRemoteGateways value.
     */
    Boolean useRemoteGateways();

    /**
     * Gets the remoteVirtualNetwork property: The reference to the remote virtual network. The remote virtual network
     * can be in the same or different region (preview). See here to register for the preview and learn more
     * (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
     *
     * @return the remoteVirtualNetwork value.
     */
    SubResource remoteVirtualNetwork();

    /**
     * Gets the remoteAddressSpace property: The reference to the address space peered with the remote virtual network.
     *
     * @return the remoteAddressSpace value.
     */
    AddressSpace remoteAddressSpace();

    /**
     * Gets the remoteVirtualNetworkAddressSpace property: The reference to the current address space of the remote
     * virtual network.
     *
     * @return the remoteVirtualNetworkAddressSpace value.
     */
    AddressSpace remoteVirtualNetworkAddressSpace();

    /**
     * Gets the remoteBgpCommunities property: The reference to the remote virtual network's Bgp Communities.
     *
     * @return the remoteBgpCommunities value.
     */
    VirtualNetworkBgpCommunities remoteBgpCommunities();

    /**
     * Gets the peeringState property: The status of the virtual network peering.
     *
     * @return the peeringState value.
     */
    VirtualNetworkPeeringState peeringState();

    /**
     * Gets the peeringSyncLevel property: The peering sync status of the virtual network peering.
     *
     * @return the peeringSyncLevel value.
     */
    VirtualNetworkPeeringLevel peeringSyncLevel();

    /**
     * Gets the provisioningState property: The provisioning state of the virtual network peering resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the doNotVerifyRemoteGateways property: If we need to verify the provisioning state of the remote gateway.
     *
     * @return the doNotVerifyRemoteGateways value.
     */
    Boolean doNotVerifyRemoteGateways();

    /**
     * Gets the resourceGuid property: The resourceGuid property of the Virtual Network peering resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the inner com.azure.resourcemanager.network.fluent.models.VirtualNetworkPeeringInner object.
     *
     * @return the inner object.
     */
    VirtualNetworkPeeringInner innerModel();

    /** The entirety of the VirtualNetworkPeering definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The VirtualNetworkPeering definition stages. */
    interface DefinitionStages {
        /** The first stage of the VirtualNetworkPeering definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, virtualNetworkName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param virtualNetworkName The name of the virtual network.
             * @return the next definition stage.
             */
            WithCreate withExistingVirtualNetwork(String resourceGroupName, String virtualNetworkName);
        }
        /**
         * The stage of the VirtualNetworkPeering definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithName,
                DefinitionStages.WithType,
                DefinitionStages.WithAllowVirtualNetworkAccess,
                DefinitionStages.WithAllowForwardedTraffic,
                DefinitionStages.WithAllowGatewayTransit,
                DefinitionStages.WithUseRemoteGateways,
                DefinitionStages.WithRemoteVirtualNetwork,
                DefinitionStages.WithRemoteAddressSpace,
                DefinitionStages.WithRemoteVirtualNetworkAddressSpace,
                DefinitionStages.WithRemoteBgpCommunities,
                DefinitionStages.WithPeeringState,
                DefinitionStages.WithPeeringSyncLevel,
                DefinitionStages.WithDoNotVerifyRemoteGateways,
                DefinitionStages.WithSyncRemoteAddressSpace {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            VirtualNetworkPeering create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            VirtualNetworkPeering create(Context context);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             *
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             *     access the resource.
             * @return the next definition stage.
             */
            WithCreate withName(String name);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify type. */
        interface WithType {
            /**
             * Specifies the type property: Resource type..
             *
             * @param type Resource type.
             * @return the next definition stage.
             */
            WithCreate withType(String type);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify allowVirtualNetworkAccess. */
        interface WithAllowVirtualNetworkAccess {
            /**
             * Specifies the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space
             * would be able to access the VMs in remote virtual network space..
             *
             * @param allowVirtualNetworkAccess Whether the VMs in the local virtual network space would be able to
             *     access the VMs in remote virtual network space.
             * @return the next definition stage.
             */
            WithCreate withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify allowForwardedTraffic. */
        interface WithAllowForwardedTraffic {
            /**
             * Specifies the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local
             * virtual network will be allowed/disallowed in remote virtual network..
             *
             * @param allowForwardedTraffic Whether the forwarded traffic from the VMs in the local virtual network will
             *     be allowed/disallowed in remote virtual network.
             * @return the next definition stage.
             */
            WithCreate withAllowForwardedTraffic(Boolean allowForwardedTraffic);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify allowGatewayTransit. */
        interface WithAllowGatewayTransit {
            /**
             * Specifies the allowGatewayTransit property: If gateway links can be used in remote virtual networking to
             * link to this virtual network..
             *
             * @param allowGatewayTransit If gateway links can be used in remote virtual networking to link to this
             *     virtual network.
             * @return the next definition stage.
             */
            WithCreate withAllowGatewayTransit(Boolean allowGatewayTransit);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify useRemoteGateways. */
        interface WithUseRemoteGateways {
            /**
             * Specifies the useRemoteGateways property: If remote gateways can be used on this virtual network. If the
             * flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use
             * gateways of remote virtual network for transit. Only one peering can have this flag set to true. This
             * flag cannot be set if virtual network already has a gateway..
             *
             * @param useRemoteGateways If remote gateways can be used on this virtual network. If the flag is set to
             *     true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of
             *     remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot
             *     be set if virtual network already has a gateway.
             * @return the next definition stage.
             */
            WithCreate withUseRemoteGateways(Boolean useRemoteGateways);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify remoteVirtualNetwork. */
        interface WithRemoteVirtualNetwork {
            /**
             * Specifies the remoteVirtualNetwork property: The reference to the remote virtual network. The remote
             * virtual network can be in the same or different region (preview). See here to register for the preview
             * and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering)..
             *
             * @param remoteVirtualNetwork The reference to the remote virtual network. The remote virtual network can
             *     be in the same or different region (preview). See here to register for the preview and learn more
             *     (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
             * @return the next definition stage.
             */
            WithCreate withRemoteVirtualNetwork(SubResource remoteVirtualNetwork);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify remoteAddressSpace. */
        interface WithRemoteAddressSpace {
            /**
             * Specifies the remoteAddressSpace property: The reference to the address space peered with the remote
             * virtual network..
             *
             * @param remoteAddressSpace The reference to the address space peered with the remote virtual network.
             * @return the next definition stage.
             */
            WithCreate withRemoteAddressSpace(AddressSpace remoteAddressSpace);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify remoteVirtualNetworkAddressSpace. */
        interface WithRemoteVirtualNetworkAddressSpace {
            /**
             * Specifies the remoteVirtualNetworkAddressSpace property: The reference to the current address space of
             * the remote virtual network..
             *
             * @param remoteVirtualNetworkAddressSpace The reference to the current address space of the remote virtual
             *     network.
             * @return the next definition stage.
             */
            WithCreate withRemoteVirtualNetworkAddressSpace(AddressSpace remoteVirtualNetworkAddressSpace);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify remoteBgpCommunities. */
        interface WithRemoteBgpCommunities {
            /**
             * Specifies the remoteBgpCommunities property: The reference to the remote virtual network's Bgp
             * Communities..
             *
             * @param remoteBgpCommunities The reference to the remote virtual network's Bgp Communities.
             * @return the next definition stage.
             */
            WithCreate withRemoteBgpCommunities(VirtualNetworkBgpCommunities remoteBgpCommunities);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify peeringState. */
        interface WithPeeringState {
            /**
             * Specifies the peeringState property: The status of the virtual network peering..
             *
             * @param peeringState The status of the virtual network peering.
             * @return the next definition stage.
             */
            WithCreate withPeeringState(VirtualNetworkPeeringState peeringState);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify peeringSyncLevel. */
        interface WithPeeringSyncLevel {
            /**
             * Specifies the peeringSyncLevel property: The peering sync status of the virtual network peering..
             *
             * @param peeringSyncLevel The peering sync status of the virtual network peering.
             * @return the next definition stage.
             */
            WithCreate withPeeringSyncLevel(VirtualNetworkPeeringLevel peeringSyncLevel);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify doNotVerifyRemoteGateways. */
        interface WithDoNotVerifyRemoteGateways {
            /**
             * Specifies the doNotVerifyRemoteGateways property: If we need to verify the provisioning state of the
             * remote gateway..
             *
             * @param doNotVerifyRemoteGateways If we need to verify the provisioning state of the remote gateway.
             * @return the next definition stage.
             */
            WithCreate withDoNotVerifyRemoteGateways(Boolean doNotVerifyRemoteGateways);
        }
        /** The stage of the VirtualNetworkPeering definition allowing to specify syncRemoteAddressSpace. */
        interface WithSyncRemoteAddressSpace {
            /**
             * Specifies the syncRemoteAddressSpace property: Parameter indicates the intention to sync the peering with
             * the current address space on the remote vNet after it's updated..
             *
             * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current
             *     address space on the remote vNet after it's updated.
             * @return the next definition stage.
             */
            WithCreate withSyncRemoteAddressSpace(SyncRemoteAddressSpace syncRemoteAddressSpace);
        }
    }
    /**
     * Begins update for the VirtualNetworkPeering resource.
     *
     * @return the stage of resource update.
     */
    VirtualNetworkPeering.Update update();

    /** The template for VirtualNetworkPeering update. */
    interface Update
        extends UpdateStages.WithName,
            UpdateStages.WithType,
            UpdateStages.WithAllowVirtualNetworkAccess,
            UpdateStages.WithAllowForwardedTraffic,
            UpdateStages.WithAllowGatewayTransit,
            UpdateStages.WithUseRemoteGateways,
            UpdateStages.WithRemoteVirtualNetwork,
            UpdateStages.WithRemoteAddressSpace,
            UpdateStages.WithRemoteVirtualNetworkAddressSpace,
            UpdateStages.WithRemoteBgpCommunities,
            UpdateStages.WithPeeringState,
            UpdateStages.WithPeeringSyncLevel,
            UpdateStages.WithDoNotVerifyRemoteGateways,
            UpdateStages.WithSyncRemoteAddressSpace {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        VirtualNetworkPeering apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        VirtualNetworkPeering apply(Context context);
    }
    /** The VirtualNetworkPeering update stages. */
    interface UpdateStages {
        /** The stage of the VirtualNetworkPeering update allowing to specify name. */
        interface WithName {
            /**
             * Specifies the name property: The name of the resource that is unique within a resource group. This name
             * can be used to access the resource..
             *
             * @param name The name of the resource that is unique within a resource group. This name can be used to
             *     access the resource.
             * @return the next definition stage.
             */
            Update withName(String name);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify type. */
        interface WithType {
            /**
             * Specifies the type property: Resource type..
             *
             * @param type Resource type.
             * @return the next definition stage.
             */
            Update withType(String type);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify allowVirtualNetworkAccess. */
        interface WithAllowVirtualNetworkAccess {
            /**
             * Specifies the allowVirtualNetworkAccess property: Whether the VMs in the local virtual network space
             * would be able to access the VMs in remote virtual network space..
             *
             * @param allowVirtualNetworkAccess Whether the VMs in the local virtual network space would be able to
             *     access the VMs in remote virtual network space.
             * @return the next definition stage.
             */
            Update withAllowVirtualNetworkAccess(Boolean allowVirtualNetworkAccess);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify allowForwardedTraffic. */
        interface WithAllowForwardedTraffic {
            /**
             * Specifies the allowForwardedTraffic property: Whether the forwarded traffic from the VMs in the local
             * virtual network will be allowed/disallowed in remote virtual network..
             *
             * @param allowForwardedTraffic Whether the forwarded traffic from the VMs in the local virtual network will
             *     be allowed/disallowed in remote virtual network.
             * @return the next definition stage.
             */
            Update withAllowForwardedTraffic(Boolean allowForwardedTraffic);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify allowGatewayTransit. */
        interface WithAllowGatewayTransit {
            /**
             * Specifies the allowGatewayTransit property: If gateway links can be used in remote virtual networking to
             * link to this virtual network..
             *
             * @param allowGatewayTransit If gateway links can be used in remote virtual networking to link to this
             *     virtual network.
             * @return the next definition stage.
             */
            Update withAllowGatewayTransit(Boolean allowGatewayTransit);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify useRemoteGateways. */
        interface WithUseRemoteGateways {
            /**
             * Specifies the useRemoteGateways property: If remote gateways can be used on this virtual network. If the
             * flag is set to true, and allowGatewayTransit on remote peering is also true, virtual network will use
             * gateways of remote virtual network for transit. Only one peering can have this flag set to true. This
             * flag cannot be set if virtual network already has a gateway..
             *
             * @param useRemoteGateways If remote gateways can be used on this virtual network. If the flag is set to
             *     true, and allowGatewayTransit on remote peering is also true, virtual network will use gateways of
             *     remote virtual network for transit. Only one peering can have this flag set to true. This flag cannot
             *     be set if virtual network already has a gateway.
             * @return the next definition stage.
             */
            Update withUseRemoteGateways(Boolean useRemoteGateways);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify remoteVirtualNetwork. */
        interface WithRemoteVirtualNetwork {
            /**
             * Specifies the remoteVirtualNetwork property: The reference to the remote virtual network. The remote
             * virtual network can be in the same or different region (preview). See here to register for the preview
             * and learn more (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering)..
             *
             * @param remoteVirtualNetwork The reference to the remote virtual network. The remote virtual network can
             *     be in the same or different region (preview). See here to register for the preview and learn more
             *     (https://docs.microsoft.com/en-us/azure/virtual-network/virtual-network-create-peering).
             * @return the next definition stage.
             */
            Update withRemoteVirtualNetwork(SubResource remoteVirtualNetwork);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify remoteAddressSpace. */
        interface WithRemoteAddressSpace {
            /**
             * Specifies the remoteAddressSpace property: The reference to the address space peered with the remote
             * virtual network..
             *
             * @param remoteAddressSpace The reference to the address space peered with the remote virtual network.
             * @return the next definition stage.
             */
            Update withRemoteAddressSpace(AddressSpace remoteAddressSpace);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify remoteVirtualNetworkAddressSpace. */
        interface WithRemoteVirtualNetworkAddressSpace {
            /**
             * Specifies the remoteVirtualNetworkAddressSpace property: The reference to the current address space of
             * the remote virtual network..
             *
             * @param remoteVirtualNetworkAddressSpace The reference to the current address space of the remote virtual
             *     network.
             * @return the next definition stage.
             */
            Update withRemoteVirtualNetworkAddressSpace(AddressSpace remoteVirtualNetworkAddressSpace);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify remoteBgpCommunities. */
        interface WithRemoteBgpCommunities {
            /**
             * Specifies the remoteBgpCommunities property: The reference to the remote virtual network's Bgp
             * Communities..
             *
             * @param remoteBgpCommunities The reference to the remote virtual network's Bgp Communities.
             * @return the next definition stage.
             */
            Update withRemoteBgpCommunities(VirtualNetworkBgpCommunities remoteBgpCommunities);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify peeringState. */
        interface WithPeeringState {
            /**
             * Specifies the peeringState property: The status of the virtual network peering..
             *
             * @param peeringState The status of the virtual network peering.
             * @return the next definition stage.
             */
            Update withPeeringState(VirtualNetworkPeeringState peeringState);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify peeringSyncLevel. */
        interface WithPeeringSyncLevel {
            /**
             * Specifies the peeringSyncLevel property: The peering sync status of the virtual network peering..
             *
             * @param peeringSyncLevel The peering sync status of the virtual network peering.
             * @return the next definition stage.
             */
            Update withPeeringSyncLevel(VirtualNetworkPeeringLevel peeringSyncLevel);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify doNotVerifyRemoteGateways. */
        interface WithDoNotVerifyRemoteGateways {
            /**
             * Specifies the doNotVerifyRemoteGateways property: If we need to verify the provisioning state of the
             * remote gateway..
             *
             * @param doNotVerifyRemoteGateways If we need to verify the provisioning state of the remote gateway.
             * @return the next definition stage.
             */
            Update withDoNotVerifyRemoteGateways(Boolean doNotVerifyRemoteGateways);
        }
        /** The stage of the VirtualNetworkPeering update allowing to specify syncRemoteAddressSpace. */
        interface WithSyncRemoteAddressSpace {
            /**
             * Specifies the syncRemoteAddressSpace property: Parameter indicates the intention to sync the peering with
             * the current address space on the remote vNet after it's updated..
             *
             * @param syncRemoteAddressSpace Parameter indicates the intention to sync the peering with the current
             *     address space on the remote vNet after it's updated.
             * @return the next definition stage.
             */
            Update withSyncRemoteAddressSpace(SyncRemoteAddressSpace syncRemoteAddressSpace);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    VirtualNetworkPeering refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    VirtualNetworkPeering refresh(Context context);
}
