/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import com.pos.services.Carro;
import com.pos.services.LocaService;
import com.pos.services.LocaService_Service;
import com.pos.services.Locadora;
import com.pos.services.Pessoa;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author Izaquiel
 */
@ManagedBean(name = "Carros")
@RequestScoped
public class CarrosManaged {
    
    LocaService_Service locaService = new LocaService_Service();
    LocaService service = locaService.getLocaServicePort();
    
    Locadora locadora = new Locadora();
    Carro carro = new Carro();
    Pessoa pessoa = new Pessoa();
    Date dataLocacao;
    Date dataDevolucao;
    
    public List<SelectItem> getCarrosDisponiveis(){
        
        List<SelectItem> lista = new ArrayList<>();
        
        List<Carro> carros = service.getCarrosDisponiveis();
        
        for (Carro c : carros) {
            lista.add(new SelectItem(c, "Nome: " + c.getNome() + " / Preço: " + c.getValor()));
        }
        
        return lista;
    }
    
    public String locarCarro(){
        
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(dataLocacao.getTime());
        XMLGregorianCalendarImpl dataEnt = new XMLGregorianCalendarImpl(cal);

        cal.setTimeInMillis(dataDevolucao.getTime());
        XMLGregorianCalendarImpl dataSai = new XMLGregorianCalendarImpl(cal);
        
        service.reservarCarro(carro.getId(), pessoa, dataEnt, dataSai);
        
        carro = new Carro();
        pessoa = new Pessoa();
        dataLocacao = null;
        dataDevolucao = null;
        
        return null;
    }
    
    public List<Carro> getCarrosPorLocadora(){
        return service.getCarrosDisponiveisPorIdLocadora(locadora.getId());
    }
    
    public List<Locadora> getLocadoras(){
        return service.getLocadoras();
    }

    public Carro getCarroPorId(int id){
        return service.getCarroPorId(id);
    }
    
    public Locadora getLocadoraPorId(int id){
        return service.getLocadoraPorId(id);
    }
    
    
    
    public Locadora getLocadora() {
        return locadora;
    }

    public void setLocadora(Locadora locadora) {
        this.locadora = locadora;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Date getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Date dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    
    
}
