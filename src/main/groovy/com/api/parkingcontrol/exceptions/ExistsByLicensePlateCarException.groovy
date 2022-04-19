package com.api.parkingcontrol.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class ExistsByLicensePlateCarException extends ResponseStatusException {
    ExistsByLicensePlateCarException() {
        super(HttpStatus.CONFLICT, "Licence plate car is already in use!")
    }
}
