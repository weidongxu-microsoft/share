// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.VpnSiteLinkInner;

/** An instance of this class provides access to all the operations defined in VpnSiteLinksClient. */
public interface VpnSiteLinksClient {
    /**
     * Retrieves the details of a VPN site link.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLink Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VpnSiteLinkInner get(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName);

    /**
     * Retrieves the details of a VPN site link.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param vpnSiteLinkName The name of the VpnSiteLink being retrieved.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return vpnSiteLink Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VpnSiteLinkInner> getWithResponse(
        String resourceGroupName, String vpnSiteName, String vpnSiteLinkName, Context context);

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSiteLinks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnSiteLinkInner> listByVpnSite(String resourceGroupName, String vpnSiteName);

    /**
     * Lists all the vpnSiteLinks in a resource group for a vpn site.
     *
     * @param resourceGroupName The resource group name of the VpnSite.
     * @param vpnSiteName The name of the VpnSite.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VpnSiteLinks.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VpnSiteLinkInner> listByVpnSite(String resourceGroupName, String vpnSiteName, Context context);
}
