
package com.pos.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoStatusReserva.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoStatusReserva">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RESERVADO"/>
 *     &lt;enumeration value="DISPONIVEL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoStatusReserva")
@XmlEnum
public enum TipoStatusReserva {

    RESERVADO,
    DISPONIVEL;

    public String value() {
        return name();
    }

    public static TipoStatusReserva fromValue(String v) {
        return valueOf(v);
    }

}
