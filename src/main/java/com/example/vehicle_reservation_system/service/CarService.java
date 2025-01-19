package com.example.vehicle_reservation_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.vehicle_reservation_system.model.Car;
import com.example.vehicle_reservation_system.repository.CarRepository;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAvailableCars() {
        return carRepository.findAll(); // Add filtering logic here
    }
}