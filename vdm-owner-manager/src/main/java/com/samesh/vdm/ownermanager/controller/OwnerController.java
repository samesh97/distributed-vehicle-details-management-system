package com.samesh.vdm.ownermanager.controller;

import com.samesh.vdm.ownermanager.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import owner.Owner;

import java.util.List;

@RestController
@RequestMapping(value = "/owner")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class OwnerController {

    @Autowired
    OwnerService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Owner> findAll() {
        return service.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Owner findOne(@PathVariable int id) {
        return service.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Owner save(@RequestBody Owner owner) {
        return service.save(owner);
    }
}
