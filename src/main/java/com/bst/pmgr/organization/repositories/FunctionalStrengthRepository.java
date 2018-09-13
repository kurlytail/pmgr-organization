package com.bst.pmgr.organization.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.organization.entities.FunctionalStrength;

@RepositoryRestResource
public interface FunctionalStrengthRepository extends CrudRepository<FunctionalStrength, Long>{

}
