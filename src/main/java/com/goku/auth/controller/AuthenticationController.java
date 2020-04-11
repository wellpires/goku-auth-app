package com.goku.auth.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.goku.auth.controller.resource.AuthenticationResource;
import com.goku.auth.response.TokenResponse;

@RestController
@RequestMapping("api/v1/autenticar")
public class AuthenticationController implements AuthenticationResource {

	@Override
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TokenResponse> autenticar(@RequestParam("login") String login,
			@RequestParam("senha") String senha) {
		System.out.println("Usuario: ".concat(login));
		System.out.println("Senha: ".concat(senha));

		return null;
	}

}
