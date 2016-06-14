package br.com.web.model.client;

import java.util.List;

public class AddressEventResponseList {

	private List<AddressEvent> addressEvents;
	private Message message;

	public List<AddressEvent> getAddressEvents() {
		return addressEvents;
	}

	public void setAddressEvents(List<AddressEvent> addressEvents) {
		this.addressEvents = addressEvents;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}