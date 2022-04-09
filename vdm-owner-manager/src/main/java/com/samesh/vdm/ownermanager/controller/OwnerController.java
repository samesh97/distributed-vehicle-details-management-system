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
    OwnerService ownerService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Owner> getOwners() {
        return ownerService.findAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Owner getOwner(@PathVariable int id) {
        return ownerService.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Owner save(@RequestBody Owner owner) {
        return ownerService.save(owner);
    }
}
