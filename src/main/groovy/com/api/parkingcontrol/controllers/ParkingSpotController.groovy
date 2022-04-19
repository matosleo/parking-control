package com.api.parkingcontrol.controllers

import com.api.parkingcontrol.dtos.ParkingSpotDto
import com.api.parkingcontrol.models.ParkingSpotModel
import com.api.parkingcontrol.services.ParkingSpotService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.validation.Valid


@RestController
@RequestMapping("/parking-spot")
class ParkingSpotController {


    @Autowired
    ParkingSpotService parkingSpotService

    @PostMapping
    ResponseEntity<ParkingSpotDto> createParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpotService.create(parkingSpotDto))
    }

    @GetMapping
    ResponseEntity<List<ParkingSpotModel>> getAllParkingSpots() {
        return ResponseEntity.status(HttpStatus.OK).body(parkingSpotService.findAll())
    }


}
