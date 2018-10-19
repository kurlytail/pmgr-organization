package com.bst.pmgr.organization.entities;

import javax.persistence.Entity;

import com.bst.pmgr.entities.Section;

@Entity
public class OrganizationalSection extends Section {

	public Organization getOrganization() {
		return this.getDocument() != null ? ((OrganizationalDocument) this.getDocument()).getOrganization()
				: ((OrganizationalSection) this.getParentSection()).getOrganization();
	}

}
