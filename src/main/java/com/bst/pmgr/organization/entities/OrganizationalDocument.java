package com.bst.pmgr.organization.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.bst.pmgr.entities.Document;

@Entity
public class OrganizationalDocument extends Document {
	
	@ManyToOne
    private Organization organization;

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
}
