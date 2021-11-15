// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for VirtualMachineScaleSetVMExtensions Get. */
public final class VirtualMachineScaleSetVMExtensionsGetSamples {
    /**
     * Sample code: Get VirtualMachineScaleSet VM extension.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void getVirtualMachineScaleSetVMExtension(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .virtualMachineScaleSetVMExtensions()
            .getWithResponse("myResourceGroup", "myvmScaleSet", "0", "myVMExtension", null, Context.NONE);
    }
}