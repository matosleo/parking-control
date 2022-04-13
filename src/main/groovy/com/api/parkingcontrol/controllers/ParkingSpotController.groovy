package com.api.parkingcontrol.controllers

import com.api.parkingcontrol.dtos.ParkingSpotDto
import com.api.parkingcontrol.models.ParkingSpotModel
import com.api.parkingcontrol.services.ParkingSpotService
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.validation.Valid
import java.time.LocalDateTime
import java.time.ZoneId


@RestController
@RequestMapping("/parking-spot")
class ParkingSpotController {


    @Autowired
    ParkingSpotService parkingSpotService

    @PostMapping
    ResponseEntity<ParkingSpotDto> saveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto) {
        parkingSpotDto.setRegistration_date(LocalDateTime.now(ZoneId.of("UTC")))
        def parkingSpotModel = new ParkingSpotModel()
        BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel)
        def savedParkingSpot = parkingSpotService.save(parkingSpotModel)
        BeanUtils.copyProperties(savedParkingSpot, parkingSpotDto)
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotDto)
    }


}
