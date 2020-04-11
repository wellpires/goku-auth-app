package com.goku.auth.controller.resource;

import org.springframework.http.ResponseEntity;

import com.goku.auth.dto.CredenciaisDTO;
import com.goku.auth.response.TokenResponse;

public interface AuthenticationResource {

	ResponseEntity<TokenResponse> autenticar(CredenciaisDTO credenciasDTO);

}
