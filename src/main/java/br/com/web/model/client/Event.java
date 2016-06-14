package br.com.web.model.client;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

public class Event {

	private Users owner;

	private EventTypeAccess eventTypeAccess;

	private EventType eventType;

	private String title;

	private String description;

	private String observation;

	private boolean eventForFree;

	private boolean hiddenEvent;

	private boolean canSendInviteExternal;

	private int minimumAge;

	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate eventDate;

	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime eventInitHour;
	
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime eventEndHour;

	private Integer limitGuests;

	private AddressEvent addressEvent;

	private StatusType statusType;
	
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	private LocalDateTime dateUpdated;

	private Message message;

	public Event() {
	}

	public Users getOwner() {
		return owner;
	}

	public void setOwner(Users owner) {
		this.owner = owner;
	}

	public EventTypeAccess getEventTypeAccess() {
		return eventTypeAccess;
	}

	public void setEventTypeAccess(EventTypeAccess eventTypeAccess) {
		this.eventTypeAccess = eventTypeAccess;
	}

	public EventType getEventType() {
		return eventType;
	}

	public void setEventType(EventType eventType) {
		this.eventType = eventType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getObservation() {
		return observation;
	}

	public void setObservation(String observation) {
		this.observation = observation;
	}

	public boolean isEventForFree() {
		return eventForFree;
	}

	public void setEventForFree(boolean eventForFree) {
		this.eventForFree = eventForFree;
	}

	public boolean isHiddenEvent() {
		return hiddenEvent;
	}

	public void setHiddenEvent(boolean hiddenEvent) {
		this.hiddenEvent = hiddenEvent;
	}

	public boolean isCanSendInviteExternal() {
		return canSendInviteExternal;
	}

	public void setCanSendInviteExternal(boolean canSendInviteExternal) {
		this.canSendInviteExternal = canSendInviteExternal;
	}

	public int getMinimumAge() {
		return minimumAge;
	}

	public void setMinimumAge(int minimumAge) {
		this.minimumAge = minimumAge;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public LocalDateTime getEventInitHour() {
		return eventInitHour;
	}

	public void setEventInitHour(LocalDateTime eventInitHour) {
		this.eventInitHour = eventInitHour;
	}

	public LocalDateTime getEventEndHour() {
		return eventEndHour;
	}

	public void setEventEndHour(LocalDateTime eventEndHour) {
		this.eventEndHour = eventEndHour;
	}

	public Integer getLimitGuests() {
		return limitGuests;
	}

	public void setLimitGuests(Integer limitGuests) {
		this.limitGuests = limitGuests;
	}

	public AddressEvent getAddressEvent() {
		return addressEvent;
	}

	public void setAddressEvent(AddressEvent addressEvent) {
		this.addressEvent = addressEvent;
	}

	public StatusType getStatusType() {
		return statusType;
	}

	public void setStatusType(StatusType statusType) {
		this.statusType = statusType;
	}

	public LocalDateTime getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
}
