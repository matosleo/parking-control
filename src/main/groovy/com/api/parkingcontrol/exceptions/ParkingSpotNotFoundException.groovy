package com.api.parkingcontrol.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class ParkingSpotNotFoundException extends ResponseStatusException{
    ParkingSpotNotFoundException() {
        super(HttpStatus.NOT_FOUND, "Parking Spot is not found.")
    }
}
