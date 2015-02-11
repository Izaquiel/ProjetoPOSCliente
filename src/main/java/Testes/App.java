/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Testes;

import br.com.pos.hotel.services.Hotel;
import br.com.pos.hotel.services.ReservaService;
import br.com.pos.hotel.services.ReservaServiceService;
import java.util.List;
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
        
        
        System.out.println(user.toString() + "   " + port.getNomeUsuario("zef"));
        
    }
}
