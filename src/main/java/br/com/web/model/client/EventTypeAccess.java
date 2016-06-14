package br.com.web.model.client;


public class EventTypeAccess {
	
	private String typeAccess;
	
    private Message message;
	
	public EventTypeAccess() {}

	public String getTypeAccess() {
		return typeAccess;
	}

	public void setTypeAccess(String typeAccess) {
		this.typeAccess = typeAccess;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}