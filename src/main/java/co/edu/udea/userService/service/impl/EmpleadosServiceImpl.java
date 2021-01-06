package co.edu.udea.userService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.udea.userService.domain.Empleados;
import co.edu.udea.userService.repository.EmpleadosRepository;
import co.edu.udea.userService.service.EmpleadosService;

@Service
public class EmpleadosServiceImpl implements EmpleadosService {

	@Autowired 
	EmpleadosRepository repo;
	
	@Override
	public List<Empleados> list() {
		return repo.findAll();
	}

	@Override
	public void save(Empleados employee) {
		repo.save(employee);
	}

	@Override
	public void update(Empleados employee) {
		repo.save(employee);
	}

	@Override
	public void deleteById(Long id) {
		repo.deleteById(id);
		
	}
	
}
