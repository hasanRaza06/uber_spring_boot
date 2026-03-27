package com.techtour.uber.strategies;

import com.techtour.uber.dto.RideRequestDTO;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDTO rideRequestDTO);
}
