package com.hamidul.firstProject.Service;

import java.util.List;

import com.hamidul.firstProject.Entity.Cars;

public interface CarsService {
    List<Cars> getAllCars();

    Cars getCarById(long carId);

    Cars createCar(Cars car);

    Cars updateCar(long carId, Cars updatedCar);

    void deleteCar(long carId);
}
