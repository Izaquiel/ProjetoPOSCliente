/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

import br.com.pos.hotel.services.Hotel;
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
@FacesConverter(value = "hotelConverter")
public class HotelConverter implements Converter {

    ReservaServiceService reservaService = new ReservaServiceService();
    ReservaService service = reservaService.getReservaServicePort();

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        if (value == null || value.equals("") || value.equalsIgnoreCase("--selecione--")) {
            return null;
        } else {
            Hotel hotel = service.getHotelById(Integer.parseInt(value));
            return hotel;
        }
    }

    @Override
    public String getAsString(FacesContext context, UIComponent component, Object value) {
        if (value instanceof Hotel) {
            Hotel hotel = (Hotel) value;
            return String.valueOf(hotel.getId());
        } else {
            return null;
        }
    }

}
