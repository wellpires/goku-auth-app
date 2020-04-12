package com.goku.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.goku.auth.dto.CredenciaisDTO;
import com.goku.auth.service.AuthenticationService;
import com.goku.auth.service.UsuarioService;
import com.goku.auth.util.JwtTokenUtil;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserDetailsService userDetailService;

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public String autenticar(CredenciaisDTO credenciasDTO) {

		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(credenciasDTO.getLogin(), credenciasDTO.getSenha()));

		UserDetails userDetails = userDetailService.loadUserByUsername(credenciasDTO.getLogin());
		return jwtTokenUtil.generateToken(userDetails, usuarioService.buscarPermissao(credenciasDTO.getLogin()));

	}

}
