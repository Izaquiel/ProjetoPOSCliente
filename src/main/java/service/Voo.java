
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for voo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="voo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataVoo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="destino" type="{http://service/}cidade" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="origem" type="{http://service/}cidade" minOccurs="0"/>
 *         &lt;element name="vagas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "voo", propOrder = {
    "dataVoo",
    "destino",
    "id",
    "origem",
    "vagas",
    "valor"
})
public class Voo {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataVoo;
    protected Cidade destino;
    protected long id;
    protected Cidade origem;
    protected Integer vagas;
    protected Double valor;

    /**
     * Gets the value of the dataVoo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataVoo() {
        return dataVoo;
    }

    /**
     * Sets the value of the dataVoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataVoo(XMLGregorianCalendar value) {
        this.dataVoo = value;
    }

    /**
     * Gets the value of the destino property.
     * 
     * @return
     *     possible object is
     *     {@link Cidade }
     *     
     */
    public Cidade getDestino() {
        return destino;
    }

    /**
     * Sets the value of the destino property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cidade }
     *     
     */
    public void setDestino(Cidade value) {
        this.destino = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the origem property.
     * 
     * @return
     *     possible object is
     *     {@link Cidade }
     *     
     */
    public Cidade getOrigem() {
        return origem;
    }

    /**
     * Sets the value of the origem property.
     * 
     * @param value
     *     allowed object is
     *     {@link Cidade }
     *     
     */
    public void setOrigem(Cidade value) {
        this.origem = value;
    }

    /**
     * Gets the value of the vagas property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVagas() {
        return vagas;
    }

    /**
     * Sets the value of the vagas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVagas(Integer value) {
        this.vagas = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValor(Double value) {
        this.valor = value;
    }

}
