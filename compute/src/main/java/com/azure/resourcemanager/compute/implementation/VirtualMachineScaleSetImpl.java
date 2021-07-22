// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.VirtualMachineScaleSetInner;
import com.azure.resourcemanager.compute.models.AdditionalCapabilities;
import com.azure.resourcemanager.compute.models.AutomaticRepairsPolicy;
import com.azure.resourcemanager.compute.models.ExpandTypesForGetVMScaleSets;
import com.azure.resourcemanager.compute.models.ExtendedLocation;
import com.azure.resourcemanager.compute.models.OrchestrationMode;
import com.azure.resourcemanager.compute.models.OrchestrationServiceStateInput;
import com.azure.resourcemanager.compute.models.Plan;
import com.azure.resourcemanager.compute.models.ScaleInPolicy;
import com.azure.resourcemanager.compute.models.Sku;
import com.azure.resourcemanager.compute.models.SpotRestorePolicy;
import com.azure.resourcemanager.compute.models.UpgradePolicy;
import com.azure.resourcemanager.compute.models.VMScaleSetConvertToSinglePlacementGroupInput;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSet;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetIdentity;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetReimageParameters;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetUpdate;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetUpdateVMProfile;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetVMInstanceIDs;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetVMInstanceRequiredIDs;
import com.azure.resourcemanager.compute.models.VirtualMachineScaleSetVMProfile;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualMachineScaleSetImpl
    implements VirtualMachineScaleSet, VirtualMachineScaleSet.Definition, VirtualMachineScaleSet.Update {
    private VirtualMachineScaleSetInner innerObject;

    private final com.azure.resourcemanager.compute.ComputeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public Sku sku() {
        return this.innerModel().sku();
    }

    public Plan plan() {
        return this.innerModel().plan();
    }

    public VirtualMachineScaleSetIdentity identity() {
        return this.innerModel().identity();
    }

    public List<String> zones() {
        List<String> inner = this.innerModel().zones();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ExtendedLocation extendedLocation() {
        return this.innerModel().extendedLocation();
    }

    public UpgradePolicy upgradePolicy() {
        return this.innerModel().upgradePolicy();
    }

    public AutomaticRepairsPolicy automaticRepairsPolicy() {
        return this.innerModel().automaticRepairsPolicy();
    }

    public VirtualMachineScaleSetVMProfile virtualMachineProfile() {
        return this.innerModel().virtualMachineProfile();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Boolean overprovision() {
        return this.innerModel().overprovision();
    }

    public Boolean doNotRunExtensionsOnOverprovisionedVMs() {
        return this.innerModel().doNotRunExtensionsOnOverprovisionedVMs();
    }

    public String uniqueId() {
        return this.innerModel().uniqueId();
    }

    public Boolean singlePlacementGroup() {
        return this.innerModel().singlePlacementGroup();
    }

    public Boolean zoneBalance() {
        return this.innerModel().zoneBalance();
    }

    public Integer platformFaultDomainCount() {
        return this.innerModel().platformFaultDomainCount();
    }

    public SubResource proximityPlacementGroup() {
        return this.innerModel().proximityPlacementGroup();
    }

    public SubResource hostGroup() {
        return this.innerModel().hostGroup();
    }

    public AdditionalCapabilities additionalCapabilities() {
        return this.innerModel().additionalCapabilities();
    }

    public ScaleInPolicy scaleInPolicy() {
        return this.innerModel().scaleInPolicy();
    }

    public OrchestrationMode orchestrationMode() {
        return this.innerModel().orchestrationMode();
    }

    public SpotRestorePolicy spotRestorePolicy() {
        return this.innerModel().spotRestorePolicy();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public VirtualMachineScaleSetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.ComputeManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String vmScaleSetName;

    private VirtualMachineScaleSetUpdate updateParameters;

    public VirtualMachineScaleSetImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualMachineScaleSet create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .createOrUpdate(resourceGroupName, vmScaleSetName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualMachineScaleSet create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .createOrUpdate(resourceGroupName, vmScaleSetName, this.innerModel(), context);
        return this;
    }

    VirtualMachineScaleSetImpl(String name, com.azure.resourcemanager.compute.ComputeManager serviceManager) {
        this.innerObject = new VirtualMachineScaleSetInner();
        this.serviceManager = serviceManager;
        this.vmScaleSetName = name;
    }

    public VirtualMachineScaleSetImpl update() {
        this.updateParameters = new VirtualMachineScaleSetUpdate();
        return this;
    }

    public VirtualMachineScaleSet apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .update(resourceGroupName, vmScaleSetName, updateParameters, Context.NONE);
        return this;
    }

    public VirtualMachineScaleSet apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .update(resourceGroupName, vmScaleSetName, updateParameters, context);
        return this;
    }

    VirtualMachineScaleSetImpl(
        VirtualMachineScaleSetInner innerObject, com.azure.resourcemanager.compute.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.vmScaleSetName = Utils.getValueFromIdByName(innerObject.id(), "virtualMachineScaleSets");
    }

    public VirtualMachineScaleSet refresh() {
        ExpandTypesForGetVMScaleSets localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .getByResourceGroupWithResponse(resourceGroupName, vmScaleSetName, localExpand, Context.NONE)
                .getValue();
        return this;
    }

    public VirtualMachineScaleSet refresh(Context context) {
        ExpandTypesForGetVMScaleSets localExpand = null;
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVirtualMachineScaleSets()
                .getByResourceGroupWithResponse(resourceGroupName, vmScaleSetName, localExpand, context)
                .getValue();
        return this;
    }

    public void deallocate(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        serviceManager.virtualMachineScaleSets().deallocate(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void deallocate() {
        serviceManager.virtualMachineScaleSets().deallocate(resourceGroupName, vmScaleSetName);
    }

    public void deallocate(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets().deallocate(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void deleteInstances(VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs, Boolean forceDeletion) {
        serviceManager
            .virtualMachineScaleSets()
            .deleteInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs, forceDeletion);
    }

    public void deleteInstances(VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs) {
        serviceManager.virtualMachineScaleSets().deleteInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void deleteInstances(
        VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs, Boolean forceDeletion, Context context) {
        serviceManager
            .virtualMachineScaleSets()
            .deleteInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs, forceDeletion, context);
    }

    public void powerOff(Boolean skipShutdown, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        serviceManager
            .virtualMachineScaleSets()
            .powerOff(resourceGroupName, vmScaleSetName, skipShutdown, vmInstanceIDs);
    }

    public void powerOff() {
        serviceManager.virtualMachineScaleSets().powerOff(resourceGroupName, vmScaleSetName);
    }

    public void powerOff(Boolean skipShutdown, VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager
            .virtualMachineScaleSets()
            .powerOff(resourceGroupName, vmScaleSetName, skipShutdown, vmInstanceIDs, context);
    }

    public void restart(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        serviceManager.virtualMachineScaleSets().restart(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void restart() {
        serviceManager.virtualMachineScaleSets().restart(resourceGroupName, vmScaleSetName);
    }

    public void restart(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets().restart(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void start(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        serviceManager.virtualMachineScaleSets().start(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void start() {
        serviceManager.virtualMachineScaleSets().start(resourceGroupName, vmScaleSetName);
    }

    public void start(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets().start(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void redeploy(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        serviceManager.virtualMachineScaleSets().redeploy(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void redeploy() {
        serviceManager.virtualMachineScaleSets().redeploy(resourceGroupName, vmScaleSetName);
    }

    public void redeploy(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets().redeploy(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void performMaintenance(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        serviceManager.virtualMachineScaleSets().performMaintenance(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void performMaintenance() {
        serviceManager.virtualMachineScaleSets().performMaintenance(resourceGroupName, vmScaleSetName);
    }

    public void performMaintenance(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager
            .virtualMachineScaleSets()
            .performMaintenance(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void updateInstances(VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs) {
        serviceManager.virtualMachineScaleSets().updateInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void updateInstances(VirtualMachineScaleSetVMInstanceRequiredIDs vmInstanceIDs, Context context) {
        serviceManager
            .virtualMachineScaleSets()
            .updateInstances(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void reimage(VirtualMachineScaleSetReimageParameters vmScaleSetReimageInput) {
        serviceManager.virtualMachineScaleSets().reimage(resourceGroupName, vmScaleSetName, vmScaleSetReimageInput);
    }

    public void reimage() {
        serviceManager.virtualMachineScaleSets().reimage(resourceGroupName, vmScaleSetName);
    }

    public void reimage(VirtualMachineScaleSetReimageParameters vmScaleSetReimageInput, Context context) {
        serviceManager
            .virtualMachineScaleSets()
            .reimage(resourceGroupName, vmScaleSetName, vmScaleSetReimageInput, context);
    }

    public void reimageAll(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs) {
        serviceManager.virtualMachineScaleSets().reimageAll(resourceGroupName, vmScaleSetName, vmInstanceIDs);
    }

    public void reimageAll() {
        serviceManager.virtualMachineScaleSets().reimageAll(resourceGroupName, vmScaleSetName);
    }

    public void reimageAll(VirtualMachineScaleSetVMInstanceIDs vmInstanceIDs, Context context) {
        serviceManager.virtualMachineScaleSets().reimageAll(resourceGroupName, vmScaleSetName, vmInstanceIDs, context);
    }

    public void convertToSinglePlacementGroup(VMScaleSetConvertToSinglePlacementGroupInput parameters) {
        serviceManager
            .virtualMachineScaleSets()
            .convertToSinglePlacementGroup(resourceGroupName, vmScaleSetName, parameters);
    }

    public Response<Void> convertToSinglePlacementGroupWithResponse(
        VMScaleSetConvertToSinglePlacementGroupInput parameters, Context context) {
        return serviceManager
            .virtualMachineScaleSets()
            .convertToSinglePlacementGroupWithResponse(resourceGroupName, vmScaleSetName, parameters, context);
    }

    public void setOrchestrationServiceState(OrchestrationServiceStateInput parameters) {
        serviceManager
            .virtualMachineScaleSets()
            .setOrchestrationServiceState(resourceGroupName, vmScaleSetName, parameters);
    }

    public void setOrchestrationServiceState(OrchestrationServiceStateInput parameters, Context context) {
        serviceManager
            .virtualMachineScaleSets()
            .setOrchestrationServiceState(resourceGroupName, vmScaleSetName, parameters, context);
    }

    public VirtualMachineScaleSetImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualMachineScaleSetImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualMachineScaleSetImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.innerModel().withSku(sku);
            return this;
        } else {
            this.updateParameters.withSku(sku);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withPlan(Plan plan) {
        if (isInCreateMode()) {
            this.innerModel().withPlan(plan);
            return this;
        } else {
            this.updateParameters.withPlan(plan);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withIdentity(VirtualMachineScaleSetIdentity identity) {
        if (isInCreateMode()) {
            this.innerModel().withIdentity(identity);
            return this;
        } else {
            this.updateParameters.withIdentity(identity);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withZones(List<String> zones) {
        this.innerModel().withZones(zones);
        return this;
    }

    public VirtualMachineScaleSetImpl withExtendedLocation(ExtendedLocation extendedLocation) {
        this.innerModel().withExtendedLocation(extendedLocation);
        return this;
    }

    public VirtualMachineScaleSetImpl withUpgradePolicy(UpgradePolicy upgradePolicy) {
        if (isInCreateMode()) {
            this.innerModel().withUpgradePolicy(upgradePolicy);
            return this;
        } else {
            this.updateParameters.withUpgradePolicy(upgradePolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withAutomaticRepairsPolicy(AutomaticRepairsPolicy automaticRepairsPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withAutomaticRepairsPolicy(automaticRepairsPolicy);
            return this;
        } else {
            this.updateParameters.withAutomaticRepairsPolicy(automaticRepairsPolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withVirtualMachineProfile(VirtualMachineScaleSetVMProfile virtualMachineProfile) {
        this.innerModel().withVirtualMachineProfile(virtualMachineProfile);
        return this;
    }

    public VirtualMachineScaleSetImpl withOverprovision(Boolean overprovision) {
        if (isInCreateMode()) {
            this.innerModel().withOverprovision(overprovision);
            return this;
        } else {
            this.updateParameters.withOverprovision(overprovision);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withDoNotRunExtensionsOnOverprovisionedVMs(
        Boolean doNotRunExtensionsOnOverprovisionedVMs) {
        if (isInCreateMode()) {
            this.innerModel().withDoNotRunExtensionsOnOverprovisionedVMs(doNotRunExtensionsOnOverprovisionedVMs);
            return this;
        } else {
            this.updateParameters.withDoNotRunExtensionsOnOverprovisionedVMs(doNotRunExtensionsOnOverprovisionedVMs);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withSinglePlacementGroup(Boolean singlePlacementGroup) {
        if (isInCreateMode()) {
            this.innerModel().withSinglePlacementGroup(singlePlacementGroup);
            return this;
        } else {
            this.updateParameters.withSinglePlacementGroup(singlePlacementGroup);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withZoneBalance(Boolean zoneBalance) {
        this.innerModel().withZoneBalance(zoneBalance);
        return this;
    }

    public VirtualMachineScaleSetImpl withPlatformFaultDomainCount(Integer platformFaultDomainCount) {
        this.innerModel().withPlatformFaultDomainCount(platformFaultDomainCount);
        return this;
    }

    public VirtualMachineScaleSetImpl withProximityPlacementGroup(SubResource proximityPlacementGroup) {
        if (isInCreateMode()) {
            this.innerModel().withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        } else {
            this.updateParameters.withProximityPlacementGroup(proximityPlacementGroup);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withHostGroup(SubResource hostGroup) {
        this.innerModel().withHostGroup(hostGroup);
        return this;
    }

    public VirtualMachineScaleSetImpl withAdditionalCapabilities(AdditionalCapabilities additionalCapabilities) {
        if (isInCreateMode()) {
            this.innerModel().withAdditionalCapabilities(additionalCapabilities);
            return this;
        } else {
            this.updateParameters.withAdditionalCapabilities(additionalCapabilities);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withScaleInPolicy(ScaleInPolicy scaleInPolicy) {
        if (isInCreateMode()) {
            this.innerModel().withScaleInPolicy(scaleInPolicy);
            return this;
        } else {
            this.updateParameters.withScaleInPolicy(scaleInPolicy);
            return this;
        }
    }

    public VirtualMachineScaleSetImpl withOrchestrationMode(OrchestrationMode orchestrationMode) {
        this.innerModel().withOrchestrationMode(orchestrationMode);
        return this;
    }

    public VirtualMachineScaleSetImpl withSpotRestorePolicy(SpotRestorePolicy spotRestorePolicy) {
        this.innerModel().withSpotRestorePolicy(spotRestorePolicy);
        return this;
    }

    public VirtualMachineScaleSetImpl withVirtualMachineProfile(
        VirtualMachineScaleSetUpdateVMProfile virtualMachineProfile) {
        this.updateParameters.withVirtualMachineProfile(virtualMachineProfile);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}