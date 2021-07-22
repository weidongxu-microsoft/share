// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineRunCommandInner;
import com.azure.resourcemanager.compute.models.RunCommandInputParameter;
import com.azure.resourcemanager.compute.models.VirtualMachineRunCommandScriptSource;
import java.util.Arrays;

/** Samples for VirtualMachineScaleSetVMRunCommands CreateOrUpdate. */
public final class VirtualMachineScaleSetVMRunCommandsCreateOrUpdateSamples {
    /**
     * Sample code: Create VirtualMachineScaleSet VM run command.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void createVirtualMachineScaleSetVMRunCommand(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .virtualMachineScaleSetVMRunCommands()
            .createOrUpdate(
                "myResourceGroup",
                "myvmScaleSet",
                "0",
                "myRunCommand",
                new VirtualMachineRunCommandInner()
                    .withLocation("West US")
                    .withSource(new VirtualMachineRunCommandScriptSource().withScript("Write-Host Hello World!"))
                    .withParameters(
                        Arrays
                            .asList(
                                new RunCommandInputParameter().withName("param1").withValue("value1"),
                                new RunCommandInputParameter().withName("param2").withValue("value2")))
                    .withAsyncExecution(false)
                    .withRunAsUser("user1")
                    .withRunAsPassword("<runAsPassword>")
                    .withTimeoutInSeconds(3600),
                Context.NONE);
    }
}