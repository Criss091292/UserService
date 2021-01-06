package co.edu.udea.userService.service;

import java.util.List;

import co.edu.udea.userService.domain.Empleados;

public interface EmpleadosService {
	public List<Empleados> list();
	public void save(Empleados user);
	public void update(Empleados user);
	public void deleteById(Long id);

}
