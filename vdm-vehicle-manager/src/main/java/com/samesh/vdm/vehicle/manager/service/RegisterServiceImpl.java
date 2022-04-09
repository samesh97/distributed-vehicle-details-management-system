package com.samesh.vdm.vehicle.manager.service;

import com.samesh.vdm.vehicle.manager.repository.VehicleRegisterRepository;
import config.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import owner.Owner;
import vehicle.Registration;
import vehicle.Vehicle;

import java.util.Date;
import java.util.List;

@Service
public class RegisterServiceImpl implements RegisterService{

    @Autowired
    VehicleRegisterRepository repository;
    @Autowired
    VehicleService vehicleService;
    @Autowired
    RestTemplate restTemplate;

    @Override
    public Registration findOne(int id) {
        if(repository.findById(id).isPresent())
            return repository.findById(id).get();
        return null;
    }

    @Override
    public List<Registration> findAll() {
        return repository.findAll();
    }

    @Override
    public ResponseEntity save(Registration registration) {
        Vehicle vehicle = vehicleService.findOne(registration.getVehicleId());
        if(vehicle == null)
            return ResponseEntity.badRequest().body("Invalid Vehicle");
        if(getOwner(registration.getOwnerId()) == null)
            return ResponseEntity.badRequest().body("Invalid Owner");

        //set current Date
        registration.setDate(new Date());

        return ResponseEntity.ok().body(repository.save(registration));
    }

    public Owner getOwner(int id){
        return restTemplate.getForObject(Url.OWNER_SERVICE + "/" + id,Owner.class);
    }
}
