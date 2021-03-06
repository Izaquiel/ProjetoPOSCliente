/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managed;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
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
    Date dataAux;
    
    public String salvar(){
        GregorianCalendar cal = new GregorianCalendar(); 
        cal.setTimeInMillis(dataAux.getTime());        
        XMLGregorianCalendarImpl data = new XMLGregorianCalendarImpl(cal);
        voo.setDataVoo(data);
        portInterno.salvarVoo(voo);
        voo = new Voo();
        dataAux = null;
        return null;
    }

    public Date getDataAux() {
        return dataAux;
    }

    public void setDataAux(Date dataAux) {
        this.dataAux = dataAux;
    }
    
    public void editar(){
        portInterno.editarVoo(voo);
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
