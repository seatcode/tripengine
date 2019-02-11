package org.metropolis.stop

import org.springframework.data.jpa.repository.JpaRepository

interface StopRepository : JpaRepository<StopEntity, Long>
