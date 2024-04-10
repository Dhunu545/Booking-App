package com.hamidul.firstProject.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamidul.firstProject.Entity.Cars;
import com.hamidul.firstProject.Repository.CarsRepository;
import com.hamidul.firstProject.Service.CarsService;

@Service
public class CarsServiceImpl implements CarsService{
    @Autowired
    private CarsRepository carsRepository;

    @Override
    public List<Cars> getAllCars() {
        
        return carsRepository.findAll();
    }

    @Override
    public Cars getCarById(long id) {
        Optional<Cars> optionalCar = carsRepository.findById(id);
        return optionalCar.orElse(null);
    }

    @Override
    public Cars createCar(Cars car) {
        return carsRepository.save(car);
    }

    @Override
    public Cars updateCar(long id, Cars updatedCar) {
        Optional<Cars> optionalCar = carsRepository.findById(id);
        if (optionalCar.isPresent()) {
            return carsRepository.save(updatedCar);
        }
        return null;
    }

    @Override
    public void deleteCar(long id) {
        carsRepository.deleteById(id);
    }
}
