/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package managed;

import java.util.List;
import javax.faces.bean.ManagedBean;
import service.AgenciaInternaServiceService;
import service.AgenciaInterno;
import service.Cidade;

/**
 *
 * @author Izaquiel
 */
@ManagedBean(name = "Cidade")
public class CidadeManaged {
    
    AgenciaInternaServiceService agenciaInterna = new AgenciaInternaServiceService();
    AgenciaInterno portInterno = agenciaInterna.getAgenciaInternoPort();
    
    Cidade cidade = new Cidade();
    
    public void salvar(){
        portInterno.salvarCidade(cidade);
    }
    
    public void editar(){
        portInterno.editarCidade(cidade);
    }
    
    public List<Cidade> listarCidades(){
        return portInterno.listarCidades();
    }    
    
}
