package pl.czympojade.common;

public class ReservationResponse implements Jsonable {

	private String vehicleId;
	private String provider;
	private String reservationId;
	private Long dateTimeTo;

	public ReservationResponse() {}

	public ReservationResponse(String vehicleId, String provider, String reservationId, Long dateTimeTo) {

		this.vehicleId = vehicleId;
		this.provider = provider;
		this.reservationId = reservationId;
		this.dateTimeTo = dateTimeTo;
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

	public String getReservationId() {

		return reservationId;
	}

	public void setReservationId(String reservationId) {

		this.reservationId = reservationId;
	}

	public Long getDateTimeTo() {

		return dateTimeTo;
	}

	public void setDateTimeTo(Long dateTimeTo) {

		this.dateTimeTo = dateTimeTo;
	}

	@Override
	public String toString() {

		return "ReservationResponse{" +
			"vehicleId='" + vehicleId + '\'' +
			", provider='" + provider + '\'' +
			", reservationId='" + reservationId + '\'' +
			", dateTimeTo=" + dateTimeTo +
			'}';
	}
}
