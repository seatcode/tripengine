package org.metropolis.stop

import com.fasterxml.jackson.annotation.JsonInclude
import org.metropolis.common.LatLong

@JsonInclude(JsonInclude.Include.NON_NULL)
data class StopDTO(
    val stopTime: Long,
    val stopStatus: StopStatus,
    val position: LatLong,
    val passengerId: Long,
    val tripId: Long
)