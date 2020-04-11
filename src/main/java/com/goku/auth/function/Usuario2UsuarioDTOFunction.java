package com.goku.auth.function;

import java.util.function.Function;

import com.goku.auth.builder.UsuarioDTOBuilder;
import com.goku.auth.dto.UsuarioDTO;
import com.goku.auth.model.Usuario;

public class Usuario2UsuarioDTOFunction implements Function<Usuario, UsuarioDTO> {

	@Override
	public UsuarioDTO apply(Usuario usuario) {
		return new UsuarioDTOBuilder().login(usuario.getLogin()).senha(usuario.getSenha()).build();
	}


}
