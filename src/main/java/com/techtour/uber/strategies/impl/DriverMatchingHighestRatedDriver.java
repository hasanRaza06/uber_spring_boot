package com.techtour.uber.strategies.impl;

import com.techtour.uber.dto.RideRequestDTO;
import com.techtour.uber.entities.Driver;
import com.techtour.uber.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriver implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO) {
        return List.of();
    }
}
