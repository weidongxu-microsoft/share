// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.ResourceProvidersClient;
import com.azure.resourcemanager.network.fluent.models.BastionActiveSessionInner;
import com.azure.resourcemanager.network.fluent.models.BastionSessionStateInner;
import com.azure.resourcemanager.network.fluent.models.BastionShareableLinkInner;
import com.azure.resourcemanager.network.fluent.models.DnsNameAvailabilityResultInner;
import com.azure.resourcemanager.network.fluent.models.VirtualWanSecurityProvidersInner;
import com.azure.resourcemanager.network.fluent.models.VpnProfileResponseInner;
import com.azure.resourcemanager.network.models.BastionActiveSession;
import com.azure.resourcemanager.network.models.BastionSessionState;
import com.azure.resourcemanager.network.models.BastionShareableLink;
import com.azure.resourcemanager.network.models.BastionShareableLinkListRequest;
import com.azure.resourcemanager.network.models.DnsNameAvailabilityResult;
import com.azure.resourcemanager.network.models.ResourceProviders;
import com.azure.resourcemanager.network.models.SessionIds;
import com.azure.resourcemanager.network.models.VirtualWanSecurityProviders;
import com.azure.resourcemanager.network.models.VirtualWanVpnProfileParameters;
import com.azure.resourcemanager.network.models.VpnProfileResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ResourceProvidersImpl implements ResourceProviders {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourceProvidersImpl.class);

    private final ResourceProvidersClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public ResourceProvidersImpl(
        ResourceProvidersClient innerClient, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<BastionShareableLink> putBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest) {
        PagedIterable<BastionShareableLinkInner> inner =
            this.serviceClient().putBastionShareableLink(resourceGroupName, bastionHostname, bslRequest);
        return Utils.mapPage(inner, inner1 -> new BastionShareableLinkImpl(inner1, this.manager()));
    }

    public PagedIterable<BastionShareableLink> putBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest, Context context) {
        PagedIterable<BastionShareableLinkInner> inner =
            this.serviceClient().putBastionShareableLink(resourceGroupName, bastionHostname, bslRequest, context);
        return Utils.mapPage(inner, inner1 -> new BastionShareableLinkImpl(inner1, this.manager()));
    }

    public void deleteBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest) {
        this.serviceClient().deleteBastionShareableLink(resourceGroupName, bastionHostname, bslRequest);
    }

    public void deleteBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest, Context context) {
        this.serviceClient().deleteBastionShareableLink(resourceGroupName, bastionHostname, bslRequest, context);
    }

    public PagedIterable<BastionShareableLink> getBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest) {
        PagedIterable<BastionShareableLinkInner> inner =
            this.serviceClient().getBastionShareableLink(resourceGroupName, bastionHostname, bslRequest);
        return Utils.mapPage(inner, inner1 -> new BastionShareableLinkImpl(inner1, this.manager()));
    }

    public PagedIterable<BastionShareableLink> getBastionShareableLink(
        String resourceGroupName, String bastionHostname, BastionShareableLinkListRequest bslRequest, Context context) {
        PagedIterable<BastionShareableLinkInner> inner =
            this.serviceClient().getBastionShareableLink(resourceGroupName, bastionHostname, bslRequest, context);
        return Utils.mapPage(inner, inner1 -> new BastionShareableLinkImpl(inner1, this.manager()));
    }

    public PagedIterable<BastionActiveSession> getActiveSessions(String resourceGroupName, String bastionHostname) {
        PagedIterable<BastionActiveSessionInner> inner =
            this.serviceClient().getActiveSessions(resourceGroupName, bastionHostname);
        return Utils.mapPage(inner, inner1 -> new BastionActiveSessionImpl(inner1, this.manager()));
    }

    public PagedIterable<BastionActiveSession> getActiveSessions(
        String resourceGroupName, String bastionHostname, Context context) {
        PagedIterable<BastionActiveSessionInner> inner =
            this.serviceClient().getActiveSessions(resourceGroupName, bastionHostname, context);
        return Utils.mapPage(inner, inner1 -> new BastionActiveSessionImpl(inner1, this.manager()));
    }

    public PagedIterable<BastionSessionState> disconnectActiveSessions(
        String resourceGroupName, String bastionHostname, SessionIds sessionIds) {
        PagedIterable<BastionSessionStateInner> inner =
            this.serviceClient().disconnectActiveSessions(resourceGroupName, bastionHostname, sessionIds);
        return Utils.mapPage(inner, inner1 -> new BastionSessionStateImpl(inner1, this.manager()));
    }

    public PagedIterable<BastionSessionState> disconnectActiveSessions(
        String resourceGroupName, String bastionHostname, SessionIds sessionIds, Context context) {
        PagedIterable<BastionSessionStateInner> inner =
            this.serviceClient().disconnectActiveSessions(resourceGroupName, bastionHostname, sessionIds, context);
        return Utils.mapPage(inner, inner1 -> new BastionSessionStateImpl(inner1, this.manager()));
    }

    public DnsNameAvailabilityResult checkDnsNameAvailability(String location, String domainNameLabel) {
        DnsNameAvailabilityResultInner inner = this.serviceClient().checkDnsNameAvailability(location, domainNameLabel);
        if (inner != null) {
            return new DnsNameAvailabilityResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DnsNameAvailabilityResult> checkDnsNameAvailabilityWithResponse(
        String location, String domainNameLabel, Context context) {
        Response<DnsNameAvailabilityResultInner> inner =
            this.serviceClient().checkDnsNameAvailabilityWithResponse(location, domainNameLabel, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DnsNameAvailabilityResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualWanSecurityProviders supportedSecurityProviders(String resourceGroupName, String virtualWanName) {
        VirtualWanSecurityProvidersInner inner =
            this.serviceClient().supportedSecurityProviders(resourceGroupName, virtualWanName);
        if (inner != null) {
            return new VirtualWanSecurityProvidersImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualWanSecurityProviders> supportedSecurityProvidersWithResponse(
        String resourceGroupName, String virtualWanName, Context context) {
        Response<VirtualWanSecurityProvidersInner> inner =
            this.serviceClient().supportedSecurityProvidersWithResponse(resourceGroupName, virtualWanName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualWanSecurityProvidersImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VpnProfileResponse generatevirtualwanvpnserverconfigurationvpnprofile(
        String resourceGroupName, String virtualWanName, VirtualWanVpnProfileParameters vpnClientParams) {
        VpnProfileResponseInner inner =
            this
                .serviceClient()
                .generatevirtualwanvpnserverconfigurationvpnprofile(resourceGroupName, virtualWanName, vpnClientParams);
        if (inner != null) {
            return new VpnProfileResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public VpnProfileResponse generatevirtualwanvpnserverconfigurationvpnprofile(
        String resourceGroupName,
        String virtualWanName,
        VirtualWanVpnProfileParameters vpnClientParams,
        Context context) {
        VpnProfileResponseInner inner =
            this
                .serviceClient()
                .generatevirtualwanvpnserverconfigurationvpnprofile(
                    resourceGroupName, virtualWanName, vpnClientParams, context);
        if (inner != null) {
            return new VpnProfileResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ResourceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
