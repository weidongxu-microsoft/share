// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.fluent.models.AzureFirewallInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of AzureFirewall. */
public interface AzureFirewall {
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
     * Gets the zones property: A list of availability zones denoting where the resource needs to come from.
     *
     * @return the zones value.
     */
    List<String> zones();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the applicationRuleCollections property: Collection of application rule collections used by Azure Firewall.
     *
     * @return the applicationRuleCollections value.
     */
    List<AzureFirewallApplicationRuleCollection> applicationRuleCollections();

    /**
     * Gets the natRuleCollections property: Collection of NAT rule collections used by Azure Firewall.
     *
     * @return the natRuleCollections value.
     */
    List<AzureFirewallNatRuleCollection> natRuleCollections();

    /**
     * Gets the networkRuleCollections property: Collection of network rule collections used by Azure Firewall.
     *
     * @return the networkRuleCollections value.
     */
    List<AzureFirewallNetworkRuleCollection> networkRuleCollections();

    /**
     * Gets the ipConfigurations property: IP configuration of the Azure Firewall resource.
     *
     * @return the ipConfigurations value.
     */
    List<AzureFirewallIpConfiguration> ipConfigurations();

    /**
     * Gets the managementIpConfiguration property: IP configuration of the Azure Firewall used for management traffic.
     *
     * @return the managementIpConfiguration value.
     */
    AzureFirewallIpConfiguration managementIpConfiguration();

    /**
     * Gets the provisioningState property: The provisioning state of the Azure firewall resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the threatIntelMode property: The operation mode for Threat Intelligence.
     *
     * @return the threatIntelMode value.
     */
    AzureFirewallThreatIntelMode threatIntelMode();

    /**
     * Gets the virtualHub property: The virtualHub to which the firewall belongs.
     *
     * @return the virtualHub value.
     */
    SubResource virtualHub();

    /**
     * Gets the firewallPolicy property: The firewallPolicy associated with this azure firewall.
     *
     * @return the firewallPolicy value.
     */
    SubResource firewallPolicy();

    /**
     * Gets the hubIpAddresses property: IP addresses associated with AzureFirewall.
     *
     * @return the hubIpAddresses value.
     */
    HubIpAddresses hubIpAddresses();

    /**
     * Gets the ipGroups property: IpGroups associated with AzureFirewall.
     *
     * @return the ipGroups value.
     */
    List<AzureFirewallIpGroups> ipGroups();

    /**
     * Gets the sku property: The Azure Firewall Resource SKU.
     *
     * @return the sku value.
     */
    AzureFirewallSku sku();

    /**
     * Gets the additionalProperties property: The additional properties used to further config this azure firewall.
     *
     * @return the additionalProperties value.
     */
    Map<String, String> additionalProperties();

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
     * Gets the inner com.azure.resourcemanager.network.fluent.models.AzureFirewallInner object.
     *
     * @return the inner object.
     */
    AzureFirewallInner innerModel();

