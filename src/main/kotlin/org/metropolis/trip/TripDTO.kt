package org.metropolis.trip

import com.fasterxml.jackson.annotation.JsonInclude
import org.metropolis.common.LatLong

@JsonInclude(JsonInclude.Include.NON_NULL)
data class TripDTO(
    val maxPax: Int,
    val description: String,
    val startTime: Long,
    val endTime: Long,
    val origin: LatLong,
    val destination: LatLong,
    val route: String,
    val driverId: Long
)