package co.edu.udea.userService.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import co.edu.udea.userService.domain.Usuarios;
import co.edu.udea.userService.repository.UsuariosRepository;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	UsuariosRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuarios us = repo.findByUsername(username);
		
		List<GrantedAuthority> roles = new ArrayList<>();
		roles.add(new SimpleGrantedAuthority("ADMIN"));
		
		UserDetails userDet = new User(us.getUsername(),us.getPassword(), roles);
		
		return userDet;
	}

}
