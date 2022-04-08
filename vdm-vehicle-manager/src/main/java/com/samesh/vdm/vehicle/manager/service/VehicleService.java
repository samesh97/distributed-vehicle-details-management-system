package com.samesh.vdm.vehicle.manager.service;



import vehicle.Vehicle;

import java.util.List;

public interface VehicleService {
    List<Vehicle> findAll();
    Vehicle findOne(int id);
    Vehicle save(Vehicle vehicle);
}
