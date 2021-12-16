package com.garage.Garage.service;

import com.garage.Garage.model.ParkingGarage;
import com.garage.Garage.repository.ParkingGarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingGarageImpl implements ParkingGarageService {

    private final ParkingGarageRepository parkingGarageRepository;

    @Autowired
    public ParkingGarageImpl(ParkingGarageRepository parkingGarageRepository) {
        this.parkingGarageRepository = parkingGarageRepository;
    }

    @Override
    public ParkingGarage save(ParkingGarage parkingGarage) {
        return parkingGarageRepository.saveAndFlush(parkingGarage);
    }

    @Override
    public ParkingGarage add(ParkingGarage parkingGarage) {
        return null;
    }

    @Override
    public void delete(ParkingGarage parkingGarage) {
         parkingGarageRepository.delete(parkingGarage);
    }


}
