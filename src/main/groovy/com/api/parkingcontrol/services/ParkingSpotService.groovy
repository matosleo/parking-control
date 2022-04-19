package com.api.parkingcontrol.services

import com.api.parkingcontrol.dtos.ParkingSpotDto
import com.api.parkingcontrol.exceptions.ExistsByApartmentAndBlockException
import com.api.parkingcontrol.exceptions.ExistsByLicensePlateCarException
import com.api.parkingcontrol.exceptions.ExistsByParkingSpotNumberException
import com.api.parkingcontrol.models.ParkingSpotModel
import com.api.parkingcontrol.repositories.ParkingSpotRepository
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import javax.transaction.Transactional

@Service
class ParkingSpotService {

    @Autowired
    ParkingSpotRepository parkingSpotRepository;

    @Transactional
    ParkingSpotDto create(ParkingSpotDto parkingSpotDto) {
        if(parkingSpotRepository.existsByLicensePlateCar(parkingSpotDto.licensePlateCar)) {
            throw new ExistsByLicensePlateCarException()
        }

        if(parkingSpotRepository.existsByParkingSpotNumber(parkingSpotDto.parkingSpotNumber)) {
            throw new ExistsByParkingSpotNumberException()
        }

        if(parkingSpotRepository.existsByApartmentAndBlock(parkingSpotDto.apartment, parkingSpotDto.block)) {
            throw new ExistsByApartmentAndBlockException()
        }

        def parkingSpotModel = new ParkingSpotModel()
        BeanUtils.copyProperties(parkingSpotDto, parkingSpotModel)
        def parkingSpotCreated = parkingSpotRepository.save(parkingSpotModel)
        BeanUtils.copyProperties(parkingSpotCreated, parkingSpotDto)
        return parkingSpotDto
    }

    List<ParkingSpotModel> findAll() {
        return parkingSpotRepository.findAll()
    }

}
