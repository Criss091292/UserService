package co.edu.udea.userService.service;

import java.util.List;

import co.edu.udea.userService.domain.Usuarios;


public interface UsuariosService {
	public List<Usuarios> list();
	public void save(Usuarios user);
	public void update(Usuarios user);
	public void deleteById(Long id);
}
