package com.goku.auth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.goku.auth.dto.UsuarioDTO;
import com.goku.auth.exception.UsuarioNotFoundException;
import com.goku.auth.function.Usuario2UsuarioDTOFunction;
import com.goku.auth.repository.UsuarioRepository;
import com.goku.auth.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UsuarioDTO buscarUsuario(String username) {
		return usuarioRepository.findById(username).map(new Usuario2UsuarioDTOFunction())
				.orElseThrow(UsuarioNotFoundException::new);
	}

	@Override
	public String buscarPermissao(String login) {
		return buscarUsuario(login).getPermissao();
	}

}
