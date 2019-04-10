package pl.czympojade.common;

public class ReservationCommand {

	private String vehicleId;
	private String provider;
	private String token;

	public ReservationCommand() {}

	public ReservationCommand(String vehicleId, String provider, String token) {

		this.vehicleId = vehicleId;
		this.provider = provider;
		this.token = token;
	}

	public String getVehicleId() {

		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {

		this.vehicleId = vehicleId;
	}

	public String getProvider() {

		return provider;
	}

	public void setProvider(String provider) {

		this.provider = provider;
	}

	public String getToken() {

		return token;
	}

	public void setToken(String token) {

		this.token = token;
	}

	@Override
	public String toString() {

		return "ReservationCommand{" +
			"vehicleId='" + vehicleId + '\'' +
			", provider=" + provider +
			", token='" + token + '\'' +
			'}';
	}
}
