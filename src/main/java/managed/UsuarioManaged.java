package managed;

import java.util.List;
import javax.faces.bean.ManagedBean;
import service.AgenciaInternaServiceService;
import service.AgenciaInterno;
import service.AgenciaService;
import service.Passagens;
import service.Usuario;

/**
 *
 * @author Izaquiel
 */
@ManagedBean(name = "Usuario")
public class UsuarioManaged {

    Passagens passagens = new Passagens();
    AgenciaService port = passagens.getAgenciaServicePort();
    
    AgenciaInternaServiceService agenciaInterna = new AgenciaInternaServiceService();
    AgenciaInterno portInterno = agenciaInterna.getAgenciaInternoPort();
    
    
    Usuario usuario = new Usuario();
    
    public void salvar(){
        port.salvarUsuario(usuario);
    }
    
    public void editar(){
        portInterno.editarUsuario(usuario);
    }
    
    public List<Usuario> listarUsuarios(){
        return portInterno.getTodosUsuarios();
    }
    
    public Usuario getUsuarioPorLogin(String login){
        return port.getUsuario(login);
    }
    
}
