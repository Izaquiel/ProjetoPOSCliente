/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.persistence.NoResultException;
import service.Administrador;
import service.AgenciaInternaServiceService;
import service.AgenciaInterno;
import service.AgenciaService;
import service.Passagens;

/**
 *
 * @author Wagner Abreu
 */
@ManagedBean(name = "Administrador")
public class AdminManaged {

    AgenciaInternaServiceService agenciaInterna = new AgenciaInternaServiceService();
    AgenciaInterno portInterno = agenciaInterna.getAgenciaInternoPort();

    Passagens passagens = new Passagens();
    AgenciaService port = passagens.getAgenciaServicePort();

    Administrador adm = new Administrador();

    public Administrador getAdm() {
        return adm;
    }

    public void setAdm(Administrador adm) {
        this.adm = adm;
    }

    public String salvar() {
        portInterno.salvarAdmin(adm);
        adm = new Administrador();
        return null;
    }

    public String editar() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        adm.setId(Long.parseLong(params.get("idAdm")));
        portInterno.editarAdmin(adm);
        adm = new Administrador();
        return null;
    }

    public List<Administrador> listar() {
        return portInterno.listarAdmins();
    }

    public String pesquisaAdmin() {
        try {
            adm = portInterno.getAdminPorCpf(adm.getCpf());
            return "editarAdministrador.xhtml";
        } catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }
    }
}
