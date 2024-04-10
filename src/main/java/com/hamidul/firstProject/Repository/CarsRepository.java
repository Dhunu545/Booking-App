package com.hamidul.firstProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamidul.firstProject.Entity.Cars;

public interface CarsRepository extends JpaRepository <Cars, Long>{
    
}
