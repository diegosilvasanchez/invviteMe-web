package br.com.web.model.client;


public class SocialType {
	
	private String name;

    private Message message;

	public SocialType(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}
