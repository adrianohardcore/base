package org.wpattern.test.mutrack.simple.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.test.mutrack.simple.utils.AbstractTest;

import br.com.adrianohardcore.base.userpermission.UserPermissionEntity;
import br.com.adrianohardcore.base.userpermission.UserPermissionRepository;

public class UserPermissionRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(UserPermissionRepositoryTest.class);

	@Autowired
	private UserPermissionRepository userPermissionRepository;

	@Test
	public void findAllTest() {
		List<UserPermissionEntity> userPermissions = this.userPermissionRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + userPermissions);
		}
	}

}
