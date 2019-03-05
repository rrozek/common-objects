package pl.czympojade.common;

public class AuthenticationTokenResponse {

	private final String message;
	private final AuthenticationToken authentication;

	private AuthenticationTokenResponse(String message, AuthenticationToken authentication) {

		this.message = message;
		this.authentication = authentication;
	}

	public String getMessage() {

		return message;
	}

	public AuthenticationToken getAuthentication() {

		return authentication;
	}

	public static AuthenticationTokenResponse ok(AuthenticationToken authentication) {

		return new AuthenticationTokenResponse("", authentication);
	}

	public static AuthenticationTokenResponse failed(String message) {

		return new AuthenticationTokenResponse(message, null);
	}
}
