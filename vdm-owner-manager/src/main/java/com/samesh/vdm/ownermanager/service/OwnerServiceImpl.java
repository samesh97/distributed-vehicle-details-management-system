package com.samesh.vdm.ownermanager.service;

import com.samesh.vdm.ownermanager.repository.OwnerServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import owner.Owner;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService{

    @Autowired
    OwnerServiceRepository repository;

    @Override
    public Owner findOne(int id) {
        if(repository.findById(id).isPresent())
            return repository.findById(id).get();
        return null;
    }

    @Override
    public List<Owner> findAll() {
        return repository.findAll();
    }

    @Override
    public Owner save(Owner owner) {
        return repository.save(owner);
    }
}
