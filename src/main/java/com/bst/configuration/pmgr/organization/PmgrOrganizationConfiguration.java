package com.bst.configuration.pmgr.organization;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.bst.pmgr")
@EntityScan("com.bst.pmgr.organization.entities")
@EnableJpaRepositories("com.bst.pmgr.organization.repositories")
public class PmgrOrganizationConfiguration {

}
