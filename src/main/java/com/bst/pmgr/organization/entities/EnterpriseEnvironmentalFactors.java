package com.bst.pmgr.organization.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.bst.pmgr.entities.Document;

@Entity
public class EnterpriseEnvironmentalFactors extends Document {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    @OneToMany(mappedBy = "enterpriseEnvironmentalFactors")
    private List<Division> divisions;

	public Long getId() {
		return id;
	}
	
}
