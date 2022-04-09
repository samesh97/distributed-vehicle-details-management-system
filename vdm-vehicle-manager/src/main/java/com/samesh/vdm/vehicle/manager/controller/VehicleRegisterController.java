package com.samesh.vdm.vehicle.manager.controller;

import com.samesh.vdm.vehicle.manager.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vehicle.Registration;

import java.util.List;

@RestController
@RequestMapping(value = "/vehicle/register")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class VehicleRegisterController {

    @Autowired
    RegisterService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Registration> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Registration findOne(@PathVariable int id) {
        return service.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity save(@RequestBody Registration vehicle) {
        return service.save(vehicle);
    }
}
