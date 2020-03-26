package com.galvanize.services;

import com.galvanize.entities.Driver;
import com.galvanize.repositories.CarRepository;
import com.galvanize.repositories.DriverRepository;
import com.galvanize.repositories.RaceRepository;
import org.springframework.stereotype.Service;

@Service
public class SpeedwayService {
    RaceRepository raceRepository;
    CarRepository carRepository;
    DriverRepository driverRepository;

    public SpeedwayService(DriverRepository driverRepository, CarRepository carRepository, RaceRepository raceRepository) {
        this.driverRepository = driverRepository;
        this.carRepository = carRepository;
        this.raceRepository = raceRepository;
    }

    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver findDriverById(long l) {
        return driverRepository.findById(l).get();
    }
}
