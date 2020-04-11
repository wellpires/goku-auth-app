package com.goku.auth.exception;

public class UsuarioNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -4906080809604190309L;

	public UsuarioNotFoundException() {
		super("Usuário não foi encontrado!");
	}

}
