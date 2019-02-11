package org.metropolis.stop

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("stops")
class StopController(private val stopService: StopService) {

    @GetMapping
    fun getAll(): List<StopEntity> = stopService.getAll()

    @GetMapping("/{stopId}")
    fun getStop(@PathVariable stopId: Long) = stopService.getById(stopId)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createStop(@Valid @RequestBody stopDTO: StopDTO) = stopService.create(stopDTO)


    @DeleteMapping("/{stopId}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteStop(@PathVariable stopId: Long) = stopService.deleteById(stopId)


}