package com.bst.pmgr.organization.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.bst.pmgr.entities.Section;

@Entity
public class KeyAttribute extends Section {

	@ManyToOne
	private Organization organization;

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(final Organization organization) {
		this.organization = organization;
	}
}
