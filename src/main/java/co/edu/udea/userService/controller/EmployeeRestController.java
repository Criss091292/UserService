package co.edu.udea.userService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.udea.userService.domain.Empleados;
import co.edu.udea.userService.service.EmpleadosService;

@RestController
@RequestMapping(value="/employees")

public class EmployeeRestController {
	@Autowired
	EmpleadosService service;
	
	@GetMapping
	public List<Empleados> list(){
		return service.list();
	}
	
	@PostMapping
	public void save(@RequestBody Empleados employee) {
		service.save(employee);
	}
	
	@PutMapping
	public void update(@RequestBody Empleados employee) {
		service.save(employee);
	}
	
	@DeleteMapping("/{id}")
	  void deleteById(@PathVariable Long id) {
	    service.deleteById(id);
	  }
}
