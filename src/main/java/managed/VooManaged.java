/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managed;

import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import service.AgenciaInternaServiceService;
import service.AgenciaInterno;
import service.AgenciaService;
import service.Passagens;
import service.Voo;

/**
 *
 * @author Izaquiel
 */
@ManagedBean(name = "Voo")
public class VooManaged {
    
    Passagens passagens = new Passagens();
    AgenciaService port = passagens.getAgenciaServicePort();
    
    AgenciaInternaServiceService agenciaInterna = new AgenciaInternaServiceService();
    AgenciaInterno portInterno = agenciaInterna.getAgenciaInternoPort();
    
    Voo voo = new Voo();
    
    
    public void salvar(){
        portInterno.salvarVoo(voo);
    }
    
    public void editar(){
        portInterno.editarVoo(voo);
    }
    
    public List<Voo> listarVoos(){
        return port.getTodosVoos();
    }
    
//    public List<Voo> listarVoosPorData(){
//        
//    }
    public Passagens getPassagens() {
        return passagens;
    }

    public void setPassagens(Passagens passagens) {
        this.passagens = passagens;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    
    
}
