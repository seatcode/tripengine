package org.metropolis.trip

import org.springframework.data.jpa.repository.JpaRepository

interface TripRepository : JpaRepository<TripEntity, Long>

