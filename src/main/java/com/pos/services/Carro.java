
package com.pos.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carro">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ano" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="locadora" type="{http://services.pos.com/}locadora" minOccurs="0"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="statusReserva" type="{http://services.pos.com/}tipoStatusReserva" minOccurs="0"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carro", propOrder = {
    "ano",
    "id",
    "locadora",
    "nome",
    "placa",
    "statusReserva",
    "valor"
})
public class Carro {

    protected int ano;
    protected int id;
    protected Locadora locadora;
    protected String nome;
    protected String placa;
    protected TipoStatusReserva statusReserva;
    protected float valor;

    /**
     * Gets the value of the ano property.
     * 
     */
    public int getAno() {
        return ano;
    }

    /**
     * Sets the value of the ano property.
     * 
     */
    public void setAno(int value) {
        this.ano = value;
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
     * Gets the value of the locadora property.
     * 
     * @return
     *     possible object is
     *     {@link Locadora }
     *     
     */
    public Locadora getLocadora() {
        return locadora;
    }

    /**
     * Sets the value of the locadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link Locadora }
     *     
     */
    public void setLocadora(Locadora value) {
        this.locadora = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the placa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Sets the value of the placa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Gets the value of the statusReserva property.
     * 
     * @return
     *     possible object is
     *     {@link TipoStatusReserva }
     *     
     */
    public TipoStatusReserva getStatusReserva() {
        return statusReserva;
    }

    /**
     * Sets the value of the statusReserva property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoStatusReserva }
     *     
     */
    public void setStatusReserva(TipoStatusReserva value) {
        this.statusReserva = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     */
    public float getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     */
    public void setValor(float value) {
        this.valor = value;
    }

}
