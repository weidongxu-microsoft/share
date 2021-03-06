// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;

/** Samples for VirtualMachines AssessPatches. */
public final class VirtualMachinesAssessPatchesSamples {
    /**
     * Sample code: Assess patch state of a virtual machine.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void assessPatchStateOfAVirtualMachine(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager.virtualMachines().assessPatches("myResourceGroupName", "myVMName", Context.NONE);
    }
}
