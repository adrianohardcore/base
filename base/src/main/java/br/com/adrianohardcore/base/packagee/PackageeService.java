package br.com.adrianohardcore.base.packagee;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adrianohardcore.base.exception.GenericException;
import br.com.adrianohardcore.base.exception.SecurityException;
import br.com.adrianohardcore.base.security.CurrentUser;
import br.com.adrianohardcore.base.user.UserEntity;
import br.com.adrianohardcore.base.user.UserRepository;
import br.com.adrianohardcore.base.utils.GenericService;
import br.com.adrianohardcore.base.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PACKAGEE_PATH)
public class PackageeService extends GenericService<PackageeEntity, Long> {

	@Autowired
	private CurrentUser currentUser;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PackageeRepository packageRepository;

	@Override
	public List<PackageeEntity> findAll() {
		UserEntity user = this.userRepository.findByEmail(currentUser.getActiveUser().getEmail());

		return this.packageRepository.findByUser(user);
	}

	@Override
	public PackageeEntity insert(@RequestBody PackageeEntity packagee) {
		packagee.setUser(this.userRepository.findByEmail(currentUser.getActiveUser().getEmail()));
		packagee.setRegisterDate(new Date());

		return super.insert(packagee);
	}

	@Override
	public void update(@RequestBody PackageeEntity packagee) {
		validateUserRequest(packagee);

		packagee.setRegisterDate(new Date());

		super.update(packagee);
	}

	@Override
	public void delete(@RequestBody PackageeEntity packagee) {
		validateUserRequest(packagee);

		super.delete(packagee);
	}

	private UserEntity validateUserRequest(PackageeEntity packagee) {
		UserEntity user = this.userRepository.findByEmail(currentUser.getActiveUser().getEmail());

		if (packagee.getUser().getEmail().compareToIgnoreCase(user.getEmail()) != 0) {
			throw new SecurityException();
		}

		return user;
	}

}
