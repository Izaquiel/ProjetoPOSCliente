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
import service.AgenciaService;
import service.Passagem;
import service.Passagens;
import service.Usuario;
import service.Voo;

/**
 *
 * @author Izaquiel
 */
@ManagedBean(name = "Passagem")
public class PassagemManaged {

    Passagens passagens = new Passagens();
    AgenciaService port = passagens.getAgenciaServicePort();

    AgenciaInternaServiceService agenciaInterna = new AgenciaInternaServiceService();
    AgenciaInterno portInterno = agenciaInterna.getAgenciaInternoPort();

    Passagem passagem = new Passagem();
    Usuario usuario = new Usuario();
    Voo voo = new Voo();

    public void salvar() {
        port.venderPassagem(voo.getId(), usuario);
        passagem = new Passagem();
        usuario = new Usuario();
        voo = new Voo();
    }

    public void editar() {
        passagem.setUsuario(usuario);
        passagem.setVoo(voo);
        portInterno.editarPassagem(passagem);
        passagem = new Passagem();
        usuario = new Usuario();
        voo = new Voo();
    }

    public List<Passagem> listarPassagens() {
        return portInterno.listarPassagens();

    }

    public Passagens getPassagens() {
        return passagens;
    }

    public void setPassagens(Passagens passagens) {
        this.passagens = passagens;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

}
