package com.bst.pmgr.organization.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.bst.pmgr.entities.Section;

@Entity
public class KeyAttribute extends Section {

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	@ManyToOne
    private Organization organization;
}
