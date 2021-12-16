package com.garage.Garage.service;

import com.garage.Garage.model.ParkingGarage;

public interface ParkingGarageService {
    ParkingGarage save(ParkingGarage parkingGarage);

    ParkingGarage add(ParkingGarage parkingGarage);

    void delete(ParkingGarage parkingGarage);
}
