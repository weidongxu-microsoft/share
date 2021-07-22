// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.resourcemanager.network.models.FlowLogFormatParameters;
import com.azure.resourcemanager.network.models.FlowLogFormatType;

/** Samples for FlowLogs CreateOrUpdate. */
public final class FlowLogsCreateOrUpdateSamples {
    /**
     * Sample code: Create or update flow log.
     *
     * @param networkManager Entry point to NetworkManager. Network Client.
     */
    public static void createOrUpdateFlowLog(com.azure.resourcemanager.network.NetworkManager networkManager) {
        networkManager
            .flowLogs()
            .define("fl")
            .withRegion("centraluseuap")
            .withExistingNetworkWatcher("rg1", "nw1")
            .withTargetResourceId(
                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Network/networkSecurityGroups/desmondcentral-nsg")
            .withStorageId(
                "/subscriptions/subid/resourceGroups/rg1/providers/Microsoft.Storage/storageAccounts/nwtest1mgvbfmqsigdxe")
            .withEnabled(true)
            .withFormat(new FlowLogFormatParameters().withType(FlowLogFormatType.JSON).withVersion(1))
            .create();
    }
}
