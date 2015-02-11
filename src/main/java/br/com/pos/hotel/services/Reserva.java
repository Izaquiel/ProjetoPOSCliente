
package br.com.pos.hotel.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for reserva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="reserva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataEntrada" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="dataSaida" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pessoa" type="{http://services.hotel.pos.com.br/}pessoa" minOccurs="0"/>
 *         &lt;element name="quarto" type="{http://services.hotel.pos.com.br/}quarto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reserva", propOrder = {
    "dataEntrada",
    "dataSaida",
    "id",
    "pessoa",
    "quarto"
})
public class Reserva {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataEntrada;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataSaida;
    protected int id;
    protected Pessoa pessoa;
    protected Quarto quarto;

    /**
     * Gets the value of the dataEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEntrada() {
        return dataEntrada;
    }

    /**
     * Sets the value of the dataEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEntrada(XMLGregorianCalendar value) {
        this.dataEntrada = value;
    }

    /**
     * Gets the value of the dataSaida property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSaida() {
        return dataSaida;
    }

    /**
     * Sets the value of the dataSaida property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSaida(XMLGregorianCalendar value) {
        this.dataSaida = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the pessoa property.
     * 
     * @return
     *     possible object is
     *     {@link Pessoa }
     *     
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * Sets the value of the pessoa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pessoa }
     *     
     */
    public void setPessoa(Pessoa value) {
        this.pessoa = value;
    }

    /**
     * Gets the value of the quarto property.
     * 
     * @return
     *     possible object is
     *     {@link Quarto }
     *     
     */
    public Quarto getQuarto() {
        return quarto;
    }

    /**
     * Sets the value of the quarto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quarto }
     *     
     */
    public void setQuarto(Quarto value) {
        this.quarto = value;
    }

}
