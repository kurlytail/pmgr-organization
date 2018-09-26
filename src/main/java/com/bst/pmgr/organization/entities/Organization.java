package com.bst.pmgr.organization.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Organization {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

	public Long getId() {
		return id;
	}
	
	private String misson;
	private String name;
	private String description;
	
	public String getMisson() {
		return misson;
	}

	public void setMisson(String misson) {
		this.misson = misson;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(mappedBy = "organization")
	private List<KeyAttribute> keyAttributes;

	public List<KeyAttribute> getKeyAttributes() {
		return keyAttributes;
	}

	public void setKeyAttributes(List<KeyAttribute> keyAttributes) {
		this.keyAttributes = keyAttributes;
	}
	
	@OneToOne
	private EnterpriseEnvironmentalFactors enterpriseEnvironmentalFactors;

	public EnterpriseEnvironmentalFactors getEnterpriseEnvironmentalFactors() {
		return enterpriseEnvironmentalFactors;
	}

	public void setEnterpriseEnvironmentalFactors(EnterpriseEnvironmentalFactors enterpriseEnvironmentalFactors) {
		this.enterpriseEnvironmentalFactors = enterpriseEnvironmentalFactors;
	}
	
}
