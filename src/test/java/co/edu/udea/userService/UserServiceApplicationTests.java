package co.edu.udea.userService;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import co.edu.udea.userService.domain.Usuarios;
import co.edu.udea.userService.service.UsuariosService;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	UsuariosService user;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	@Test
	//void contextLoads() {
	public void crearUsuarioTest() {
		Usuarios us = new Usuarios();
		us.setId(2L);
		us.setUsername("administrador");
		us.setPassword(encoder.encode("admin"));
		Usuarios retorno = user.save(us);
		assertTrue(retorno.getPassword().equals(us.getPassword()));
	}
	
	

}
