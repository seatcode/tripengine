package org.metropolis.user

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAll(): List<UserEntity> = userService.getAll()

    @GetMapping("/{userId}")
    fun getUser(@PathVariable userId: Long) = userService.getById(userId)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(@Valid @RequestBody userDTO: UserDTO) = userService.create(userDTO)

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(@PathVariable userId: Long) = userService.deleteById(userId)

}