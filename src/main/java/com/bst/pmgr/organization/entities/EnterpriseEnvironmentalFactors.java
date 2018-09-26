package com.bst.pmgr.organization.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class EnterpriseEnvironmentalFactors extends OrganizationalDocument {
	
	@ManyToOne
    private Organization organization;

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
    
	private StructuralEEF structuralEEF;
	public StructuralEEF getStructuralEEF() {
		return structuralEEF;
	}
	public void setStructuralEEF(StructuralEEF structuralEEF) {
		this.structuralEEF = structuralEEF;
	}
}
