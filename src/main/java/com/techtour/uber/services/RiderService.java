package com.techtour.uber.services;

import com.techtour.uber.dto.DriverDTO;
import com.techtour.uber.dto.RideDTO;
import com.techtour.uber.dto.RideRequestDTO;
import com.techtour.uber.dto.RiderDTO;

import java.util.List;

public interface RiderService {

    RideRequestDTO requestRide(RideRequestDTO rideRequestDTO);

    RideDTO cancelRide(Long rideId);

    DriverDTO rateDriver(Long rideId, Integer rating);

    RiderDTO getMyProfile();

    List<RideDTO> getAllMyRides();
}
