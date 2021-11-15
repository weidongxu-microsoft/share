// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.resourcemanager.network.fluent.models.ServiceEndpointPolicyDefinitionInner;
import java.util.List;

/** An immutable client-side representation of ServiceEndpointPolicyDefinition. */
public interface ServiceEndpointPolicyDefinition {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the description property: A description for this rule. Restricted to 140 chars.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the service property: Service endpoint name.
     *
     * @return the service value.
     */
    String service();

    /**
     * Gets the serviceResources property: A list of service resources.
     *
     * @return the serviceResources value.
     */
    List<String> serviceResources();

    /**
     * Gets the provisioningState property: The provisioning state of the service endpoint policy definition resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.fluent.models.ServiceEndpointPolicyDefinitionInner object.
     *
     * @return the inner object.
     */
    ServiceEndpointPolicyDefinitionInner innerModel();
}