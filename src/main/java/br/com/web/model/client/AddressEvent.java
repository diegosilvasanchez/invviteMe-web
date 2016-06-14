package br.com.web.model.client;

public class AddressEvent {
	
	private String placeName;

	private String streetName;

	private Integer number;

	private String complement;

	private String zipCode;

	private String cityName;

	private Long longitude;

	private Long latitude;

	private State state;

    private Message message;
	
	public AddressEvent() {
	}

	public String getPlaceName() {
		return placeName;
	}

	public String getStreetName() {
		return streetName;
	}

	public Integer getNumber() {
		return number;
	}

	public String getComplement() {
		return complement;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getCityName() {
		return cityName;
	}

	public Long getLongitude() {
		return longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public State getState() {
		return state;
	}
	
	public void setMessage(Message message) {
		this.message = message;
	}
	
	public Message getMessage() {
		return message;
	}
}