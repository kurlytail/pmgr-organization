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
	private String description;

	@OneToOne
	private EnterpriseEnvironmentalFactors enterpriseEnvironmentalFactors;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@OneToMany(mappedBy = "organization")
	private List<KeyAttribute> keyAttributes;
	private String misson;

	private String name;

	public String getDescription() {
		return this.description;
	}

	public EnterpriseEnvironmentalFactors getEnterpriseEnvironmentalFactors() {
		return this.enterpriseEnvironmentalFactors;
	}

	public Long getId() {
		return this.id;
	}

	public List<KeyAttribute> getKeyAttributes() {
		return this.keyAttributes;
	}

	public String getMisson() {
		return this.misson;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public void setEnterpriseEnvironmentalFactors(final EnterpriseEnvironmentalFactors enterpriseEnvironmentalFactors) {
		this.enterpriseEnvironmentalFactors = enterpriseEnvironmentalFactors;
	}

	public void setKeyAttributes(final List<KeyAttribute> keyAttributes) {
		this.keyAttributes = keyAttributes;
	}

	public void setMisson(final String misson) {
		this.misson = misson;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
