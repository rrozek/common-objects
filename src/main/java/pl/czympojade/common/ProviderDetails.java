package pl.czympojade.common;

public class ProviderDetails implements Jsonable {

	private final String name;
	private final String logo;
	private final String appLink_android;
	private final String appLink_ios;
	private final Boolean credentialsEmailRequired;
	private final Boolean credentialsPhoneRequired;
	// todo: add list of ProviderDetails_Vehicle with provided vehicles including following:
	// public class ProviderDetails_Vehicle {
	// private final String model;
	// private final String imgUrl;
	// private final VehicleType vehicleType;

	public ProviderDetails(String name,
		String logo,
		String appLink_android,
		String appLink_ios,
		Boolean credentialsEmailRequired,
		Boolean credentialsPhoneRequired) {

		this.name = name;
		this.logo = logo;
		this.appLink_android = appLink_android;
		this.appLink_ios = appLink_ios;
		this.credentialsEmailRequired = credentialsEmailRequired;
		this.credentialsPhoneRequired = credentialsPhoneRequired;
	}

	public String getName() {

		return name;
	}

	public String getLogo() {

		return logo;
	}

	public String getAppLink_android() {

		return appLink_android;
	}

	public String getAppLink_ios() {

		return appLink_ios;
	}

	public Boolean getCredentialsEmailRequired() {

		return credentialsEmailRequired;
	}

	public Boolean getCredentialsPhoneRequired() {

		return credentialsPhoneRequired;
	}
}
