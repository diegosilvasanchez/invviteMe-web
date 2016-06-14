package br.com.web.model.client;

import java.util.List;

public class UserResponseList {

	private List<Users> users;
	private Message message;

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public Message getMessage() {
		return message;
	}
}