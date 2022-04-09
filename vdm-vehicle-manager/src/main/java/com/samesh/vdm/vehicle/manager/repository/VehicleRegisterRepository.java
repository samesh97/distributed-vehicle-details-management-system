package com.samesh.vdm.vehicle.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vehicle.Registration;
import vehicle.Vehicle;

public interface VehicleRegisterRepository extends JpaRepository<Registration,Integer> {
}
