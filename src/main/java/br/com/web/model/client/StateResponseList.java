package br.com.web.model.client;

import java.util.List;

public class StateResponseList {

	private List<State> states;
	private Message message;

	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}