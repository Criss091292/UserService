package co.edu.udea.userService.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.udea.userService.domain.TipoDocumento;
import co.edu.udea.userService.repository.TipoDocumentoRepository;
import co.edu.udea.userService.service.TipoDocumentoService;

@Service
public class TipoDocumentoServiceImpl implements TipoDocumentoService{

	@Autowired 
	TipoDocumentoRepository repo;
	
	@Override
	public List<TipoDocumento> list() {
		return repo.findAll();
	}

	@Override
	public void save(TipoDocumento tipoDocumento) {
		repo.save(tipoDocumento);
	}

	@Override
	public void update(TipoDocumento tipoDocumento) {
		repo.save(tipoDocumento);
	}

	@Override
	public void deleteById(Long id) {
		repo.deleteById(id);
		
	}

}
