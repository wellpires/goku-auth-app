package com.goku.auth.service;

import com.goku.auth.dto.UsuarioDTO;

public interface UsuarioService {

	UsuarioDTO buscarUsuario(String username);

}
