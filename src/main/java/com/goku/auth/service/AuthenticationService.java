package com.goku.auth.service;

import com.goku.auth.dto.CredenciaisDTO;

public interface AuthenticationService {

	String autenticar(CredenciaisDTO credenciasDTO);

}
