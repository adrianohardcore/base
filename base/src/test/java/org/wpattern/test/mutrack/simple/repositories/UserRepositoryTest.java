package org.wpattern.test.mutrack.simple.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.wpattern.test.mutrack.simple.utils.AbstractTest;

import br.com.adrianohardcore.base.user.UserEntity;
import br.com.adrianohardcore.base.user.UserRepository;

public class UserRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(UserRepositoryTest.class);

	@Autowired
	private UserRepository userRepository;

	@Test
	public void findAllTest() {
		List<UserEntity> users = this.userRepository.findAll();

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + users);
		}
	}

	@Test
	public void find() {
		List<UserEntity> users = this.userRepository.findByEmailOrName("", "");

		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("Test FindAll(): " + users);
		}
	}

}
