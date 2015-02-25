/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package converter;

import br.com.pos.hotel.services.Quarto;
import br.com.pos.hotel.services.ReservaService;
import br.com.pos.hotel.services.ReservaServiceService;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Izaquiel
 */
@FacesConverter(value = "quartoConverter")
public class QuartoConverter implements Converter{

    ReservaServiceService reservaService = new ReservaServiceService();
    ReservaService service = reservaService.getReservaServicePort();
    
    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.equals("") || value.equalsIgnoreCase("--selecione--")) {
            return null;
        } else {
            Quarto quarto = service.getQuartoByID(Integer.parseInt(value));
            return quarto;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Quarto) {
            Quarto quarto = (Quarto) value;
            return String.valueOf(quarto.getId());
        } else {
            return null;
        }
    }
    
}
