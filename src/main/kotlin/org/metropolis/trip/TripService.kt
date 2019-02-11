package org.metropolis.trip

import org.metropolis.user.UserEntity
import org.metropolis.user.UserService
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class TripService(
    private val tripRepository: TripRepository,
    private val userService: UserService
) {


    fun getAll(): List<TripEntity> = tripRepository.findAll()

    fun getById(id: Long): TripEntity = tripRepository.findById(id).orElseThrow(::EntityNotFoundException)

    fun create(tripDTO: TripDTO): TripEntity {
        val driver: UserEntity = userService.getById(tripDTO.driverId)
        return tripRepository.save(TripEntity.from(tripDTO, driver))
    }


    fun deleteById(id: Long) = tripRepository.deleteById(id)


}