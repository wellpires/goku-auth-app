package com.goku.auth.builder;

import com.goku.auth.response.TokenResponse;

public class TokenResponseBuilder {

	private String token;

	public TokenResponseBuilder token(String token) {
		this.token = token;
		return this;
	}

	public TokenResponse build() {
		TokenResponse tokenResponse = new TokenResponse();
		tokenResponse.setToken(token);
		return tokenResponse;
	}

}
