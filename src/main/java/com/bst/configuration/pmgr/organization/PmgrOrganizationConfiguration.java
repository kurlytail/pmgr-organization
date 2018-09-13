package com.bst.configuration.pmgr.organization;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.bst.pmgr.organization.entities")
@EnableJpaRepositories("com.bst.pmgr.organization.repositories")
public class PmgrOrganizationConfiguration {

}
