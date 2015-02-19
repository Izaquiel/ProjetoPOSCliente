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
@FacesConverter(value = "cidadeConverter")
public class CidadeConverter implements Converter{
    
    AgenciaInternaServiceService AgInterna = new AgenciaInternaServiceService();
    AgenciaInterno port = AgInterna.getAgenciaInternoPort();
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.equals("") || value.equalsIgnoreCase("--selecione--")) {
            return null;
        } else {
            try{
            Cidade cidade = port.getCidadePorId(Long.parseLong(value));
            return cidade;
            }catch(RuntimeException e){
                e.printStackTrace();
                return null;
            }
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
         if (value instanceof Cidade) {
             try{
            Cidade cidade = (Cidade) value;
            return String.valueOf(cidade.getId());      
             }catch(Exception e){
                 e.printStackTrace();
                 return null;
             }
        } else {
            return null;
        }
    }
    
}
