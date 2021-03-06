
package com.fw.webservice;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebServiceSeverService", targetNamespace = "http://webService.fw.com/", wsdlLocation = "http://localhost:5555/666?wsdl")
public class WebServiceSeverService
    extends Service
{

    private final static URL WEBSERVICESEVERSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICESEVERSERVICE_EXCEPTION;
    private final static QName WEBSERVICESEVERSERVICE_QNAME = new QName("http://webService.fw.com/", "WebServiceSeverService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:5555/666?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICESEVERSERVICE_WSDL_LOCATION = url;
        WEBSERVICESEVERSERVICE_EXCEPTION = e;
    }

    public WebServiceSeverService() {
        super(__getWsdlLocation(), WEBSERVICESEVERSERVICE_QNAME);
    }

    public WebServiceSeverService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICESEVERSERVICE_QNAME, features);
    }

    public WebServiceSeverService(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICESEVERSERVICE_QNAME);
    }

    public WebServiceSeverService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICESEVERSERVICE_QNAME, features);
    }

    public WebServiceSeverService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceSeverService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceSever
     */
    @WebEndpoint(name = "WebServiceSeverPort")
    public WebServiceSever getWebServiceSeverPort() {
        return super.getPort(new QName("http://webService.fw.com/", "WebServiceSeverPort"), WebServiceSever.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceSever
     */
    @WebEndpoint(name = "WebServiceSeverPort")
    public WebServiceSever getWebServiceSeverPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webService.fw.com/", "WebServiceSeverPort"), WebServiceSever.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICESEVERSERVICE_EXCEPTION!= null) {
            throw WEBSERVICESEVERSERVICE_EXCEPTION;
        }
        return WEBSERVICESEVERSERVICE_WSDL_LOCATION;
    }

}
