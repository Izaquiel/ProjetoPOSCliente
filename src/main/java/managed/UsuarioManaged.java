package managed;

import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.persistence.NoResultException;
import javax.xml.datatype.XMLGregorianCalendar;
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
    Usuario usuarioAux = new Usuario();
    Date dataAux = new Date();

    public void salvar() {

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(dataAux.getTime());
        XMLGregorianCalendarImpl data = new XMLGregorianCalendarImpl(cal);

        usuario.setDataNascimento(data);

        port.salvarUsuario(usuario);
        usuario = new Usuario();
        dataAux = null;
    }

    public Usuario getUsuarioAux() {
        return usuarioAux;
    }

    public void setUsuarioAux(Usuario usuarioAux) {
        this.usuarioAux = usuarioAux;
    }

    public Date getDataAux() {
        return dataAux;
    }

    public void setDataAux(Date dataAux) {
        this.dataAux = dataAux;
    }

    public String editar() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        usuarioAux.setId(Long.parseLong(params.get("idUsuario")));

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(dataAux.getTime());
        XMLGregorianCalendarImpl data = new XMLGregorianCalendarImpl(cal);

        usuarioAux.setDataNascimento(data);
        portInterno.editarUsuario(usuarioAux);

        usuarioAux = new Usuario();
        dataAux = null;
        return null;
    }

    public List<Usuario> listarUsuarios() {
        return portInterno.getTodosUsuarios();
    }

    public Usuario getUsuarioPorLogin(String login) {
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

    public String pesquisaUsuario() {
        try {
            usuarioAux = port.getUsuario(usuario.getCpf());

            GregorianCalendar cal;
            XMLGregorianCalendar data = usuarioAux.getDataNascimento();

            cal = data.toGregorianCalendar();

            dataAux.setTime(cal.getTimeInMillis());
            
            return "editarUsuario.xhtml";
        } catch (NoResultException e) {
            e.printStackTrace();
            return null;
        }
    }
}
