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

import co.edu.udea.userService.domain.TipoDocumento;
import co.edu.udea.userService.service.TipoDocumentoService;

@RestController
@RequestMapping(value="/tipodocumentos")

public class TipoDocumentoRestController {
	@Autowired
	TipoDocumentoService service;
	
	@GetMapping
	public List<TipoDocumento> list(){
		return service.list();
	}
	
	@PostMapping
	public void save(@RequestBody TipoDocumento tipoDocumento) {
		service.save(tipoDocumento);
	}
	
	@PutMapping
	public void update(@RequestBody TipoDocumento tipoDocumento) {
		service.save(tipoDocumento);
	}
	
	@DeleteMapping("/{id}")
	  void deleteById(@PathVariable Long id) {
	    service.deleteById(id);
	  }
}
