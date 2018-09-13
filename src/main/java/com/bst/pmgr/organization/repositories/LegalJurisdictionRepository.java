package com.bst.pmgr.organization.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.organization.entities.LegalJurisdiction;

@RepositoryRestResource
public interface LegalJurisdictionRepository extends CrudRepository<LegalJurisdiction, Long>{

}
