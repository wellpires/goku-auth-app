package com.goku.auth.controller.resource;

import org.springframework.http.ResponseEntity;

import com.goku.auth.dto.CredenciaisDTO;
import com.goku.auth.response.ErrorResponse;
import com.goku.auth.response.TokenResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(value = "Serviço que autentica e gera tokens")
public interface AuthenticationResource {

	@ApiOperation(value = "Cria um novo endereço")
	@ApiResponses(value = { @ApiResponse(code = 401, message = "Unauthorized"),
			@ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
			@ApiResponse(code = 500, message = "Internal Server Error", response = ErrorResponse.class) })
	ResponseEntity<TokenResponse> autenticar(CredenciaisDTO credenciasDTO);

}
