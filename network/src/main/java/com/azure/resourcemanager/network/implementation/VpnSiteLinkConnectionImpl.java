// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.VpnSiteLinkConnectionInner;
import com.azure.resourcemanager.network.models.IpsecPolicy;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.models.VpnConnectionStatus;
import com.azure.resourcemanager.network.models.VpnLinkConnectionMode;
import com.azure.resourcemanager.network.models.VpnSiteLinkConnection;
import java.util.Collections;
import java.util.List;

public final class VpnSiteLinkConnectionImpl implements VpnSiteLinkConnection {
    private VpnSiteLinkConnectionInner innerObject;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    VpnSiteLinkConnectionImpl(
        VpnSiteLinkConnectionInner innerObject, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SubResource vpnSiteLink() {
        return this.innerModel().vpnSiteLink();
    }

    public Integer routingWeight() {
        return this.innerModel().routingWeight();
    }

    public VpnLinkConnectionMode vpnLinkConnectionMode() {
        return this.innerModel().vpnLinkConnectionMode();
    }

    public VpnConnectionStatus connectionStatus() {
        return this.innerModel().connectionStatus();
    }

    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.innerModel().vpnConnectionProtocolType();
    }

    public Long ingressBytesTransferred() {
        return this.innerModel().ingressBytesTransferred();
    }

    public Long egressBytesTransferred() {
        return this.innerModel().egressBytesTransferred();
    }

    public Integer connectionBandwidth() {
        return this.innerModel().connectionBandwidth();
    }

    public String sharedKey() {
        return this.innerModel().sharedKey();
    }

    public Boolean enableBgp() {
        return this.innerModel().enableBgp();
    }

    public Boolean usePolicyBasedTrafficSelectors() {
        return this.innerModel().usePolicyBasedTrafficSelectors();
    }

    public List<IpsecPolicy> ipsecPolicies() {
        List<IpsecPolicy> inner = this.innerModel().ipsecPolicies();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean enableRateLimiting() {
        return this.innerModel().enableRateLimiting();
    }

    public Boolean useLocalAzureIpAddress() {
        return this.innerModel().useLocalAzureIpAddress();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<SubResource> ingressNatRules() {
        List<SubResource> inner = this.innerModel().ingressNatRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> egressNatRules() {
        List<SubResource> inner = this.innerModel().egressNatRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public VpnSiteLinkConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}
