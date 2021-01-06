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

import co.edu.udea.userService.domain.Usuarios;
import co.edu.udea.userService.service.UsuariosService;

@RestController
@RequestMapping(value="/usuarios")

public class UserRestController {
	@Autowired
	UsuariosService service;
	
	@GetMapping
	public List<Usuarios> list(){
		return service.list();
	}
	
	@PostMapping
	public void save(@RequestBody Usuarios user) {
		service.save(user);
	}
	
	@PutMapping
	public void update(@RequestBody Usuarios user) {
		service.save(user);
	}
	
	@DeleteMapping("/{id}")
	  void deleteById(@PathVariable Long id) {
	    service.deleteById(id);
	  }
}
