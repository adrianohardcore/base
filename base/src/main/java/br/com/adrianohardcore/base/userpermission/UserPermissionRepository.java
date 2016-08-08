package br.com.adrianohardcore.base.userpermission;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPermissionRepository extends JpaRepository<UserPermissionEntity, UserPermissionKey> {

}
