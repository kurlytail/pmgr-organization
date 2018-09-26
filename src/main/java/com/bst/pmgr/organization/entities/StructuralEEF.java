package com.bst.pmgr.organization.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.bst.pmgr.entities.Section;

@Entity
public class StructuralEEF extends Section {
	
    @OneToMany(mappedBy = "enterpriseEnvironmentalFactors")
    private List<Division> divisions;
    
	public List<Division> getDivisions() {
		return divisions;
	}

	public void setDivisions(List<Division> divisions) {
		this.divisions = divisions;
	}
	
	@OneToMany(mappedBy = "organization")
	private List<FunctionalStrength> functionalStrengths;
	
	@OneToMany(mappedBy = "organization")
	private List<FunctionalStrength> legalJurisdictions;
	
	@OneToMany(mappedBy = "organization")
	private List<FunctionalStrength> physicalLocations;

}
