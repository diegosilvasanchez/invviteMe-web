//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2016.06.11 às 01:18:41 AM BRT 
//


package br.com.web.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de Event complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://invviteme.com/domain}Users" minOccurs="0"/>
 *         &lt;element name="eventTypeAccess" type="{http://invviteme.com/domain}EventTypeAccess" minOccurs="0"/>
 *         &lt;element name="eventType" type="{http://invviteme.com/domain}EventType" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventForFree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="hiddenEvent" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="canSendInviteExternal" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="minimumAge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="eventInitHour" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="eventEndHour" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="limitGuests" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="addressEvent" type="{http://invviteme.com/domain}AddressEvent" minOccurs="0"/>
 *         &lt;element name="statusType" type="{http://invviteme.com/domain}StatusType" minOccurs="0"/>
 *         &lt;element name="dateUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "id",
    "owner",
    "eventTypeAccess",
    "eventType",
    "title",
    "description",
    "observation",
    "eventForFree",
    "hiddenEvent",
    "canSendInviteExternal",
    "minimumAge",
    "eventDate",
    "eventInitHour",
    "eventEndHour",
    "limitGuests",
    "addressEvent",
    "statusType",
    "dateUpdated"
})
public class Event {

    protected Integer id;
    protected Users owner;
    protected EventTypeAccess eventTypeAccess;
    protected EventType eventType;
    protected String title;
    protected String description;
    protected String observation;
    protected boolean eventForFree;
    protected boolean hiddenEvent;
    protected boolean canSendInviteExternal;
    protected int minimumAge;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventInitHour;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventEndHour;
    protected Integer limitGuests;
    protected AddressEvent addressEvent;
    protected StatusType statusType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateUpdated;

    /**
     * Obtém o valor da propriedade id.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade owner.
     * 
     * @return
     *     possible object is
     *     {@link Users }
     *     
     */
    public Users getOwner() {
        return owner;
    }

    /**
     * Define o valor da propriedade owner.
     * 
     * @param value
     *     allowed object is
     *     {@link Users }
     *     
     */
    public void setOwner(Users value) {
        this.owner = value;
    }

    /**
     * Obtém o valor da propriedade eventTypeAccess.
     * 
     * @return
     *     possible object is
     *     {@link EventTypeAccess }
     *     
     */
    public EventTypeAccess getEventTypeAccess() {
        return eventTypeAccess;
    }

    /**
     * Define o valor da propriedade eventTypeAccess.
     * 
     * @param value
     *     allowed object is
     *     {@link EventTypeAccess }
     *     
     */
    public void setEventTypeAccess(EventTypeAccess value) {
        this.eventTypeAccess = value;
    }

    /**
     * Obtém o valor da propriedade eventType.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getEventType() {
        return eventType;
    }

    /**
     * Define o valor da propriedade eventType.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setEventType(EventType value) {
        this.eventType = value;
    }

    /**
     * Obtém o valor da propriedade title.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Define o valor da propriedade title.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Obtém o valor da propriedade description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define o valor da propriedade description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Obtém o valor da propriedade observation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservation() {
        return observation;
    }

    /**
     * Define o valor da propriedade observation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservation(String value) {
        this.observation = value;
    }

    /**
     * Obtém o valor da propriedade eventForFree.
     * 
     */
    public boolean isEventForFree() {
        return eventForFree;
    }

    /**
     * Define o valor da propriedade eventForFree.
     * 
     */
    public void setEventForFree(boolean value) {
        this.eventForFree = value;
    }

    /**
     * Obtém o valor da propriedade hiddenEvent.
     * 
     */
    public boolean isHiddenEvent() {
        return hiddenEvent;
    }

    /**
     * Define o valor da propriedade hiddenEvent.
     * 
     */
    public void setHiddenEvent(boolean value) {
        this.hiddenEvent = value;
    }

    /**
     * Obtém o valor da propriedade canSendInviteExternal.
     * 
     */
    public boolean isCanSendInviteExternal() {
        return canSendInviteExternal;
    }

    /**
     * Define o valor da propriedade canSendInviteExternal.
     * 
     */
    public void setCanSendInviteExternal(boolean value) {
        this.canSendInviteExternal = value;
    }

    /**
     * Obtém o valor da propriedade minimumAge.
     * 
     */
    public int getMinimumAge() {
        return minimumAge;
    }

    /**
     * Define o valor da propriedade minimumAge.
     * 
     */
    public void setMinimumAge(int value) {
        this.minimumAge = value;
    }

    /**
     * Obtém o valor da propriedade eventDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Define o valor da propriedade eventDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Obtém o valor da propriedade eventInitHour.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventInitHour() {
        return eventInitHour;
    }

    /**
     * Define o valor da propriedade eventInitHour.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventInitHour(XMLGregorianCalendar value) {
        this.eventInitHour = value;
    }

    /**
     * Obtém o valor da propriedade eventEndHour.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventEndHour() {
        return eventEndHour;
    }

    /**
     * Define o valor da propriedade eventEndHour.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventEndHour(XMLGregorianCalendar value) {
        this.eventEndHour = value;
    }

    /**
     * Obtém o valor da propriedade limitGuests.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLimitGuests() {
        return limitGuests;
    }

    /**
     * Define o valor da propriedade limitGuests.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimitGuests(Integer value) {
        this.limitGuests = value;
    }

    /**
     * Obtém o valor da propriedade addressEvent.
     * 
     * @return
     *     possible object is
     *     {@link AddressEvent }
     *     
     */
    public AddressEvent getAddressEvent() {
        return addressEvent;
    }

    /**
     * Define o valor da propriedade addressEvent.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressEvent }
     *     
     */
    public void setAddressEvent(AddressEvent value) {
        this.addressEvent = value;
    }

    /**
     * Obtém o valor da propriedade statusType.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatusType() {
        return statusType;
    }

    /**
     * Define o valor da propriedade statusType.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatusType(StatusType value) {
        this.statusType = value;
    }

    /**
     * Obtém o valor da propriedade dateUpdated.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateUpdated() {
        return dateUpdated;
    }

    /**
     * Define o valor da propriedade dateUpdated.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateUpdated(XMLGregorianCalendar value) {
        this.dateUpdated = value;
    }

}
