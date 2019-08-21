package pl.czympojade.common.Commands;

import pl.czympojade.common.Jsonable;

public class AuthenticationCommand implements Jsonable {

	private String login;
	private String password;
	private String provider;

	public AuthenticationCommand() {}

	public AuthenticationCommand(String login, String password, String provider) {

		this.login = login;
		this.password = password;
		this.provider = provider;
	}

	public String getLogin() {

		return login;
	}

	public void setLogin(String login) {

		this.login = login;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public String getProvider() {

		return provider;
	}

	public void setProvider(String provider) {

		this.provider = provider;
	}
}
