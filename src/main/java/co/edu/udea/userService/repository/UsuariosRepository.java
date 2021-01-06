package co.edu.udea.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.udea.userService.domain.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {
	Usuarios findByUsername(String username);
}
