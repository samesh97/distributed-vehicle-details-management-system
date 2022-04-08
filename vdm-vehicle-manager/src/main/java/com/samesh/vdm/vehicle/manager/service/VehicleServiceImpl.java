package com.samesh.vdm.vehicle.manager.service;


import com.samesh.vdm.vehicle.manager.repository.VehicleServiceRepository;
import vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleServiceRepository repository;

    @Override
    public List<Vehicle> findAll() {
        return repository.findAll();
    }

    @Override
    public Vehicle findOne(int id) {
        if(repository.findById(id).isPresent())
            return repository.findById(id).get();
        return null;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return repository.save(vehicle);
    }
}
