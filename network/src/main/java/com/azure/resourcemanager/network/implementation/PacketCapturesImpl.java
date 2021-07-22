// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.PacketCapturesClient;
import com.azure.resourcemanager.network.fluent.models.PacketCaptureQueryStatusResultInner;
import com.azure.resourcemanager.network.fluent.models.PacketCaptureResultInner;
import com.azure.resourcemanager.network.models.PacketCapture;
import com.azure.resourcemanager.network.models.PacketCaptureQueryStatusResult;
import com.azure.resourcemanager.network.models.PacketCaptureResult;
import com.azure.resourcemanager.network.models.PacketCaptures;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PacketCapturesImpl implements PacketCaptures {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PacketCapturesImpl.class);

    private final PacketCapturesClient innerClient;

    private final com.azure.resourcemanager.network.NetworkManager serviceManager;

    public PacketCapturesImpl(
        PacketCapturesClient innerClient, com.azure.resourcemanager.network.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PacketCaptureResult create(
        String resourceGroupName, String networkWatcherName, String packetCaptureName, PacketCapture parameters) {
        PacketCaptureResultInner inner =
            this.serviceClient().create(resourceGroupName, networkWatcherName, packetCaptureName, parameters);
        if (inner != null) {
            return new PacketCaptureResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PacketCaptureResult create(
        String resourceGroupName,
        String networkWatcherName,
        String packetCaptureName,
        PacketCapture parameters,
        Context context) {
        PacketCaptureResultInner inner =
            this.serviceClient().create(resourceGroupName, networkWatcherName, packetCaptureName, parameters, context);
        if (inner != null) {
            return new PacketCaptureResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PacketCaptureResult get(String resourceGroupName, String networkWatcherName, String packetCaptureName) {
        PacketCaptureResultInner inner =
            this.serviceClient().get(resourceGroupName, networkWatcherName, packetCaptureName);
        if (inner != null) {
            return new PacketCaptureResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PacketCaptureResult> getWithResponse(
        String resourceGroupName, String networkWatcherName, String packetCaptureName, Context context) {
        Response<PacketCaptureResultInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, networkWatcherName, packetCaptureName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PacketCaptureResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String networkWatcherName, String packetCaptureName) {
        this.serviceClient().delete(resourceGroupName, networkWatcherName, packetCaptureName);
    }

    public void delete(String resourceGroupName, String networkWatcherName, String packetCaptureName, Context context) {
        this.serviceClient().delete(resourceGroupName, networkWatcherName, packetCaptureName, context);
    }

    public void stop(String resourceGroupName, String networkWatcherName, String packetCaptureName) {
        this.serviceClient().stop(resourceGroupName, networkWatcherName, packetCaptureName);
    }

    public void stop(String resourceGroupName, String networkWatcherName, String packetCaptureName, Context context) {
        this.serviceClient().stop(resourceGroupName, networkWatcherName, packetCaptureName, context);
    }

    public PacketCaptureQueryStatusResult getStatus(
        String resourceGroupName, String networkWatcherName, String packetCaptureName) {
        PacketCaptureQueryStatusResultInner inner =
            this.serviceClient().getStatus(resourceGroupName, networkWatcherName, packetCaptureName);
        if (inner != null) {
            return new PacketCaptureQueryStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PacketCaptureQueryStatusResult getStatus(
        String resourceGroupName, String networkWatcherName, String packetCaptureName, Context context) {
        PacketCaptureQueryStatusResultInner inner =
            this.serviceClient().getStatus(resourceGroupName, networkWatcherName, packetCaptureName, context);
        if (inner != null) {
            return new PacketCaptureQueryStatusResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PacketCaptureResult> list(String resourceGroupName, String networkWatcherName) {
        PagedIterable<PacketCaptureResultInner> inner =
            this.serviceClient().list(resourceGroupName, networkWatcherName);
        return Utils.mapPage(inner, inner1 -> new PacketCaptureResultImpl(inner1, this.manager()));
    }

    public PagedIterable<PacketCaptureResult> list(
        String resourceGroupName, String networkWatcherName, Context context) {
        PagedIterable<PacketCaptureResultInner> inner =
            this.serviceClient().list(resourceGroupName, networkWatcherName, context);
        return Utils.mapPage(inner, inner1 -> new PacketCaptureResultImpl(inner1, this.manager()));
    }

    private PacketCapturesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.NetworkManager manager() {
        return this.serviceManager;
    }
}