/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import service.AgenciaInternaServiceService;
import service.AgenciaInterno;
import service.Voo;

/**
 *
 * @author Izaquiel
 */
@FacesConverter(value = "VooConverter")
public class VooConverter implements Converter {

    AgenciaInternaServiceService AgInterna = new AgenciaInternaServiceService();
    AgenciaInterno port = AgInterna.getAgenciaInternoPort();

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.equals("") || value.equalsIgnoreCase("--Selecione--")) {
            return null;
        } else {
            Voo voo = port.getVooPorId(Long.parseLong(value));
            return voo;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Voo) {
            Voo voo = (Voo) value;
            return String.valueOf(voo.getId());
        } else {
            return null;
        }
    }

}
