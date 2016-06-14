package br.com.web.model.client;

import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

public class GuestEvent {

	private Event event;

	private Users user;

	private Boolean attendanceConfirmed;

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime timeSentToken;

	private String token;

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime dateAttendanceConfirmed;

	private Message message;

	public GuestEvent() {
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Boolean getAttendanceConfirmed() {
		return attendanceConfirmed;
	}

	public void setAttendanceConfirmed(Boolean attendanceConfirmed) {
		this.attendanceConfirmed = attendanceConfirmed;
	}

	public LocalDateTime getTimeSentToken() {
		return timeSentToken;
	}

	public void setTimeSentToken(LocalDateTime timeSentToken) {
		this.timeSentToken = timeSentToken;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public LocalDateTime getDateAttendanceConfirmed() {
		return dateAttendanceConfirmed;
	}

	public void setDateAttendanceConfirmed(LocalDateTime dateAttendanceConfirmed) {
		this.dateAttendanceConfirmed = dateAttendanceConfirmed;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}
