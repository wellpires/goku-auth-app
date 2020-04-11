package com.goku.auth.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.goku.auth.dto.UsuarioDTO;
import com.goku.auth.service.UsuarioService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		UsuarioDTO usuarioDTO = usuarioService.buscarUsuario(username);

		return new User(usuarioDTO.getLogin(), usuarioDTO.getSenha(), new ArrayList<>());
	}

}
