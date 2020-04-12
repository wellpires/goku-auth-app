package com.goku.auth.builder;

import com.goku.auth.dto.UsuarioDTO;

public class UsuarioDTOBuilder {

	private String login;
	private String senha;
	private String permissao;

	public UsuarioDTOBuilder login(String login) {
		this.login = login;
		return this;
	}

	public UsuarioDTOBuilder senha(String senha) {
		this.senha = senha;
		return this;
	}

	public UsuarioDTOBuilder permissao(String permissao) {
		this.permissao = permissao;
		return this;
	}

	public UsuarioDTO build() {
		UsuarioDTO usuarioDTO = new UsuarioDTO();
		usuarioDTO.setLogin(login);
		usuarioDTO.setSenha(senha);
		usuarioDTO.setPermissao(permissao);
		return usuarioDTO;
	}

}
