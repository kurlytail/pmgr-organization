package com.bst.pmgr.organization.dto;

public class OrganizationDTO {
	private String description;
	private Long id;
	private String mission;
	private String name;

	public String getDescription() {
		return this.description;
	}

	public Long getId() {
		return this.id;
	}

	public String getMission() {
		return this.mission;
	}

	public String getName() {
		return this.name;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public void setMission(final String mission) {
		this.mission = mission;
	}

	public void setName(final String name) {
		this.name = name;
	}

}
