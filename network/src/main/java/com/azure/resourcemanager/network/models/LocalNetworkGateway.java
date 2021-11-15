// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.LocalNetworkGatewayInner;
import java.util.Map;

/** An immutable client-side representation of LocalNetworkGateway. */
public interface LocalNetworkGateway {
    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the localNetworkAddressSpace property: Local network site address space.
     *
     * @return the localNetworkAddressSpace value.
     */
    AddressSpace localNetworkAddressSpace();

    /**
     * Gets the gatewayIpAddress property: IP address of local network gateway.
     *
     * @return the gatewayIpAddress value.
     */
    String gatewayIpAddress();

    /**
     * Gets the fqdn property: FQDN of local network gateway.
     *
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * Gets the bgpSettings property: Local network gateway's BGP speaker settings.
     *
     * @return the bgpSettings value.
     */
    BgpSettings bgpSettings();

    /**
     * Gets the resourceGuid property: The resource GUID property of the local network gateway resource.
     *
     * @return the resourceGuid value.
     */
    String resourceGuid();

    /**
     * Gets the provisioningState property: The provisioning state of the local network gateway resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the id property: Resource ID.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.network.fluent.models.LocalNetworkGatewayInner object.
     *
     * @return the inner object.
     */
    LocalNetworkGatewayInner innerModel();

    /** The entirety of the LocalNetworkGateway definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The LocalNetworkGateway definition stages. */
    interface DefinitionStages {
        /** The first stage of the LocalNetworkGateway definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the LocalNetworkGateway definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the LocalNetworkGateway definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the LocalNetworkGateway definition which contains all the minimum required properties for the
         * resource to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithLocalNetworkAddressSpace,
                DefinitionStages.WithGatewayIpAddress,
                DefinitionStages.WithFqdn,
                DefinitionStages.WithBgpSettings {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            LocalNetworkGateway create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            LocalNetworkGateway create(Context context);
        }
        /** The stage of the LocalNetworkGateway definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the LocalNetworkGateway definition allowing to specify localNetworkAddressSpace. */
        interface WithLocalNetworkAddressSpace {
            /**
             * Specifies the localNetworkAddressSpace property: Local network site address space..
             *
             * @param localNetworkAddressSpace Local network site address space.
             * @return the next definition stage.
             */
            WithCreate withLocalNetworkAddressSpace(AddressSpace localNetworkAddressSpace);
        }
        /** The stage of the LocalNetworkGateway definition allowing to specify gatewayIpAddress. */
        interface WithGatewayIpAddress {
            /**
             * Specifies the gatewayIpAddress property: IP address of local network gateway..
             *
             * @param gatewayIpAddress IP address of local network gateway.
             * @return the next definition stage.
             */
            WithCreate withGatewayIpAddress(String gatewayIpAddress);
        }
        /** The stage of the LocalNetworkGateway definition allowing to specify fqdn. */
        interface WithFqdn {
            /**
             * Specifies the fqdn property: FQDN of local network gateway..
             *
             * @param fqdn FQDN of local network gateway.
             * @return the next definition stage.
             */
            WithCreate withFqdn(String fqdn);
        }
        /** The stage of the LocalNetworkGateway definition allowing to specify bgpSettings. */
        interface WithBgpSettings {
            /**
             * Specifies the bgpSettings property: Local network gateway's BGP speaker settings..
             *
             * @param bgpSettings Local network gateway's BGP speaker settings.
             * @return the next definition stage.
             */
            WithCreate withBgpSettings(BgpSettings bgpSettings);
        }
    }
    /**
     * Begins update for the LocalNetworkGateway resource.
     *
     * @return the stage of resource update.
     */
    LocalNetworkGateway.Update update();

    /** The template for LocalNetworkGateway update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        LocalNetworkGateway apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        LocalNetworkGateway apply(Context context);
    }
    /** The LocalNetworkGateway update stages. */
    interface UpdateStages {
        /** The stage of the LocalNetworkGateway update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    LocalNetworkGateway refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    LocalNetworkGateway refresh(Context context);
}
