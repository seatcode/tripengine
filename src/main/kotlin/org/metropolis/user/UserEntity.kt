package org.metropolis.user

import com.fasterxml.jackson.annotation.JsonIdentityInfo
import com.fasterxml.jackson.annotation.ObjectIdGenerators
import javax.persistence.*

@Entity
@Table(name = "user")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator::class, property = "id")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    val id: Long = 0,

    @Column(nullable = false)
    val username: String = "",

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val userType: UserType = UserType.DRIVER
) {
   companion object ModelMapper {
        fun from(userDTO: UserDTO) =
            UserEntity(
                username = userDTO.username,
                userType = userDTO.userType
            )
    }
}