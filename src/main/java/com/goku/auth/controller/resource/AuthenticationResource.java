package com.goku.auth.controller.resource;

import org.springframework.http.ResponseEntity;

import com.goku.auth.response.TokenResponse;

public interface AuthenticationResource {

	ResponseEntity<TokenResponse> autenticar(String login, String senha);

}
