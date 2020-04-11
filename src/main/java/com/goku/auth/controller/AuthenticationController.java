package com.goku.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goku.auth.builder.TokenResponseBuilder;
import com.goku.auth.controller.resource.AuthenticationResource;
import com.goku.auth.dto.CredenciaisDTO;
import com.goku.auth.response.TokenResponse;
import com.goku.auth.service.AuthenticationService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/autenticar")
public class AuthenticationController implements AuthenticationResource {

	@Autowired
	private AuthenticationService authenticationService;

	@Override
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TokenResponse> autenticar(@RequestBody CredenciaisDTO credenciasDTO) {

		String token = authenticationService.autenticar(credenciasDTO);

		return ResponseEntity.ok(new TokenResponseBuilder().token(token).build());
	}

}
