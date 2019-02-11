package org.metropolis.trip

import javax.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("trips")
class TripController(private val tripService: TripService) {

    @GetMapping
    fun getAll(): List<TripEntity> = tripService.getAll()

    @GetMapping("/{tripId}")
    fun getTrip(@PathVariable tripId: Long) = tripService.getById(tripId)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createTrip(@Valid @RequestBody tripDTO: TripDTO) = tripService.create(tripDTO)

    @DeleteMapping("/{tripId}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteTrip(@PathVariable tripId: Long) = tripService.deleteById(tripId)


}