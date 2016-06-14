package br.com.web.model.client;

import java.util.List;

public class StatusTypeResponseList {

	private List<StatusType> statusTypes;
	private Message message;

	public List<StatusType> getStatusTypes() {
		return statusTypes;
	}

	public void setStatusTypes(List<StatusType> statusTypes) {
		this.statusTypes = statusTypes;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}