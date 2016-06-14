package br.com.web.model.client;


public class UserGuestUnified {

    private Users user;
    
    private Event event;

    private Integer amount;

    private Message message;
    
    public UserGuestUnified(){}
	    
	public Users getUser() {
        return user;
    }

    public Event getEvent() {
        return event;
    }

    public Integer getAmount() {
        return amount;
    }
	
	public void setMessage(Message message) {
		this.message = message;
	}
	
	public Message getMessage() {
		return message;
	}

}
