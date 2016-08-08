package br.com.adrianohardcore.base.user;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adrianohardcore.base.security.CurrentUser;
import br.com.adrianohardcore.base.utils.GenericService;
import br.com.adrianohardcore.base.utils.ServicePath;
import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping(path = ServicePath.USER_PATH)
public class UserService extends GenericService<UserEntity, Long> {

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Autowired
	private CurrentUser currentUser;

	@Override
	public UserEntity insert(@RequestBody UserEntity user) {
		user.setPassword(this.passwordEncoder.encode(user.getPassword()));
		
		user.setDataAlteracao(new Date());
		user.setDataCriacao(new Date());		
		user.setIdUsuarioAlteracao(currentUser.getUsuarioAtual());
		user.setIdUsuarioCriacao(currentUser.getUsuarioAtual());
		
	
		return super.insert(user);
	}

	@Override
	public void update(@RequestBody UserEntity user) {
		user.setPassword(this.passwordEncoder.encode(user.getPassword()));		
		user.setDataAlteracao(new Date());			
		user.setIdUsuarioAlteracao(currentUser.getUsuarioAtual());
		
		super.update(user);
	}

}
