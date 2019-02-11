package org.metropolis.stop

import org.metropolis.trip.TripEntity
import org.metropolis.trip.TripService
import org.metropolis.user.UserEntity
import org.metropolis.user.UserService
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class StopService(
    private val stopRepository: StopRepository,
    private val userService: UserService,
    private val tripService: TripService
) {

    fun getAll(): List<StopEntity> = stopRepository.findAll()

    fun getById(id: Long): StopEntity = stopRepository.findById(id).orElseThrow(::EntityNotFoundException)

    fun create(stopDTO: StopDTO): StopEntity {
        val passenger: UserEntity = userService.getById(stopDTO.passengerId)
        val trip: TripEntity = tripService.getById(stopDTO.tripId)
        return stopRepository.save(StopEntity.from(stopDTO, passenger, trip))
    }

    fun deleteById(id: Long) = stopRepository.deleteById(id)
}