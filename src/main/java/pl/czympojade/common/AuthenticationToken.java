package pl.czympojade.common;

import java.time.LocalDateTime;


public class AuthenticationToken {

	private final String accessToken;
	private final String refreshToken;
	private final LocalDateTime validUntil;

	public AuthenticationToken(String accessToken, String refreshToken, LocalDateTime validUntil) {


		this.accessToken = accessToken;
		this.refreshToken = refreshToken;
		this.validUntil = validUntil;
	}

	public String getAccessToken() {

		return accessToken;
	}

	public String getRefreshToken() {

		return refreshToken;
	}

	public LocalDateTime getValidUntil() {

		return validUntil;
	}

}
