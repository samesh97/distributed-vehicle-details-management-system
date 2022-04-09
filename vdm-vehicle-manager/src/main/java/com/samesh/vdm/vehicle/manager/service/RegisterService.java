package com.samesh.vdm.vehicle.manager.service;

import org.springframework.http.ResponseEntity;
import vehicle.Registration;

import java.util.List;

public interface RegisterService {

    Registration findOne(int id);
    List<Registration> findAll();
    ResponseEntity save(Registration registration);
}
