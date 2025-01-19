package com.example.vehicle_reservation_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vehicle_reservation_system.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}

