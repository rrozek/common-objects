package pl.czympojade.common.Commands;


import pl.czympojade.common.Jsonable;

public class AuthenticationToken implements Jsonable {

	private final String accessToken;
	private final String refreshToken;
	private final Long validUntil;

	public AuthenticationToken(String accessToken, String refreshToken, Long validUntil) {


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

	public Long getValidUntil() {

		return validUntil;
	}

}
