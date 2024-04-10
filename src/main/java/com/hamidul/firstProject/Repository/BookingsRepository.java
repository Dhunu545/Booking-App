package com.hamidul.firstProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamidul.firstProject.Entity.Bookings;

public interface BookingsRepository extends JpaRepository<Bookings, Long>{

}
