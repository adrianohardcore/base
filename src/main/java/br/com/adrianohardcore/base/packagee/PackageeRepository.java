package br.com.adrianohardcore.base.packagee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.adrianohardcore.base.user.UserEntity;

public interface PackageeRepository extends JpaRepository<PackageeEntity, Long> {

	public List<PackageeEntity> findByUser(UserEntity user);

}
