package com.api.parkingcontrol.dtos

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size
import java.time.LocalDateTime

class ParkingSpotDto {

    UUID id

    @NotBlank
    String parking_spot_number

    @NotBlank
    @Size(max = 7)
    String license_plate_car

    @NotBlank
    String brand_car

    @NotBlank
    String model_car

    @NotBlank
    String color_car

    @NotBlank
    String responsible_name

    @NotBlank
    String apartment

    @NotBlank
    String block

    LocalDateTime registration_date

    void setRegistration_date(LocalDateTime registration_date) {
        this.registration_date = registration_date
    }

}
