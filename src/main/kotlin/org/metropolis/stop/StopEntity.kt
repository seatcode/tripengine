package org.metropolis.stop

import com.fasterxml.jackson.annotation.*
import org.metropolis.common.LatLong
import org.metropolis.trip.TripDTO
import org.metropolis.trip.TripEntity
import org.metropolis.user.UserEntity
import javax.persistence.*


@Entity
@Table(name = "stop")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator::class, property = "id")
data class StopEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    val id: Long = 0,

    @Column(nullable = false)
    val stopTime: Long = 0,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val stopStatus: StopStatus = StopStatus.REQUESTED,

    @Embedded
    var position: LatLong? = null,

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "passenger_id", nullable = false)
    @JsonIdentityReference(alwaysAsId = true)
    val passenger: UserEntity = UserEntity(),

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "trip_id", nullable = false)
    @JsonBackReference
    @JsonIdentityReference(alwaysAsId = true)
    val trip: TripEntity = TripEntity()

){
    companion object ModelMapper {
        fun from(stopDTO: StopDTO, passenger: UserEntity, trip: TripEntity) =
            StopEntity(
                stopTime = stopDTO.stopTime,
                stopStatus = stopDTO.stopStatus,
                position = stopDTO.position,
                passenger = passenger,
                trip = trip
            )
    }
}

