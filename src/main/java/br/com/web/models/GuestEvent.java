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
 * <p>Classe Java de GuestEvent complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="GuestEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="event" type="{http://invviteme.com/domain}Event" minOccurs="0"/>
 *         &lt;element name="user" type="{http://invviteme.com/domain}Users" minOccurs="0"/>
 *         &lt;element name="attendanceConfirmed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timeSentToken" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateAttendanceConfirmed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestEvent", propOrder = {
    "id",
    "event",
    "user",
    "attendanceConfirmed",
    "timeSentToken",
    "token",
    "dateAttendanceConfirmed"
})
public class GuestEvent {

    protected Integer id;
    protected Event event;
    protected Users user;
    protected Boolean attendanceConfirmed;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeSentToken;
    protected String token;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAttendanceConfirmed;

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
     * Obtém o valor da propriedade event.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Define o valor da propriedade event.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
    }

    /**
     * Obtém o valor da propriedade user.
     * 
     * @return
     *     possible object is
     *     {@link Users }
     *     
     */
    public Users getUser() {
        return user;
    }

    /**
     * Define o valor da propriedade user.
     * 
     * @param value
     *     allowed object is
     *     {@link Users }
     *     
     */
    public void setUser(Users value) {
        this.user = value;
    }

    /**
     * Obtém o valor da propriedade attendanceConfirmed.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttendanceConfirmed() {
        return attendanceConfirmed;
    }

    /**
     * Define o valor da propriedade attendanceConfirmed.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttendanceConfirmed(Boolean value) {
        this.attendanceConfirmed = value;
    }

    /**
     * Obtém o valor da propriedade timeSentToken.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimeSentToken() {
        return timeSentToken;
    }

    /**
     * Define o valor da propriedade timeSentToken.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeSentToken(XMLGregorianCalendar value) {
        this.timeSentToken = value;
    }

    /**
     * Obtém o valor da propriedade token.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Define o valor da propriedade token.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Obtém o valor da propriedade dateAttendanceConfirmed.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAttendanceConfirmed() {
        return dateAttendanceConfirmed;
    }

    /**
     * Define o valor da propriedade dateAttendanceConfirmed.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAttendanceConfirmed(XMLGregorianCalendar value) {
        this.dateAttendanceConfirmed = value;
    }

}
