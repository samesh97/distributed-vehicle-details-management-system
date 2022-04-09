package com.samesh.vdm.ownermanager.service;

import owner.Owner;

import java.util.List;

public interface OwnerService {
    Owner findOne(int id);
    List<Owner> findAll();
    Owner save(Owner owner);
}