    /** The entirety of the AzureFirewall definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The AzureFirewall definition stages. */
    interface DefinitionStages {
        /** The first stage of the AzureFirewall definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the AzureFirewall definition allowing to specify location. */
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
        /** The stage of the AzureFirewall definition allowing to specify parent resource. */
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
         * The stage of the AzureFirewall definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithZones,
                DefinitionStages.WithApplicationRuleCollections,
                DefinitionStages.WithNatRuleCollections,
                DefinitionStages.WithNetworkRuleCollections,
                DefinitionStages.WithIpConfigurations,
                DefinitionStages.WithManagementIpConfiguration,
                DefinitionStages.WithThreatIntelMode,
                DefinitionStages.WithVirtualHub,
                DefinitionStages.WithFirewallPolicy,
                DefinitionStages.WithHubIpAddresses,
                DefinitionStages.WithSku,
                DefinitionStages.WithAdditionalProperties {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AzureFirewall create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AzureFirewall create(Context context);
        }
        /** The stage of the AzureFirewall definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the AzureFirewall definition allowing to specify zones. */
        interface WithZones {
            /**
             * Specifies the zones property: A list of availability zones denoting where the resource needs to come
             * from..
             *
             * @param zones A list of availability zones denoting where the resource needs to come from.
             * @return the next definition stage.
             */
            WithCreate withZones(List<String> zones);
        }
        /** The stage of the AzureFirewall definition allowing to specify applicationRuleCollections. */
        interface WithApplicationRuleCollections {
            /**
             * Specifies the applicationRuleCollections property: Collection of application rule collections used by
             * Azure Firewall..
             *
             * @param applicationRuleCollections Collection of application rule collections used by Azure Firewall.
             * @return the next definition stage.
             */
            WithCreate withApplicationRuleCollections(
                List<AzureFirewallApplicationRuleCollection> applicationRuleCollections);
        }
        /** The stage of the AzureFirewall definition allowing to specify natRuleCollections. */
        interface WithNatRuleCollections {
            /**
             * Specifies the natRuleCollections property: Collection of NAT rule collections used by Azure Firewall..
             *
             * @param natRuleCollections Collection of NAT rule collections used by Azure Firewall.
             * @return the next definition stage.
             */
            WithCreate withNatRuleCollections(List<AzureFirewallNatRuleCollection> natRuleCollections);
        }
        /** The stage of the AzureFirewall definition allowing to specify networkRuleCollections. */
        interface WithNetworkRuleCollections {
            /**
             * Specifies the networkRuleCollections property: Collection of network rule collections used by Azure
             * Firewall..
             *
             * @param networkRuleCollections Collection of network rule collections used by Azure Firewall.
             * @return the next definition stage.
             */
            WithCreate withNetworkRuleCollections(List<AzureFirewallNetworkRuleCollection> networkRuleCollections);
        }
        /** The stage of the AzureFirewall definition allowing to specify ipConfigurations. */
        interface WithIpConfigurations {
            /**
             * Specifies the ipConfigurations property: IP configuration of the Azure Firewall resource..
             *
             * @param ipConfigurations IP configuration of the Azure Firewall resource.
             * @return the next definition stage.
             */
            WithCreate withIpConfigurations(List<AzureFirewallIpConfiguration> ipConfigurations);
        }
        /** The stage of the AzureFirewall definition allowing to specify managementIpConfiguration. */
        interface WithManagementIpConfiguration {
            /**
             * Specifies the managementIpConfiguration property: IP configuration of the Azure Firewall used for
             * management traffic..
             *
             * @param managementIpConfiguration IP configuration of the Azure Firewall used for management traffic.
             * @return the next definition stage.
             */
            WithCreate withManagementIpConfiguration(AzureFirewallIpConfiguration managementIpConfiguration);
        }
        /** The stage of the AzureFirewall definition allowing to specify threatIntelMode. */
        interface WithThreatIntelMode {
            /**
             * Specifies the threatIntelMode property: The operation mode for Threat Intelligence..
             *
             * @param threatIntelMode The operation mode for Threat Intelligence.
             * @return the next definition stage.
             */
            WithCreate withThreatIntelMode(AzureFirewallThreatIntelMode threatIntelMode);
        }
        /** The stage of the AzureFirewall definition allowing to specify virtualHub. */
        interface WithVirtualHub {
            /**
             * Specifies the virtualHub property: The virtualHub to which the firewall belongs..
             *
             * @param virtualHub The virtualHub to which the firewall belongs.
             * @return the next definition stage.
             */
            WithCreate withVirtualHub(SubResource virtualHub);
        }
        /** The stage of the AzureFirewall definition allowing to specify firewallPolicy. */
        interface WithFirewallPolicy {
            /**
             * Specifies the firewallPolicy property: The firewallPolicy associated with this azure firewall..
             *
             * @param firewallPolicy The firewallPolicy associated with this azure firewall.
             * @return the next definition stage.
             */
            WithCreate withFirewallPolicy(SubResource firewallPolicy);
        }
        /** The stage of the AzureFirewall definition allowing to specify hubIpAddresses. */
        interface WithHubIpAddresses {
            /**
             * Specifies the hubIpAddresses property: IP addresses associated with AzureFirewall..
             *
             * @param hubIpAddresses IP addresses associated with AzureFirewall.
             * @return the next definition stage.
             */
            WithCreate withHubIpAddresses(HubIpAddresses hubIpAddresses);
        }
        /** The stage of the AzureFirewall definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The Azure Firewall Resource SKU..
             *
             * @param sku The Azure Firewall Resource SKU.
             * @return the next definition stage.
             */
            WithCreate withSku(AzureFirewallSku sku);
        }
        /** The stage of the AzureFirewall definition allowing to specify additionalProperties. */
        interface WithAdditionalProperties {
            /**
             * Specifies the additionalProperties property: The additional properties used to further config this azure
             * firewall..
             *
             * @param additionalProperties The additional properties used to further config this azure firewall.
             * @return the next definition stage.
             */
            WithCreate withAdditionalProperties(Map<String, String> additionalProperties);
        }
    }
    /**
     * Begins update for the AzureFirewall resource.
     *
     * @return the stage of resource update.
     */
    AzureFirewall.Update update();

    /** The template for AzureFirewall update. */
    interface Update extends UpdateStages.WithTags {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AzureFirewall apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AzureFirewall apply(Context context);
    }
    /** The AzureFirewall update stages. */
    interface UpdateStages {
        /** The stage of the AzureFirewall update allowing to specify tags. */
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
    AzureFirewall refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AzureFirewall refresh(Context context);
}
