package br.com.web.model.client;

import java.util.List;

public class SocialTypeResponseList {

	private List<SocialType> socialTypes;
	private Message message;

	public List<SocialType> getSocialTypes() {
		return socialTypes;
	}

	public void setSocialTypes(List<SocialType> socialTypes) {
		this.socialTypes = socialTypes;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}