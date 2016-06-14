package br.com.web.restclient;

public enum UriApi {

	USER_CREATE("invviteme/user"),
	USER_UPDATE("invviteme/user"),
	USER_FIND_USER_BY_ID("invviteme/user/{id}"),
	USER_FIND_ALL_USER("invviteme/user/users"),
	
	EVENT_CREATE("invviteme/event"),
	EVENT_UPDATE("invviteme/event"),
	EVENT_FIND_EVENT_BY_ID("invviteme/event/{id}"),
	EVENT_FIND_ALL_EVENT("invviteme/event//{id}"),
	
	ADDRESS_EVENT_FIND_BY_ID("/invviteme/address/{id}")
	;
	
	private String url;
	
	private UriApi(String url) {
		this.url = url;
	}
	
	public String getUrl() {
		return url;
	}
}