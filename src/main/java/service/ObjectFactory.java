
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUsuario_QNAME = new QName("http://service/", "getUsuario");
    private final static QName _GetVooPorIdResponse_QNAME = new QName("http://service/", "getVooPorIdResponse");
    private final static QName _GetAdministrador_QNAME = new QName("http://service/", "getAdministrador");
    private final static QName _VenderPassagem_QNAME = new QName("http://service/", "venderPassagem");
    private final static QName _GetCidades_QNAME = new QName("http://service/", "getCidades");
    private final static QName _VenderPassagemResponse_QNAME = new QName("http://service/", "venderPassagemResponse");
    private final static QName _GetVoosPorDataResponse_QNAME = new QName("http://service/", "getVoosPorDataResponse");
    private final static QName _GetUsuarioResponse_QNAME = new QName("http://service/", "getUsuarioResponse");
    private final static QName _SalvarUsuarioResponse_QNAME = new QName("http://service/", "salvarUsuarioResponse");
    private final static QName _GetCidadesResponse_QNAME = new QName("http://service/", "getCidadesResponse");
    private final static QName _GetVooResponse_QNAME = new QName("http://service/", "getVooResponse");
    private final static QName _GetVoo_QNAME = new QName("http://service/", "getVoo");
    private final static QName _GetVooPorId_QNAME = new QName("http://service/", "getVooPorId");
    private final static QName _GetAdministradorResponse_QNAME = new QName("http://service/", "getAdministradorResponse");
    private final static QName _SalvarUsuario_QNAME = new QName("http://service/", "salvarUsuario");
    private final static QName _GetVoosPorData_QNAME = new QName("http://service/", "getVoosPorData");
    private final static QName _GetTodosVoos_QNAME = new QName("http://service/", "getTodosVoos");
    private final static QName _GetTodosVoosResponse_QNAME = new QName("http://service/", "getTodosVoosResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTodosVoosResponse }
     * 
     */
    public GetTodosVoosResponse createGetTodosVoosResponse() {
        return new GetTodosVoosResponse();
    }

    /**
     * Create an instance of {@link GetTodosVoos }
     * 
     */
    public GetTodosVoos createGetTodosVoos() {
        return new GetTodosVoos();
    }

    /**
     * Create an instance of {@link GetVoosPorData }
     * 
     */
    public GetVoosPorData createGetVoosPorData() {
        return new GetVoosPorData();
    }

    /**
     * Create an instance of {@link SalvarUsuario }
     * 
     */
    public SalvarUsuario createSalvarUsuario() {
        return new SalvarUsuario();
    }

    /**
     * Create an instance of {@link GetAdministradorResponse }
     * 
     */
    public GetAdministradorResponse createGetAdministradorResponse() {
        return new GetAdministradorResponse();
    }

    /**
     * Create an instance of {@link GetVoo }
     * 
     */
    public GetVoo createGetVoo() {
        return new GetVoo();
    }

    /**
     * Create an instance of {@link GetVooPorId }
     * 
     */
    public GetVooPorId createGetVooPorId() {
        return new GetVooPorId();
    }

    /**
     * Create an instance of {@link GetVooResponse }
     * 
     */
    public GetVooResponse createGetVooResponse() {
        return new GetVooResponse();
    }

    /**
     * Create an instance of {@link SalvarUsuarioResponse }
     * 
     */
    public SalvarUsuarioResponse createSalvarUsuarioResponse() {
        return new SalvarUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetCidadesResponse }
     * 
     */
    public GetCidadesResponse createGetCidadesResponse() {
        return new GetCidadesResponse();
    }

    /**
     * Create an instance of {@link GetUsuarioResponse }
     * 
     */
    public GetUsuarioResponse createGetUsuarioResponse() {
        return new GetUsuarioResponse();
    }

    /**
     * Create an instance of {@link GetVoosPorDataResponse }
     * 
     */
    public GetVoosPorDataResponse createGetVoosPorDataResponse() {
        return new GetVoosPorDataResponse();
    }

    /**
     * Create an instance of {@link VenderPassagemResponse }
     * 
     */
    public VenderPassagemResponse createVenderPassagemResponse() {
        return new VenderPassagemResponse();
    }

    /**
     * Create an instance of {@link GetCidades }
     * 
     */
    public GetCidades createGetCidades() {
        return new GetCidades();
    }

    /**
     * Create an instance of {@link VenderPassagem }
     * 
     */
    public VenderPassagem createVenderPassagem() {
        return new VenderPassagem();
    }

    /**
     * Create an instance of {@link GetAdministrador }
     * 
     */
    public GetAdministrador createGetAdministrador() {
        return new GetAdministrador();
    }

    /**
     * Create an instance of {@link GetVooPorIdResponse }
     * 
     */
    public GetVooPorIdResponse createGetVooPorIdResponse() {
        return new GetVooPorIdResponse();
    }

    /**
     * Create an instance of {@link GetUsuario }
     * 
     */
    public GetUsuario createGetUsuario() {
        return new GetUsuario();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Pessoa }
     * 
     */
    public Pessoa createPessoa() {
        return new Pessoa();
    }

    /**
     * Create an instance of {@link Administrador }
     * 
     */
    public Administrador createAdministrador() {
        return new Administrador();
    }

    /**
     * Create an instance of {@link Cidade }
     * 
     */
    public Cidade createCidade() {
        return new Cidade();
    }

    /**
     * Create an instance of {@link Voo }
     * 
     */
    public Voo createVoo() {
        return new Voo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getUsuario")
    public JAXBElement<GetUsuario> createGetUsuario(GetUsuario value) {
        return new JAXBElement<GetUsuario>(_GetUsuario_QNAME, GetUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVooPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getVooPorIdResponse")
    public JAXBElement<GetVooPorIdResponse> createGetVooPorIdResponse(GetVooPorIdResponse value) {
        return new JAXBElement<GetVooPorIdResponse>(_GetVooPorIdResponse_QNAME, GetVooPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdministrador }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAdministrador")
    public JAXBElement<GetAdministrador> createGetAdministrador(GetAdministrador value) {
        return new JAXBElement<GetAdministrador>(_GetAdministrador_QNAME, GetAdministrador.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VenderPassagem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "venderPassagem")
    public JAXBElement<VenderPassagem> createVenderPassagem(VenderPassagem value) {
        return new JAXBElement<VenderPassagem>(_VenderPassagem_QNAME, VenderPassagem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCidades }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCidades")
    public JAXBElement<GetCidades> createGetCidades(GetCidades value) {
        return new JAXBElement<GetCidades>(_GetCidades_QNAME, GetCidades.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VenderPassagemResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "venderPassagemResponse")
    public JAXBElement<VenderPassagemResponse> createVenderPassagemResponse(VenderPassagemResponse value) {
        return new JAXBElement<VenderPassagemResponse>(_VenderPassagemResponse_QNAME, VenderPassagemResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVoosPorDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getVoosPorDataResponse")
    public JAXBElement<GetVoosPorDataResponse> createGetVoosPorDataResponse(GetVoosPorDataResponse value) {
        return new JAXBElement<GetVoosPorDataResponse>(_GetVoosPorDataResponse_QNAME, GetVoosPorDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getUsuarioResponse")
    public JAXBElement<GetUsuarioResponse> createGetUsuarioResponse(GetUsuarioResponse value) {
        return new JAXBElement<GetUsuarioResponse>(_GetUsuarioResponse_QNAME, GetUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "salvarUsuarioResponse")
    public JAXBElement<SalvarUsuarioResponse> createSalvarUsuarioResponse(SalvarUsuarioResponse value) {
        return new JAXBElement<SalvarUsuarioResponse>(_SalvarUsuarioResponse_QNAME, SalvarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCidadesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getCidadesResponse")
    public JAXBElement<GetCidadesResponse> createGetCidadesResponse(GetCidadesResponse value) {
        return new JAXBElement<GetCidadesResponse>(_GetCidadesResponse_QNAME, GetCidadesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVooResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getVooResponse")
    public JAXBElement<GetVooResponse> createGetVooResponse(GetVooResponse value) {
        return new JAXBElement<GetVooResponse>(_GetVooResponse_QNAME, GetVooResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVoo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getVoo")
    public JAXBElement<GetVoo> createGetVoo(GetVoo value) {
        return new JAXBElement<GetVoo>(_GetVoo_QNAME, GetVoo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVooPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getVooPorId")
    public JAXBElement<GetVooPorId> createGetVooPorId(GetVooPorId value) {
        return new JAXBElement<GetVooPorId>(_GetVooPorId_QNAME, GetVooPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAdministradorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getAdministradorResponse")
    public JAXBElement<GetAdministradorResponse> createGetAdministradorResponse(GetAdministradorResponse value) {
        return new JAXBElement<GetAdministradorResponse>(_GetAdministradorResponse_QNAME, GetAdministradorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SalvarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "salvarUsuario")
    public JAXBElement<SalvarUsuario> createSalvarUsuario(SalvarUsuario value) {
        return new JAXBElement<SalvarUsuario>(_SalvarUsuario_QNAME, SalvarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVoosPorData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getVoosPorData")
    public JAXBElement<GetVoosPorData> createGetVoosPorData(GetVoosPorData value) {
        return new JAXBElement<GetVoosPorData>(_GetVoosPorData_QNAME, GetVoosPorData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTodosVoos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getTodosVoos")
    public JAXBElement<GetTodosVoos> createGetTodosVoos(GetTodosVoos value) {
        return new JAXBElement<GetTodosVoos>(_GetTodosVoos_QNAME, GetTodosVoos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTodosVoosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service/", name = "getTodosVoosResponse")
    public JAXBElement<GetTodosVoosResponse> createGetTodosVoosResponse(GetTodosVoosResponse value) {
        return new JAXBElement<GetTodosVoosResponse>(_GetTodosVoosResponse_QNAME, GetTodosVoosResponse.class, null, value);
    }

}
