package br.com.web.model.client;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

public class UserSocialType {
    
 	private Users user;
    
 	private SocialType socialType;
	
	private Boolean status;
	
	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate dateUpdated;
	
    private Message message;
    
	public UserSocialType(){}	

	public Users getUser() {
		return user;
	}

	public SocialType getSocialType() {
		return socialType;
	}

	public void alterStatus(Boolean status) {
		this.status = status;
		this.dateUpdated = LocalDate.now();
	}
	
	public Boolean getStatus() {
		return status;
	}

	public LocalDate getDateUpdated() {
		return dateUpdated;
	}
	
	public void setMessage(Message message) {
		this.message = message;
	}
	
	public Message getMessage() {
		return message;
	}
}