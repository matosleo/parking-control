package com.api.parkingcontrol.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class ExistsByParkingSpotNumberException extends ResponseStatusException {
    ExistsByParkingSpotNumberException(){
        super(HttpStatus.CONFLICT, "Parking spot number is already in use!")
    }
}
