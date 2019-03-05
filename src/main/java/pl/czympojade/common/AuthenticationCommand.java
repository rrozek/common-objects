package pl.czympojade.common;

public class AuthenticationCommand {

	private String login;
	private String password;
	private Provider provider;

	public AuthenticationCommand() {}

	public AuthenticationCommand(String login, String password, String provider) {

		this.login = login;
		this.password = password;
		this.provider = Provider.valueOf(provider);
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

	public Provider getProvider() {

		return provider;
	}

	public void setProvider(Provider provider) {

		this.provider = provider;
	}
}
