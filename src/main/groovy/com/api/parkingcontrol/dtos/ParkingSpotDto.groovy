package com.api.parkingcontrol.dtos

import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size
import java.time.LocalDateTime

class ParkingSpotDto {

    UUID id

    @NotBlank
    String parkingSpotNumber

    @NotBlank
    @Size(max = 7)
    String licensePlateCar

    @NotBlank
    String brandCar

    @NotBlank
    String modelCar

    @NotBlank
    String colorCar

    LocalDateTime registrationDate

    @NotBlank
    String responsibleName

    @NotBlank
    String apartment

    @NotBlank
    String block



}
