// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.policy.models.DataEffect;
import com.azure.resourcemanager.policy.models.DataManifestCustomResourceFunctionDefinition;
import com.azure.resourcemanager.policy.models.ResourceTypeAliases;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The data policy manifest. */
@JsonFlatten
@Fluent
public class DataPolicyManifestInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataPolicyManifestInner.class);

    /*
     * The list of namespaces for the data policy manifest.
     */
    @JsonProperty(value = "properties.namespaces")
    private List<String> namespaces;

    /*
     * The policy mode of the data policy manifest.
     */
    @JsonProperty(value = "properties.policyMode")
    private String policyMode;

    /*
     * A value indicating whether policy mode is allowed only in built-in
     * definitions.
     */
    @JsonProperty(value = "properties.isBuiltInOnly")
    private Boolean isBuiltInOnly;

    /*
     * An array of resource type aliases.
     */
    @JsonProperty(value = "properties.resourceTypeAliases")
    private List<ResourceTypeAliases> resourceTypeAliases;

    /*
     * The effect definition.
     */
    @JsonProperty(value = "properties.effects")
    private List<DataEffect> effects;

    /*
     * The non-alias field accessor values that can be used in the policy rule.
     */
    @JsonProperty(value = "properties.fieldValues")
    private List<String> fieldValues;

    /*
     * The standard resource functions (subscription and/or resourceGroup).
     */
    @JsonProperty(value = "properties.resourceFunctions.standard")
    private List<String> standard;

    /*
     * An array of data manifest custom resource definition.
     */
    @JsonProperty(value = "properties.resourceFunctions.custom")
    private List<DataManifestCustomResourceFunctionDefinition> custom;

    /**
     * Get the namespaces property: The list of namespaces for the data policy manifest.
     *
     * @return the namespaces value.
     */
    public List<String> namespaces() {
        return this.namespaces;
    }

    /**
     * Set the namespaces property: The list of namespaces for the data policy manifest.
     *
     * @param namespaces the namespaces value to set.
     * @return the DataPolicyManifestInner object itself.
     */
    public DataPolicyManifestInner withNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
        return this;
    }

    /**
     * Get the policyMode property: The policy mode of the data policy manifest.
     *
     * @return the policyMode value.
     */
    public String policyMode() {
        return this.policyMode;
    }

    /**
     * Set the policyMode property: The policy mode of the data policy manifest.
     *
     * @param policyMode the policyMode value to set.
     * @return the DataPolicyManifestInner object itself.
     */
    public DataPolicyManifestInner withPolicyMode(String policyMode) {
        this.policyMode = policyMode;
        return this;
    }

    /**
     * Get the isBuiltInOnly property: A value indicating whether policy mode is allowed only in built-in definitions.
     *
     * @return the isBuiltInOnly value.
     */
    public Boolean isBuiltInOnly() {
        return this.isBuiltInOnly;
    }

    /**
     * Set the isBuiltInOnly property: A value indicating whether policy mode is allowed only in built-in definitions.
     *
     * @param isBuiltInOnly the isBuiltInOnly value to set.
     * @return the DataPolicyManifestInner object itself.
     */
    public DataPolicyManifestInner withIsBuiltInOnly(Boolean isBuiltInOnly) {
        this.isBuiltInOnly = isBuiltInOnly;
        return this;
    }

    /**
     * Get the resourceTypeAliases property: An array of resource type aliases.
     *
     * @return the resourceTypeAliases value.
     */
    public List<ResourceTypeAliases> resourceTypeAliases() {
        return this.resourceTypeAliases;
    }

    /**
     * Set the resourceTypeAliases property: An array of resource type aliases.
     *
     * @param resourceTypeAliases the resourceTypeAliases value to set.
     * @return the DataPolicyManifestInner object itself.
     */
    public DataPolicyManifestInner withResourceTypeAliases(List<ResourceTypeAliases> resourceTypeAliases) {
        this.resourceTypeAliases = resourceTypeAliases;
        return this;
    }

    /**
     * Get the effects property: The effect definition.
     *
     * @return the effects value.
     */
    public List<DataEffect> effects() {
        return this.effects;
    }

    /**
     * Set the effects property: The effect definition.
     *
     * @param effects the effects value to set.
     * @return the DataPolicyManifestInner object itself.
     */
    public DataPolicyManifestInner withEffects(List<DataEffect> effects) {
        this.effects = effects;
        return this;
    }

    /**
     * Get the fieldValues property: The non-alias field accessor values that can be used in the policy rule.
     *
     * @return the fieldValues value.
     */
    public List<String> fieldValues() {
        return this.fieldValues;
    }

    /**
     * Set the fieldValues property: The non-alias field accessor values that can be used in the policy rule.
     *
     * @param fieldValues the fieldValues value to set.
     * @return the DataPolicyManifestInner object itself.
     */
    public DataPolicyManifestInner withFieldValues(List<String> fieldValues) {
        this.fieldValues = fieldValues;
        return this;
    }

    /**
     * Get the standard property: The standard resource functions (subscription and/or resourceGroup).
     *
     * @return the standard value.
     */
    public List<String> standard() {
        return this.standard;
    }

    /**
     * Set the standard property: The standard resource functions (subscription and/or resourceGroup).
     *
     * @param standard the standard value to set.
     * @return the DataPolicyManifestInner object itself.
     */
    public DataPolicyManifestInner withStandard(List<String> standard) {
        this.standard = standard;
        return this;
    }

    /**
     * Get the custom property: An array of data manifest custom resource definition.
     *
     * @return the custom value.
     */
    public List<DataManifestCustomResourceFunctionDefinition> custom() {
        return this.custom;
    }

    /**
     * Set the custom property: An array of data manifest custom resource definition.
     *
     * @param custom the custom value to set.
     * @return the DataPolicyManifestInner object itself.
     */
    public DataPolicyManifestInner withCustom(List<DataManifestCustomResourceFunctionDefinition> custom) {
        this.custom = custom;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceTypeAliases() != null) {
            resourceTypeAliases().forEach(e -> e.validate());
        }
        if (effects() != null) {
            effects().forEach(e -> e.validate());
        }
        if (custom() != null) {
            custom().forEach(e -> e.validate());
        }
    }
}
