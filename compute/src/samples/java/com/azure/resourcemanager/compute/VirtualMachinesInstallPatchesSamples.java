// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.VMGuestPatchClassificationWindows;
import com.azure.resourcemanager.compute.models.VMGuestPatchRebootSetting;
import com.azure.resourcemanager.compute.models.VirtualMachineInstallPatchesParameters;
import com.azure.resourcemanager.compute.models.WindowsParameters;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for VirtualMachines InstallPatches. */
public final class VirtualMachinesInstallPatchesSamples {
    /**
     * Sample code: Install patch state of a virtual machine.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void installPatchStateOfAVirtualMachine(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        computeManager
            .virtualMachines()
            .installPatches(
                "myResourceGroupName",
                "myVMName",
                new VirtualMachineInstallPatchesParameters()
                    .withMaximumDuration("PT4H")
                    .withRebootSetting(VMGuestPatchRebootSetting.IF_REQUIRED)
                    .withWindowsParameters(
                        new WindowsParameters()
                            .withClassificationsToInclude(
                                Arrays
                                    .asList(
                                        VMGuestPatchClassificationWindows.CRITICAL,
                                        VMGuestPatchClassificationWindows.SECURITY))
                            .withMaxPatchPublishDate(OffsetDateTime.parse("2020-11-19T02:36:43.0539904+00:00"))),
                Context.NONE);
    }
}