
package br.com.pos.hotel.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for quarto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="quarto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="capacidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ocupado" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "quarto", propOrder = {
    "capacidade",
    "id",
    "ocupado",
    "valor"
})
public class Quarto {

    protected int capacidade;
    protected int id;
    protected boolean ocupado;
    protected double valor;

    /**
     * Gets the value of the capacidade property.
     * 
     */
    public int getCapacidade() {
        return capacidade;
    }

    /**
     * Sets the value of the capacidade property.
     * 
     */
    public void setCapacidade(int value) {
        this.capacidade = value;
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
     * Gets the value of the ocupado property.
     * 
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * Sets the value of the ocupado property.
     * 
     */
    public void setOcupado(boolean value) {
        this.ocupado = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}
