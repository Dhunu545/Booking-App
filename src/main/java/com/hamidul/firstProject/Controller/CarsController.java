package com.hamidul.firstProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamidul.firstProject.Entity.Cars;
import com.hamidul.firstProject.Service.CarsService;

@RestController
@RequestMapping("/Cars")
public class CarsController {
    @Autowired
    private CarsService carsService;

    @GetMapping("/")
    public List<Cars> getAllCars(){
        return carsService.getAllCars();
    }

    @GetMapping("/{id}")
    public Cars getCarById(@PathVariable long carId){
        return carsService.getCarById(carId);
    }

    @PostMapping("/")
    public Cars createCar(@RequestBody Cars car){
        return carsService.createCar(car);
    }

    @PutMapping("/{id}")
    public Cars updateCar(@PathVariable long carId, @RequestBody Cars cars){
        return carsService.updateCar(carId, cars);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable long carId){
        carsService.deleteCar(carId);
    }
}
