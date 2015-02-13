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
import service.Cidade;


/**
 *
 * @author Izaquiel
 */
@FacesConverter(value = "CidadeConverter")
public class CidadeConverter implements Converter{

    AgenciaInternaServiceService AgInterna = new AgenciaInternaServiceService();
    AgenciaInterno port = AgInterna.getAgenciaInternoPort();
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.equals("") || value.equalsIgnoreCase("--Selecione--")) {
            return null;
        } else {
            Cidade cidade = port.getCidadePorId(Long.parseLong(value));
            return cidade;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
         if (value instanceof Cidade) {
            Cidade cidade = (Cidade) value;
            return String.valueOf(cidade.getId());
        } else {
            return null;
        }
    }
    
}
