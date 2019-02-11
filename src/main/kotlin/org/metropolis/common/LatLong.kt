package org.metropolis.common

import javax.persistence.Embeddable

@Embeddable
data class LatLong(val latitude: Double = 0.0, val longitude: Double= 0.0)
