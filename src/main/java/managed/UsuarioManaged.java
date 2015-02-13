package managed;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.util.Date;
import java.util.GregorianCalendar;
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
    Date dataAux;
    
    public void salvar(){
        
        GregorianCalendar cal = new GregorianCalendar(); 
        cal.setTimeInMillis(dataAux.getTime());        
        XMLGregorianCalendarImpl data = new XMLGregorianCalendarImpl(cal);
        
        usuario.setDataNascimento(data);
        
        port.salvarUsuario(usuario);
        usuario = new Usuario();
    }

    public Date getDataAux() {
        return dataAux;
    }

    public void setDataAux(Date dataAux) {
        this.dataAux = dataAux;
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

    public Passagens getPassagens() {
        return passagens;
    }

    public void setPassagens(Passagens passagens) {
        this.passagens = passagens;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
