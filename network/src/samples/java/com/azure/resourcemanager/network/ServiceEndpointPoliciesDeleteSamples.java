// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.util.Context;

/** Samples for ServiceEndpointPolicies Delete. */
public final class ServiceEndpointPoliciesDeleteSamples {
    /**
     * Sample code: Delete service endpoint policy.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void deleteServiceEndpointPolicy(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager.serviceEndpointPolicies().delete("rg1", "serviceEndpointPolicy1", Context.NONE);
    }
}
