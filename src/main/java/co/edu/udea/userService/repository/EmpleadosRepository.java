package co.edu.udea.userService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.udea.userService.domain.Empleados;

@Repository
public interface EmpleadosRepository extends JpaRepository<Empleados, Long> {

}
