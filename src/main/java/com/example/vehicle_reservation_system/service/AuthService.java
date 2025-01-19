package com.example.vehicle_reservation_system.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "password".equals(password); // Example
    }
}