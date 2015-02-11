
package com.pos.services;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "LocaService", targetNamespace = "http://services.pos.com/", wsdlLocation = "http://192.168.0.102:8080/LocaCar-App/LocaService?WSDL")
public class LocaService_Service
    extends Service
{

    private final static URL LOCASERVICE_WSDL_LOCATION;
    private final static WebServiceException LOCASERVICE_EXCEPTION;
    private final static QName LOCASERVICE_QNAME = new QName("http://services.pos.com/", "LocaService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.0.102:8080/LocaCar-App/LocaService?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        LOCASERVICE_WSDL_LOCATION = url;
        LOCASERVICE_EXCEPTION = e;
    }

    public LocaService_Service() {
        super(__getWsdlLocation(), LOCASERVICE_QNAME);
    }

    public LocaService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), LOCASERVICE_QNAME, features);
    }

    public LocaService_Service(URL wsdlLocation) {
        super(wsdlLocation, LOCASERVICE_QNAME);
    }

    public LocaService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, LOCASERVICE_QNAME, features);
    }

    public LocaService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LocaService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns LocaService
     */
    @WebEndpoint(name = "LocaServicePort")
    public LocaService getLocaServicePort() {
        return super.getPort(new QName("http://services.pos.com/", "LocaServicePort"), LocaService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns LocaService
     */
    @WebEndpoint(name = "LocaServicePort")
    public LocaService getLocaServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.pos.com/", "LocaServicePort"), LocaService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (LOCASERVICE_EXCEPTION!= null) {
            throw LOCASERVICE_EXCEPTION;
        }
        return LOCASERVICE_WSDL_LOCATION;
    }

}