package com.api.parkingcontrol.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class ExistsByApartmentAndBlockException extends ResponseStatusException {
    ExistsByApartmentAndBlockException() {
        super( HttpStatus.CONFLICT, "Parking spot is already registered for this apartment/block")
    }
}
