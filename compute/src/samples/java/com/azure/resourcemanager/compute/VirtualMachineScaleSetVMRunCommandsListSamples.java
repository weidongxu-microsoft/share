// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMRunCommands List. */
public final class VirtualMachineScaleSetVMRunCommandsListSamples {
    /**
     * Sample code: List run commands in Vmss instance.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void listRunCommandsInVmssInstance(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .virtualMachineScaleSetVMRunCommands()
            .list("myResourceGroup", "myvmScaleSet", "0", null, Context.NONE);
    }
}