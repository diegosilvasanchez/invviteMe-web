package br.com.web.model.client;

import java.util.List;

public class EventTypeResponseList {

	private List<EventType> eventTypes;
	private Message message;

	public List<EventType> getEventTypes() {
		return eventTypes;
	}

	public void setEventTypes(List<EventType> eventTypes) {
		this.eventTypes = eventTypes;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}