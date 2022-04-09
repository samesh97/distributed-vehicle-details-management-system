package com.samesh.vdm.vehicle.manager.controller;

import com.samesh.vdm.vehicle.manager.service.VehicleService;
import vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/vehicle/details")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class VehicleController {

    @Autowired
    VehicleService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Vehicle> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Vehicle findOne(@PathVariable int id) {
        return service.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Vehicle save(@RequestBody Vehicle vehicle) {
        return service.save(vehicle);
    }
}
