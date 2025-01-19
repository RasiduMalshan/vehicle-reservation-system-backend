package com.example.vehicle_reservation_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vehicle_reservation_system.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}