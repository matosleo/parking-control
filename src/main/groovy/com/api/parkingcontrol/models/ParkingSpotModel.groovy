package com.api.parkingcontrol.models

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
    String parking_spot_number

    @Column(nullable = false, unique = true, length = 7)
    String license_plate_car

    @Column(nullable = false, length = 70)
    String brand_car

    @Column(nullable = false, length = 70)
    String model_car

    @Column(nullable = false, length = 70)
    String color_car

    @Column(nullable = false)
    LocalDateTime registration_date

    @Column(nullable = false, length = 130)
    String responsible_name

    @Column(nullable = false, length = 30)
    String apartment

    @Column(nullable = false, length = 30)
    String block

}
