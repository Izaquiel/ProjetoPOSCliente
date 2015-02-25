/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managed;

import br.com.pos.hotel.services.Hotel;
import br.com.pos.hotel.services.Quarto;
import br.com.pos.hotel.services.ReservaService;
import br.com.pos.hotel.services.ReservaServiceService;
import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Izaquiel
 */
@ManagedBean(name = "Hotel")
@SessionScoped
public class HotelManaged {

    ReservaServiceService reservaService = new ReservaServiceService();
    ReservaService service = reservaService.getReservaServicePort();

    Quarto quarto = new Quarto();
    Hotel hotel = new Hotel();

    String nome;
    String documento;
    Date dataEntrada;
    Date dataSaida;

    public List<SelectItem> listaHoteis() {
        List<SelectItem> lista = new ArrayList<>();

        List<Hotel> hoteis = service.getHoteis();

        for (Hotel h : hoteis) {
            lista.add(new SelectItem(h, h.getNome()));
        }
        return lista;
    }

    public List<SelectItem> listaQuartos() {
        List<SelectItem> lista = new ArrayList<>();

        List<Quarto> quartos = service.getListaQuartosDesocupadosPorIdHotel(hotel.getId());

        for (Quarto q : quartos) {
            lista.add(new SelectItem(q, "Quarto - " + q.getId() + " / Capacidade - " + q.getCapacidade()));
        }
        return lista;
    }

    public String quartos() {
        return "reservaQuarto.jsp";
    }

    public String reserva() {
        return "reservar.jsp";
    }

    public String salvarReserva() {

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(dataEntrada.getTime());
        XMLGregorianCalendarImpl dataEnt = new XMLGregorianCalendarImpl(cal);

        cal.setTimeInMillis(dataSaida.getTime());
        XMLGregorianCalendarImpl dataSai = new XMLGregorianCalendarImpl(cal);

        service.reservar(hotel.getId(), quarto.getId(), nome, documento, dataEnt, dataSai);
        
        logout();
        
        return null;
    }
    
    public String logout() {
        //Redireciona o usuário para tela de login efetuando o logout.  
        String loginPage = "/index.jsp";
        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        HttpServletRequest request = (HttpServletRequest) context.getRequest();
        HttpSession session = (HttpSession) context.getSession(false);
        session.invalidate();
        try {
            context.redirect(request.getContextPath() + loginPage);
        } catch (IOException e) {
            //logger.error("Erro ao tentar redirecionar para página solicitada ao efetuar Logout: " + e.toString());  
        }

        return null;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

}
