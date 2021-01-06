package co.edu.udea.userService.service;

import java.util.List;

import co.edu.udea.userService.domain.TipoDocumento;

public interface TipoDocumentoService {
		public List<TipoDocumento> list();
		public void save(TipoDocumento tipoDocumento);
		public void update(TipoDocumento tipoDocumento);
		public void deleteById(Long id);
	
}
