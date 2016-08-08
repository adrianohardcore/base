package br.com.adrianohardcore.base.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import br.com.adrianohardcore.base.user.UserEntity;
import br.com.adrianohardcore.base.user.UserRepository;

@Component
public class CurrentUser {
	
	@Autowired
	UserRepository userRepository;

	public LoginDetailBean getActiveUser() {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (principal == null) {
			return null;
		}

		return (LoginDetailBean)principal;
	}
	
	public Long getUsuarioAtual(){		
		return userRepository.findByEmail(getActiveUser().getEmail()).getId();		
	}

}
