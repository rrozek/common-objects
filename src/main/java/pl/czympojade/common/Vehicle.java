package pl.czympojade.common;

public class Vehicle {

	private final Provider provider;
	private final String externalId;
	private final String vehicleModel;
	private final Double longitude;
	private final Double latitude;
	private final String plateNumber;
	private final String sideNumber;
	private final VehicleType vehicleType;
	private final Double range;
	private final AvailabilityStatus availabilityStatus;

	public Vehicle(Provider provider,
		String externalId,
		String vehicleModel,
		Double longitude,
		Double latitude,
		String plateNumber,
		String sideNumber,
		VehicleType vehicleType,
		Double range,
		AvailabilityStatus availabilityStatus) {

		this.provider = provider;
		this.externalId = externalId;
		this.vehicleModel = vehicleModel;
		this.longitude = longitude;
		this.latitude = latitude;
		this.plateNumber = plateNumber;
		this.sideNumber = sideNumber;
		this.vehicleType = vehicleType;
		this.range = range;
		this.availabilityStatus = availabilityStatus;
	}

	public Provider getProvider() {

		return provider;
	}

	public String getExternalId() {

		return externalId;
	}

	public String getVehicleModel() {

		return vehicleModel;
	}

	public Double getLongitude() {

		return longitude;
	}

	public Double getLatitude() {

		return latitude;
	}

	public String getPlateNumber() {

		return plateNumber;
	}

	public String getSideNumber() {

		return sideNumber;
	}

	public VehicleType getVehicleType() {

		return vehicleType;
	}

	public Double getRange() {

		return range;
	}

	public AvailabilityStatus getAvailabilityStatus() {

		return availabilityStatus;
	}

}
