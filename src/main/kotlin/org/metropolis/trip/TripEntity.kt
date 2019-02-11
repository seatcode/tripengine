package org.metropolis.trip

import com.fasterxml.jackson.annotation.*
import org.metropolis.common.LatLong
import org.metropolis.stop.StopEntity
import org.metropolis.user.UserDTO
import org.metropolis.user.UserEntity
import org.metropolis.user.UserType

import javax.persistence.*

@Entity
@Table(name = "trip")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator::class, property = "id")
data class TripEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    val id: Long = 0,

    @Column(nullable = false)
    val maxPax: Int = 0,

    @Column(columnDefinition = "TEXT")
    val description: String = "",

    @Column(nullable = false)
    val startTime: Long = 0,

    @Column(nullable = false)
    val endTime: Long = 0,

    @AttributeOverrides(
        AttributeOverride(name = "latitude", column = Column(name = "or_latitude")),
        AttributeOverride(name = "longitude", column = Column(name = "or_longitude"))
    )
    @Embedded
    var origin: LatLong? = null,

    @AttributeOverrides(
        AttributeOverride(name = "latitude", column = Column(name = "dest_latitude")),
        AttributeOverride(name = "longitude", column = Column(name = "dest_longitude"))
    )
    @Embedded
    var destination: LatLong? = null,

    @Column(columnDefinition = "TEXT", nullable = false)
    val route: String = "",

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "driver_id", nullable = false)
    @JsonIdentityReference(alwaysAsId = true)
    val driver: UserEntity = UserEntity(),

    @OneToMany(mappedBy = "trip")
    @JsonManagedReference
    @JsonIdentityReference(alwaysAsId = true)
    val stops: List<StopEntity> = emptyList()
) {
   companion object ModelMapper {
        fun from(tripDTO: TripDTO, driver: UserEntity) =
            TripEntity(
                maxPax = tripDTO.maxPax,
                description = tripDTO.description,
                startTime = tripDTO.startTime,
                endTime = tripDTO.endTime,
                origin = tripDTO.origin,
                destination = tripDTO.destination,
                route = tripDTO.route,
                driver = driver
            )
    }
}