package com.api.parkingcontrol.models

import org.hibernate.annotations.CreationTimestamp

import javax.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "TB_PARKING_SPOT")
class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id

    @Column(nullable = false, unique = true, length = 10)
    String parkingSpotNumber

    @Column(nullable = false, unique = true, length = 7)
    String licensePlateCar

    @Column(nullable = false, length = 70)
    String brandCar

    @Column(nullable = false, length = 70)
    String modelCar

    @Column(nullable = false, length = 70)
    String colorCar

    @Column(nullable = false)
    @CreationTimestamp
    LocalDateTime registrationDate

    @Column(nullable = false, length = 130)
    String responsibleName

    @Column(nullable = false, length = 30)
    String apartment

    @Column(nullable = false, length = 30)
    String block

}
