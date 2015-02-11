/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testes;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import service.AgenciaService;
import service.Passagens;
import service.Usuario;
import service.Voo;

/**
 *
 * @author Izaquiel
 */
public class App {
    public static void main(String[] args) {
//        
//        ReservaServiceService reserva = new ReservaServiceService();
//        ReservaService port = reserva.getReservaServicePort();
//        
//        List<Hotel> hoteis = port.getHoteis();
//        
//        for (Hotel hotel : hoteis) {
//            System.out.println(hotel.getNome());
//        }
        
        Passagens passagens = new Passagens();
        AgenciaService port = passagens.getAgenciaServicePort();
        
        Usuario user = port.getUsuario("zef");
        
        
        System.out.println("toString - " + user.toString() + "   " + port.getNomeUsuario("zef"));
        
        System.out.println("Nome: " + user.getNome());
        
        GregorianCalendar cal = new GregorianCalendar(Locale.ROOT);
        XMLGregorianCalendarImpl data = new XMLGregorianCalendarImpl(cal);
        
        List<Voo> voos = port.getVoosPorData(data);
        for (Voo voo : voos) {
            System.out.println(voo.getDestino().getNomeCidade());
        }
    }
}
