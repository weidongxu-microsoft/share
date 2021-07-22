// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.RunCommandInput;

/** Samples for VirtualMachines RunCommand. */
public final class VirtualMachinesRunCommandSamples {
    /**
     * Sample code: VirtualMachineRunCommand.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void virtualMachineRunCommand(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .virtualMachines()
            .runCommand(
                "crptestar98131", "vm3036", new RunCommandInput().withCommandId("RunPowerShellScript"), Context.NONE);
    }
}
