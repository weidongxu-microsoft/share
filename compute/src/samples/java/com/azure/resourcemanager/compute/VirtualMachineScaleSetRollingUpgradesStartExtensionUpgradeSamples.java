// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetRollingUpgrades StartExtensionUpgrade. */
public final class VirtualMachineScaleSetRollingUpgradesStartExtensionUpgradeSamples {
    /**
     * Sample code: Start an extension rolling upgrade.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void startAnExtensionRollingUpgrade(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .virtualMachineScaleSetRollingUpgrades()
            .startExtensionUpgrade("myResourceGroup", "{vmss-name}", Context.NONE);
    }
}
