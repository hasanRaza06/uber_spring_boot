package com.techtour.uber.services.impl;

import com.techtour.uber.dto.DriverDTO;
import com.techtour.uber.dto.RideDTO;
import com.techtour.uber.dto.RideRequestDTO;
import com.techtour.uber.dto.RiderDTO;
import com.techtour.uber.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequestDTO) {
        return null;
    }

    @Override
    public RideDTO cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllMyRides() {
        return List.of();
    }
}
