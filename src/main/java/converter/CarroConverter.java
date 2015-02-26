/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import com.pos.services.Carro;
import com.pos.services.LocaService;
import com.pos.services.LocaService_Service;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Izaquiel
 */
@FacesConverter(value = "carroConverter")
public class CarroConverter implements Converter {

    LocaService_Service locaService = new LocaService_Service();
    LocaService service = locaService.getLocaServicePort();

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.equals("") || value.equalsIgnoreCase("--selecione--")) {
            return null;
        } else {
            Carro carro = service.getCarroPorId(Integer.parseInt(value));
            return carro;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Carro) {
            Carro carro = (Carro) value;
            return String.valueOf(carro.getId());
        } else {
            return null;
        }
    }

}
