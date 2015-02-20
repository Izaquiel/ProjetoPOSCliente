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
import service.Cidade;
import service.Passagens;

/**
 *
 * @author Izaquiel
 */
@ManagedBean(name = "Cidade")
public class CidadeManaged {
    
    Passagens passagens = new Passagens();
    AgenciaService port = passagens.getAgenciaServicePort();
    
    AgenciaInternaServiceService agenciaInterna = new AgenciaInternaServiceService();
    AgenciaInterno portInterno = agenciaInterna.getAgenciaInternoPort();
    
    Cidade cidade = new Cidade();
    
    public String salvar(){
        portInterno.salvarCidade(cidade);
        cidade = new Cidade();
        return null;
    }
    
    public void editar(){
        portInterno.editarCidade(cidade);
    }
    
    public List<Cidade> listarCidades(){
        return port.getCidades();
    }    

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }    
    
    public List<SelectItem> listaCidades() {

        List<SelectItem> lista = new ArrayList<>();

        List<Cidade> cidades = port.getCidades();

        for (Cidade c : cidades) {
            lista.add(new SelectItem(c,c.getNomeCidade()));
        }
        return lista;
    }
}
