package com.hamidul.firstProject.Service;

import java.util.List;
import java.util.Optional;

import com.hamidul.firstProject.Entity.Customer;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Optional<Customer> getCustomerById(Long id);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Long id, Customer updatedCustomer);

    void deleteCustomer(Long id);
}
