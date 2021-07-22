// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.resourcemanager.compute.fluent.models.VirtualMachineInstallPatchesResultInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of VirtualMachineInstallPatchesResult. */
public interface VirtualMachineInstallPatchesResult {
    /**
     * Gets the status property: The overall success or failure status of the operation. It remains "InProgress" until
     * the operation completes. At that point it will become "Failed", "Succeeded", "Unknown" or
     * "CompletedWithWarnings.".
     *
     * @return the status value.
     */
    PatchOperationStatus status();

    /**
     * Gets the installationActivityId property: The activity ID of the operation that produced this result. It is used
     * to correlate across CRP and extension logs.
     *
     * @return the installationActivityId value.
     */
    String installationActivityId();

    /**
     * Gets the rebootStatus property: The reboot state of the VM following completion of the operation.
     *
     * @return the rebootStatus value.
     */
    VMGuestPatchRebootStatus rebootStatus();

    /**
     * Gets the maintenanceWindowExceeded property: Whether the operation ran out of time before it completed all its
     * intended actions.
     *
     * @return the maintenanceWindowExceeded value.
     */
    Boolean maintenanceWindowExceeded();

    /**
     * Gets the excludedPatchCount property: The number of patches that were not installed due to the user blocking
     * their installation.
     *
     * @return the excludedPatchCount value.
     */
    Integer excludedPatchCount();

    /**
     * Gets the notSelectedPatchCount property: The number of patches that were detected as available for install, but
     * did not meet the operation's criteria.
     *
     * @return the notSelectedPatchCount value.
     */
    Integer notSelectedPatchCount();

    /**
     * Gets the pendingPatchCount property: The number of patches that were identified as meeting the installation
     * criteria, but were not able to be installed. Typically this happens when maintenanceWindowExceeded == true.
     *
     * @return the pendingPatchCount value.
     */
    Integer pendingPatchCount();

    /**
     * Gets the installedPatchCount property: The number of patches successfully installed.
     *
     * @return the installedPatchCount value.
     */
    Integer installedPatchCount();

    /**
     * Gets the failedPatchCount property: The number of patches that could not be installed due to some issue. See
     * errors for details.
     *
     * @return the failedPatchCount value.
     */
    Integer failedPatchCount();

    /**
     * Gets the patches property: The patches that were installed during the operation.
     *
     * @return the patches value.
     */
    List<PatchInstallationDetail> patches();

    /**
     * Gets the startDateTime property: The UTC timestamp when the operation began.
     *
     * @return the startDateTime value.
     */
    OffsetDateTime startDateTime();

    /**
     * Gets the error property: The errors that were encountered during execution of the operation. The details array
     * contains the list of them.
     *
     * @return the error value.
     */
    ApiError error();

    /**
     * Gets the inner com.azure.resourcemanager.compute.fluent.models.VirtualMachineInstallPatchesResultInner object.
     *
     * @return the inner object.
     */
    VirtualMachineInstallPatchesResultInner innerModel();
}