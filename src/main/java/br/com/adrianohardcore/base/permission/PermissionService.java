package br.com.adrianohardcore.base.permission;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adrianohardcore.base.utils.GenericService;
import br.com.adrianohardcore.base.utils.ServicePath;

@RestController
@RequestMapping(path = ServicePath.PERMISSION_PATH)
public class PermissionService extends GenericService<PermissionEntity, Long> {

}
