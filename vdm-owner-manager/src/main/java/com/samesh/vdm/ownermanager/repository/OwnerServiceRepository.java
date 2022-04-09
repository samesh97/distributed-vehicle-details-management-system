package com.samesh.vdm.ownermanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import owner.Owner;

public interface OwnerServiceRepository extends JpaRepository<Owner, Integer> {
}
