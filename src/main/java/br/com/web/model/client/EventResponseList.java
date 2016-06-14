package br.com.web.model.client;

import java.util.List;

public class EventResponseList {

	private List<Event> events;
	private Message message;

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}