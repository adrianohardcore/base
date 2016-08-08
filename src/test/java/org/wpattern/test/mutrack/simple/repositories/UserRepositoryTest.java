package org.wpattern.test.mutrack.simple.repositories;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.wpattern.test.mutrack.simple.utils.AbstractTest;

import br.com.adrianohardcore.base.user.UserEntity;
import br.com.adrianohardcore.base.user.UserRepository;
import br.com.adrianohardcore.base.user.UserService;

public class UserRepositoryTest extends AbstractTest {

	private static final Logger LOGGER = Logger.getLogger(UserRepositoryTest.class);

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;	
	
	@Autowired
	private UserService userService;

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
	
	@Test
	public void save(){
		UserEntity usuario = new UserEntity();
		usuario.setName("Teste");
		usuario.setEmail("teste@teste.com");
		usuario.setPassword(this.passwordEncoder.encode("123"));
		
		LOGGER.info("Salvando usuário de teste");
		
		userService.update(usuario);
		//userRepository.save(usuario);
	}

}
