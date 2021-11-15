// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.VpnClientIPsecParametersInner;

/** Resource collection API of VirtualNetworkGateways. */
public interface VirtualNetworkGateways {
    /**
     * Gets the specified virtual network gateway by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway by resource group.
     */
    VirtualNetworkGateway getByResourceGroup(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Gets the specified virtual network gateway by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway by resource group.
     */
    Response<VirtualNetworkGateway> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualNetworkGatewayName, Context context);

    /**
     * Deletes the specified virtual network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Deletes the specified virtual network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualNetworkGatewayName, Context context);

    /**
     * Gets all virtual network gateways by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual network gateways by resource group.
     */
    PagedIterable<VirtualNetworkGateway> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all virtual network gateways by resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all virtual network gateways by resource group.
     */
    PagedIterable<VirtualNetworkGateway> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the connections in a virtual network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the connections in a virtual network gateway.
     */
    PagedIterable<VirtualNetworkGatewayConnectionListEntity> listConnections(
        String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Gets all the connections in a virtual network gateway.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the connections in a virtual network gateway.
     */
    PagedIterable<VirtualNetworkGatewayConnectionListEntity> listConnections(
        String resourceGroupName, String virtualNetworkGatewayName, Context context);

    /**
     * Resets the primary of the virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param gatewayVip Virtual network gateway vip address supplied to the begin reset of the active-active feature
     *     enabled gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    VirtualNetworkGateway reset(String resourceGroupName, String virtualNetworkGatewayName, String gatewayVip);

    /**
     * Resets the primary of the virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    VirtualNetworkGateway reset(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Resets the primary of the virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param gatewayVip Virtual network gateway vip address supplied to the begin reset of the active-active feature
     *     enabled gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a common class for general resource information.
     */
    VirtualNetworkGateway reset(
        String resourceGroupName, String virtualNetworkGatewayName, String gatewayVip, Context context);

    /**
     * Resets the VPN client shared key of the virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetVpnClientSharedKey(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Resets the VPN client shared key of the virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void resetVpnClientSharedKey(String resourceGroupName, String virtualNetworkGatewayName, Context context);

    /**
     * Generates VPN client package for P2S client of the virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the generate virtual network gateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String generatevpnclientpackage(
        String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters);

    /**
     * Generates VPN client package for P2S client of the virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the generate virtual network gateway VPN client package operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String generatevpnclientpackage(
        String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters, Context context);

    /**
     * Generates VPN profile for P2S client of the virtual network gateway in the specified resource group. Used for
     * IKEV2 and radius based authentication.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the generate virtual network gateway VPN client package operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String generateVpnProfile(
        String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters);

    /**
     * Generates VPN profile for P2S client of the virtual network gateway in the specified resource group. Used for
     * IKEV2 and radius based authentication.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Parameters supplied to the generate virtual network gateway VPN client package operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String generateVpnProfile(
        String resourceGroupName, String virtualNetworkGatewayName, VpnClientParameters parameters, Context context);

    /**
     * Gets pre-generated VPN profile for P2S client of the virtual network gateway in the specified resource group. The
     * profile needs to be generated first using generateVpnProfile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pre-generated VPN profile for P2S client of the virtual network gateway in the specified resource group.
     */
    String getVpnProfilePackageUrl(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Gets pre-generated VPN profile for P2S client of the virtual network gateway in the specified resource group. The
     * profile needs to be generated first using generateVpnProfile.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return pre-generated VPN profile for P2S client of the virtual network gateway in the specified resource group.
     */
    String getVpnProfilePackageUrl(String resourceGroupName, String virtualNetworkGatewayName, Context context);

    /**
     * The GetBgpPeerStatus operation retrieves the status of all BGP peers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param peer The IP address of the peer to retrieve the status of.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list BGP peer status API service call.
     */
    BgpPeerStatusListResult getBgpPeerStatus(String resourceGroupName, String virtualNetworkGatewayName, String peer);

    /**
     * The GetBgpPeerStatus operation retrieves the status of all BGP peers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list BGP peer status API service call.
     */
    BgpPeerStatusListResult getBgpPeerStatus(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * The GetBgpPeerStatus operation retrieves the status of all BGP peers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param peer The IP address of the peer to retrieve the status of.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for list BGP peer status API service call.
     */
    BgpPeerStatusListResult getBgpPeerStatus(
        String resourceGroupName, String virtualNetworkGatewayName, String peer, Context context);

    /**
     * Gets a xml format representation for supported vpn devices.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a xml format representation for supported vpn devices.
     */
    String supportedVpnDevices(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Gets a xml format representation for supported vpn devices.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a xml format representation for supported vpn devices.
     */
    Response<String> supportedVpnDevicesWithResponse(
        String resourceGroupName, String virtualNetworkGatewayName, Context context);

    /**
     * This operation retrieves a list of routes the virtual network gateway has learned, including routes learned from
     * BGP peers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual network gateway routes.
     */
    GatewayRouteListResult getLearnedRoutes(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * This operation retrieves a list of routes the virtual network gateway has learned, including routes learned from
     * BGP peers.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual network gateway routes.
     */
    GatewayRouteListResult getLearnedRoutes(
        String resourceGroupName, String virtualNetworkGatewayName, Context context);

    /**
     * This operation retrieves a list of routes the virtual network gateway is advertising to the specified peer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param peer The IP address of the peer.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual network gateway routes.
     */
    GatewayRouteListResult getAdvertisedRoutes(String resourceGroupName, String virtualNetworkGatewayName, String peer);

    /**
     * This operation retrieves a list of routes the virtual network gateway is advertising to the specified peer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param peer The IP address of the peer.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of virtual network gateway routes.
     */
    GatewayRouteListResult getAdvertisedRoutes(
        String resourceGroupName, String virtualNetworkGatewayName, String peer, Context context);

    /**
     * The Set VpnclientIpsecParameters operation sets the vpnclient ipsec policy for P2S client of virtual network
     * gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param vpnclientIpsecParams Parameters supplied to the Begin Set vpnclient ipsec parameters of Virtual Network
     *     Gateway P2S client operation through Network resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an IPSec parameters for a virtual network gateway P2S connection.
     */
    VpnClientIPsecParameters setVpnclientIpsecParameters(
        String resourceGroupName, String virtualNetworkGatewayName, VpnClientIPsecParametersInner vpnclientIpsecParams);

    /**
     * The Set VpnclientIpsecParameters operation sets the vpnclient ipsec policy for P2S client of virtual network
     * gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param vpnclientIpsecParams Parameters supplied to the Begin Set vpnclient ipsec parameters of Virtual Network
     *     Gateway P2S client operation through Network resource provider.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an IPSec parameters for a virtual network gateway P2S connection.
     */
    VpnClientIPsecParameters setVpnclientIpsecParameters(
        String resourceGroupName,
        String virtualNetworkGatewayName,
        VpnClientIPsecParametersInner vpnclientIpsecParams,
        Context context);

    /**
     * The Get VpnclientIpsecParameters operation retrieves information about the vpnclient ipsec policy for P2S client
     * of virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The virtual network gateway name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an IPSec parameters for a virtual network gateway P2S connection.
     */
    VpnClientIPsecParameters getVpnclientIpsecParameters(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * The Get VpnclientIpsecParameters operation retrieves information about the vpnclient ipsec policy for P2S client
     * of virtual network gateway in the specified resource group through Network resource provider.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The virtual network gateway name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an IPSec parameters for a virtual network gateway P2S connection.
     */
    VpnClientIPsecParameters getVpnclientIpsecParameters(
        String resourceGroupName, String virtualNetworkGatewayName, Context context);

    /**
     * Gets a xml format representation for vpn device configuration script.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection for which the
     *     configuration script is generated.
     * @param parameters Parameters supplied to the generate vpn device script operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a xml format representation for vpn device configuration script.
     */
    String vpnDeviceConfigurationScript(
        String resourceGroupName, String virtualNetworkGatewayConnectionName, VpnDeviceScriptParameters parameters);

    /**
     * Gets a xml format representation for vpn device configuration script.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayConnectionName The name of the virtual network gateway connection for which the
     *     configuration script is generated.
     * @param parameters Parameters supplied to the generate vpn device script operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a xml format representation for vpn device configuration script.
     */
    Response<String> vpnDeviceConfigurationScriptWithResponse(
        String resourceGroupName,
        String virtualNetworkGatewayConnectionName,
        VpnDeviceScriptParameters parameters,
        Context context);

    /**
     * Starts packet capture on virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Virtual network gateway packet capture parameters supplied to start packet capture on gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String startPacketCapture(
        String resourceGroupName, String virtualNetworkGatewayName, VpnPacketCaptureStartParameters parameters);

    /**
     * Starts packet capture on virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String startPacketCapture(String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Starts packet capture on virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Virtual network gateway packet capture parameters supplied to start packet capture on gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String startPacketCapture(
        String resourceGroupName,
        String virtualNetworkGatewayName,
        VpnPacketCaptureStartParameters parameters,
        Context context);

    /**
     * Stops packet capture on virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Virtual network gateway packet capture parameters supplied to stop packet capture on gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String stopPacketCapture(
        String resourceGroupName, String virtualNetworkGatewayName, VpnPacketCaptureStopParameters parameters);

    /**
     * Stops packet capture on virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param parameters Virtual network gateway packet capture parameters supplied to stop packet capture on gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    String stopPacketCapture(
        String resourceGroupName,
        String virtualNetworkGatewayName,
        VpnPacketCaptureStopParameters parameters,
        Context context);

    /**
     * Get VPN client connection health detail per P2S client connection of the virtual network gateway in the specified
     * resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vPN client connection health detail per P2S client connection of the virtual network gateway in the
     *     specified resource group.
     */
    VpnClientConnectionHealthDetailListResult getVpnclientConnectionHealth(
        String resourceGroupName, String virtualNetworkGatewayName);

    /**
     * Get VPN client connection health detail per P2S client connection of the virtual network gateway in the specified
     * resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vPN client connection health detail per P2S client connection of the virtual network gateway in the
     *     specified resource group.
     */
    VpnClientConnectionHealthDetailListResult getVpnclientConnectionHealth(
        String resourceGroupName, String virtualNetworkGatewayName, Context context);

    /**
     * Disconnect vpn connections of virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param request The parameters are supplied to disconnect vpn connections.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disconnectVirtualNetworkGatewayVpnConnections(
        String resourceGroupName, String virtualNetworkGatewayName, P2SVpnConnectionRequest request);

    /**
     * Disconnect vpn connections of virtual network gateway in the specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkGatewayName The name of the virtual network gateway.
     * @param request The parameters are supplied to disconnect vpn connections.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void disconnectVirtualNetworkGatewayVpnConnections(
        String resourceGroupName, String virtualNetworkGatewayName, P2SVpnConnectionRequest request, Context context);

    /**
     * Gets the specified virtual network gateway by resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway by resource group.
     */
    VirtualNetworkGateway getById(String id);

    /**
     * Gets the specified virtual network gateway by resource group.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified virtual network gateway by resource group.
     */
    Response<VirtualNetworkGateway> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified virtual network gateway.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified virtual network gateway.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VirtualNetworkGateway resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualNetworkGateway definition.
     */
    VirtualNetworkGateway.DefinitionStages.Blank define(String name);
}
