package co.edu.udea.userService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.udea.userService.domain.Usuarios;
import co.edu.udea.userService.repository.UsuariosRepository;
import co.edu.udea.userService.service.UsuariosService;

@Service
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired 
	UsuariosRepository repo;
	
	@Override
	public List<Usuarios> list() {
		return repo.findAll();
	}

	@Override
	public void save(Usuarios user) {
		repo.save(user);
	}

	@Override
	public void update(Usuarios user) {
		repo.save(user);
	}

	@Override
	public void deleteById(Long id) {
		repo.deleteById(id);
		
	}
	
}
