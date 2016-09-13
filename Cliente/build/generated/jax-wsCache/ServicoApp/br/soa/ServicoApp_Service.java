
package br.soa;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicoApp", targetNamespace = "http://soa.br/", wsdlLocation = "http://localhost:8080/Servico/ServicoApp?wsdl")
public class ServicoApp_Service
    extends Service
{

    private final static URL SERVICOAPP_WSDL_LOCATION;
    private final static WebServiceException SERVICOAPP_EXCEPTION;
    private final static QName SERVICOAPP_QNAME = new QName("http://soa.br/", "ServicoApp");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/Servico/ServicoApp?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICOAPP_WSDL_LOCATION = url;
        SERVICOAPP_EXCEPTION = e;
    }

    public ServicoApp_Service() {
        super(__getWsdlLocation(), SERVICOAPP_QNAME);
    }

    public ServicoApp_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICOAPP_QNAME, features);
    }

    public ServicoApp_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICOAPP_QNAME);
    }

    public ServicoApp_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICOAPP_QNAME, features);
    }

    public ServicoApp_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicoApp_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicoApp
     */
    @WebEndpoint(name = "ServicoAppPort")
    public ServicoApp getServicoAppPort() {
        return super.getPort(new QName("http://soa.br/", "ServicoAppPort"), ServicoApp.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicoApp
     */
    @WebEndpoint(name = "ServicoAppPort")
    public ServicoApp getServicoAppPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://soa.br/", "ServicoAppPort"), ServicoApp.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICOAPP_EXCEPTION!= null) {
            throw SERVICOAPP_EXCEPTION;
        }
        return SERVICOAPP_WSDL_LOCATION;
    }

}
