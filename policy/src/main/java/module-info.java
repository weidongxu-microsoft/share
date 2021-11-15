// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.policy {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.policy;
    exports com.azure.resourcemanager.policy.fluent;
    exports com.azure.resourcemanager.policy.fluent.models;
    exports com.azure.resourcemanager.policy.models;

    opens com.azure.resourcemanager.policy.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.policy.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}