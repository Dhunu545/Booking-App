package com.hamidul.firstProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamidul.firstProject.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
