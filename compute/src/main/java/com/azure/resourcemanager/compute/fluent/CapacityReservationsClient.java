// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.compute.fluent.models.CapacityReservationInner;
import com.azure.resourcemanager.compute.models.CapacityReservationInstanceViewTypes;
import com.azure.resourcemanager.compute.models.CapacityReservationUpdate;

/** An instance of this class provides access to all the operations defined in CapacityReservationsClient. */
public interface CapacityReservationsClient {
    /**
     * The operation to create or update a capacity reservation. Please note some properties can be set only during
     * capacity reservation creation. Please refer to https://aka.ms/CapacityReservation for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param parameters Parameters supplied to the Create capacity reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CapacityReservationInner>, CapacityReservationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        CapacityReservationInner parameters);

    /**
     * The operation to create or update a capacity reservation. Please note some properties can be set only during
     * capacity reservation creation. Please refer to https://aka.ms/CapacityReservation for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param parameters Parameters supplied to the Create capacity reservation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CapacityReservationInner>, CapacityReservationInner> beginCreateOrUpdate(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        CapacityReservationInner parameters,
        Context context);

    /**
     * The operation to create or update a capacity reservation. Please note some properties can be set only during
     * capacity reservation creation. Please refer to https://aka.ms/CapacityReservation for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param parameters Parameters supplied to the Create capacity reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityReservationInner createOrUpdate(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        CapacityReservationInner parameters);

    /**
     * The operation to create or update a capacity reservation. Please note some properties can be set only during
     * capacity reservation creation. Please refer to https://aka.ms/CapacityReservation for more details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param parameters Parameters supplied to the Create capacity reservation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityReservationInner createOrUpdate(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        CapacityReservationInner parameters,
        Context context);

    /**
     * The operation to update a capacity reservation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param parameters Parameters supplied to the Update capacity reservation operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CapacityReservationInner>, CapacityReservationInner> beginUpdate(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        CapacityReservationUpdate parameters);

    /**
     * The operation to update a capacity reservation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param parameters Parameters supplied to the Update capacity reservation operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<CapacityReservationInner>, CapacityReservationInner> beginUpdate(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        CapacityReservationUpdate parameters,
        Context context);

    /**
     * The operation to update a capacity reservation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param parameters Parameters supplied to the Update capacity reservation operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityReservationInner update(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        CapacityReservationUpdate parameters);

    /**
     * The operation to update a capacity reservation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param parameters Parameters supplied to the Update capacity reservation operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityReservationInner update(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        CapacityReservationUpdate parameters,
        Context context);

    /**
     * The operation to delete a capacity reservation. This operation is allowed only when all the associated resources
     * are disassociated from the capacity reservation. Please refer to https://aka.ms/CapacityReservation for more
     * details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String capacityReservationGroupName, String capacityReservationName);

    /**
     * The operation to delete a capacity reservation. This operation is allowed only when all the associated resources
     * are disassociated from the capacity reservation. Please refer to https://aka.ms/CapacityReservation for more
     * details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String capacityReservationGroupName, String capacityReservationName, Context context);

    /**
     * The operation to delete a capacity reservation. This operation is allowed only when all the associated resources
     * are disassociated from the capacity reservation. Please refer to https://aka.ms/CapacityReservation for more
     * details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String capacityReservationGroupName, String capacityReservationName);

    /**
     * The operation to delete a capacity reservation. This operation is allowed only when all the associated resources
     * are disassociated from the capacity reservation. Please refer to https://aka.ms/CapacityReservation for more
     * details.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String capacityReservationGroupName, String capacityReservationName, Context context);

    /**
     * The operation that retrieves information about the capacity reservation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CapacityReservationInner get(
        String resourceGroupName, String capacityReservationGroupName, String capacityReservationName);

    /**
     * The operation that retrieves information about the capacity reservation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param capacityReservationName The name of the capacity reservation.
     * @param expand The expand expression to apply on the operation. 'InstanceView' retrieves a snapshot of the runtime
     *     properties of the capacity reservation that is managed by the platform and can change outside of control
     *     plane operations.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specifies information about the capacity reservation.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CapacityReservationInner> getWithResponse(
        String resourceGroupName,
        String capacityReservationGroupName,
        String capacityReservationName,
        CapacityReservationInstanceViewTypes expand,
        Context context);

    /**
     * Lists all of the capacity reservations in the specified capacity reservation group. Use the nextLink property in
     * the response to get the next page of capacity reservations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list capacity reservation operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapacityReservationInner> listByCapacityReservationGroup(
        String resourceGroupName, String capacityReservationGroupName);

    /**
     * Lists all of the capacity reservations in the specified capacity reservation group. Use the nextLink property in
     * the response to get the next page of capacity reservations.
     *
     * @param resourceGroupName The name of the resource group.
     * @param capacityReservationGroupName The name of the capacity reservation group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.models.ApiErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list capacity reservation operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<CapacityReservationInner> listByCapacityReservationGroup(
        String resourceGroupName, String capacityReservationGroupName, Context context);
}
