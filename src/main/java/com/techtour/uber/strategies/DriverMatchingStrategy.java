package com.techtour.uber.strategies;

import com.techtour.uber.dto.RideRequestDTO;
import com.techtour.uber.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDTO rideRequestDTO);
}
