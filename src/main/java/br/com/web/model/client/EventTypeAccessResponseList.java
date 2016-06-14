package br.com.web.model.client;

import java.util.List;

public class EventTypeAccessResponseList {

	private List<EventTypeAccess> eventTypeAccesses;
	private Message message;

	public List<EventTypeAccess> getEventTypeAccesses() {
		return eventTypeAccesses;
	}

	public void setEventTypeAccesses(List<EventTypeAccess> eventTypeAccesses) {
		this.eventTypeAccesses = eventTypeAccesses;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}