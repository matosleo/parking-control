package com.api.parkingcontrol.exceptions

import org.springframework.http.HttpStatus
import org.springframework.web.server.ResponseStatusException

class ExistsByLicensePlateCarException extends ResponseStatusException {
    ExistsByLicensePlateCarException() {
        super(HttpStatus.BAD_REQUEST, "Já existe uma vaga de estacionamento cadastrada com esse código de placa veicular.")
    }
}
