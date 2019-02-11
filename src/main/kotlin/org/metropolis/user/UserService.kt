package org.metropolis.user

import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAll(): List<UserEntity> = userRepository.findAll()

    fun getById(id: Long): UserEntity = userRepository.findById(id).orElseThrow(::EntityNotFoundException)

    fun create(userDTO: UserDTO): UserEntity = userRepository.save(UserEntity.from(userDTO))

    fun deleteById(id: Long) = userRepository.deleteById(id)
}