package com.samesh.vdm.vehicle.manager.repository;

import vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleServiceRepository extends JpaRepository<Vehicle,Integer> {
}
