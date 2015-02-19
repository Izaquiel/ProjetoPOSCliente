/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managed;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
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
    
    
    public String salvar(){
        System.out.println("Entrou no Salvar");
        portInterno.salvarVoo(voo);
        voo = new Voo();
        return "faces/index.xhtml";
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

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    
    public List<SelectItem> getVoos() {

        List<SelectItem> lista = new ArrayList<>();

        List<Voo> voos = port.getTodosVoos();

        for (Voo v : voos) {
            lista.add(new SelectItem(v, "Origem - " + v.getOrigem().getNomeCidade() + " / Destino - "+ v.getDestino().getNomeCidade()));
        }
        return lista;
    }
}
