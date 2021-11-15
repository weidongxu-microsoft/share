// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Probe of the application gateway. */
@JsonFlatten
@Fluent
public class ApplicationGatewayProbe extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationGatewayProbe.class);

    /*
     * Name of the probe that is unique within an Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The protocol used for the probe.
     */
    @JsonProperty(value = "properties.protocol")
    private ApplicationGatewayProtocol protocol;

    /*
     * Host name to send the probe to.
     */
    @JsonProperty(value = "properties.host")
    private String host;

    /*
     * Relative path of probe. Valid path starts from '/'. Probe is sent to
     * <Protocol>://<host>:<port><path>.
     */
    @JsonProperty(value = "properties.path")
    private String path;

    /*
     * The probing interval in seconds. This is the time interval between two
     * consecutive probes. Acceptable values are from 1 second to 86400
     * seconds.
     */
    @JsonProperty(value = "properties.interval")
    private Integer interval;

    /*
     * The probe timeout in seconds. Probe marked as failed if valid response
     * is not received with this timeout period. Acceptable values are from 1
     * second to 86400 seconds.
     */
    @JsonProperty(value = "properties.timeout")
    private Integer timeout;

    /*
     * The probe retry count. Backend server is marked down after consecutive
     * probe failure count reaches UnhealthyThreshold. Acceptable values are
     * from 1 second to 20.
     */
    @JsonProperty(value = "properties.unhealthyThreshold")
    private Integer unhealthyThreshold;

    /*
     * Whether the host header should be picked from the backend http settings.
     * Default value is false.
     */
    @JsonProperty(value = "properties.pickHostNameFromBackendHttpSettings")
    private Boolean pickHostnameFromBackendHttpSettings;

    /*
     * Minimum number of servers that are always marked healthy. Default value
     * is 0.
     */
    @JsonProperty(value = "properties.minServers")
    private Integer minServers;

    /*
     * Criterion for classifying a healthy probe response.
     */
    @JsonProperty(value = "properties.match")
    private ApplicationGatewayProbeHealthResponseMatch match;

    /*
     * The provisioning state of the probe resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Custom port which will be used for probing the backend servers. The
     * valid value ranges from 1 to 65535. In case not set, port from http
     * settings will be used. This property is valid for Standard_v2 and WAF_v2
     * only.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * Get the name property: Name of the probe that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the probe that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the protocol property: The protocol used for the probe.
     *
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: The protocol used for the probe.
     *
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withProtocol(ApplicationGatewayProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the host property: Host name to send the probe to.
     *
     * @return the host value.
     */
    public String host() {
        return this.host;
    }

    /**
     * Set the host property: Host name to send the probe to.
     *
     * @param host the host value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * Get the path property: Relative path of probe. Valid path starts from '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Relative path of probe. Valid path starts from '/'. Probe is sent to
     * &lt;Protocol&gt;://&lt;host&gt;:&lt;port&gt;&lt;path&gt;.
     *
     * @param path the path value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the interval property: The probing interval in seconds. This is the time interval between two consecutive
     * probes. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the interval value.
     */
    public Integer interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The probing interval in seconds. This is the time interval between two consecutive
     * probes. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param interval the interval value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the timeout property: The probe timeout in seconds. Probe marked as failed if valid response is not received
     * with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the timeout value.
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: The probe timeout in seconds. Probe marked as failed if valid response is not received
     * with this timeout period. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param timeout the timeout value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the unhealthyThreshold property: The probe retry count. Backend server is marked down after consecutive probe
     * failure count reaches UnhealthyThreshold. Acceptable values are from 1 second to 20.
     *
     * @return the unhealthyThreshold value.
     */
    public Integer unhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * Set the unhealthyThreshold property: The probe retry count. Backend server is marked down after consecutive probe
     * failure count reaches UnhealthyThreshold. Acceptable values are from 1 second to 20.
     *
     * @param unhealthyThreshold the unhealthyThreshold value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withUnhealthyThreshold(Integer unhealthyThreshold) {
        this.unhealthyThreshold = unhealthyThreshold;
        return this;
    }

    /**
     * Get the pickHostnameFromBackendHttpSettings property: Whether the host header should be picked from the backend
     * http settings. Default value is false.
     *
     * @return the pickHostnameFromBackendHttpSettings value.
     */
    public Boolean pickHostnameFromBackendHttpSettings() {
        return this.pickHostnameFromBackendHttpSettings;
    }

    /**
     * Set the pickHostnameFromBackendHttpSettings property: Whether the host header should be picked from the backend
     * http settings. Default value is false.
     *
     * @param pickHostnameFromBackendHttpSettings the pickHostnameFromBackendHttpSettings value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withPickHostnameFromBackendHttpSettings(
        Boolean pickHostnameFromBackendHttpSettings) {
        this.pickHostnameFromBackendHttpSettings = pickHostnameFromBackendHttpSettings;
        return this;
    }

    /**
     * Get the minServers property: Minimum number of servers that are always marked healthy. Default value is 0.
     *
     * @return the minServers value.
     */
    public Integer minServers() {
        return this.minServers;
    }

    /**
     * Set the minServers property: Minimum number of servers that are always marked healthy. Default value is 0.
     *
     * @param minServers the minServers value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withMinServers(Integer minServers) {
        this.minServers = minServers;
        return this;
    }

    /**
     * Get the match property: Criterion for classifying a healthy probe response.
     *
     * @return the match value.
     */
    public ApplicationGatewayProbeHealthResponseMatch match() {
        return this.match;
    }

    /**
     * Set the match property: Criterion for classifying a healthy probe response.
     *
     * @param match the match value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withMatch(ApplicationGatewayProbeHealthResponseMatch match) {
        this.match = match;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the probe resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the port property: Custom port which will be used for probing the backend servers. The valid value ranges
     * from 1 to 65535. In case not set, port from http settings will be used. This property is valid for Standard_v2
     * and WAF_v2 only.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Custom port which will be used for probing the backend servers. The valid value ranges
     * from 1 to 65535. In case not set, port from http settings will be used. This property is valid for Standard_v2
     * and WAF_v2 only.
     *
     * @param port the port value to set.
     * @return the ApplicationGatewayProbe object itself.
     */
    public ApplicationGatewayProbe withPort(Integer port) {
        this.port = port;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayProbe withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (match() != null) {
            match().validate();
        }
    }
}
