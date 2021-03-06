// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.models.DiskEncryptionSet;
import com.azure.resourcemanager.compute.models.DiskEncryptionSetIdentityType;
import com.azure.resourcemanager.compute.models.DiskEncryptionSetType;
import com.azure.resourcemanager.compute.models.EncryptionSetIdentity;
import com.azure.resourcemanager.compute.models.KeyForDiskEncryptionSet;
import com.azure.resourcemanager.compute.models.SourceVault;
import java.util.HashMap;
import java.util.Map;

/** Samples for DiskEncryptionSets Update. */
public final class DiskEncryptionSetsUpdateSamples {
    /**
     * Sample code: Update a disk encryption set with rotationToLatestKeyVersionEnabled set to true - Succeeded.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void updateADiskEncryptionSetWithRotationToLatestKeyVersionEnabledSetToTrueSucceeded(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        DiskEncryptionSet resource =
            computeManager
                .diskEncryptionSets()
                .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.SYSTEM_ASSIGNED))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(
                new KeyForDiskEncryptionSet()
                    .withKeyUrl("https://myvaultdifferentsub.vault-int.azure-int.net/keys/keyName/keyVersion1"))
            .withRotationToLatestKeyVersionEnabled(true)
            .apply();
    }

    /**
     * Sample code: Update a disk encryption set with rotationToLatestKeyVersionEnabled set to true - Updating.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void updateADiskEncryptionSetWithRotationToLatestKeyVersionEnabledSetToTrueUpdating(
        com.azure.resourcemanager.compute.ComputeManager computeManager) {
        DiskEncryptionSet resource =
            computeManager
                .diskEncryptionSets()
                .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", Context.NONE)
                .getValue();
        resource
            .update()
            .withIdentity(new EncryptionSetIdentity().withType(DiskEncryptionSetIdentityType.SYSTEM_ASSIGNED))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(
                new KeyForDiskEncryptionSet()
                    .withKeyUrl("https://myvaultdifferentsub.vault-int.azure-int.net/keys/keyName/keyVersion1"))
            .withRotationToLatestKeyVersionEnabled(true)
            .apply();
    }

    /**
     * Sample code: Update a disk encryption set.
     *
     * @param computeManager Entry point to ComputeManager. Compute Client.
     */
    public static void updateADiskEncryptionSet(com.azure.resourcemanager.compute.ComputeManager computeManager) {
        DiskEncryptionSet resource =
            computeManager
                .diskEncryptionSets()
                .getByResourceGroupWithResponse("myResourceGroup", "myDiskEncryptionSet", Context.NONE)
                .getValue();
        resource
            .update()
            .withTags(mapOf("department", "Development", "project", "Encryption"))
            .withEncryptionType(DiskEncryptionSetType.ENCRYPTION_AT_REST_WITH_CUSTOMER_KEY)
            .withActiveKey(
                new KeyForDiskEncryptionSet()
                    .withSourceVault(
                        new SourceVault()
                            .withId(
                                "/subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.KeyVault/vaults/myVMVault"))
                    .withKeyUrl("https://myvmvault.vault-int.azure-int.net/keys/keyName/keyVersion"))
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
