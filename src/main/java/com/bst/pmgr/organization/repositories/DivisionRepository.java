package com.bst.pmgr.organization.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bst.pmgr.organization.entities.Division;

@RepositoryRestResource
public interface DivisionRepository extends CrudRepository<Division, Long> {

}
