
package com.fw.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fw.webservice package. 
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

    private final static QName _MyPrint_QNAME = new QName("http://webService.fw.com/", "myPrint");
    private final static QName _MyPrintResponse_QNAME = new QName("http://webService.fw.com/", "myPrintResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fw.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MyPrint }
     * 
     */
    public MyPrint createMyPrint() {
        return new MyPrint();
    }

    /**
     * Create an instance of {@link MyPrintResponse }
     * 
     */
    public MyPrintResponse createMyPrintResponse() {
        return new MyPrintResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyPrint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.fw.com/", name = "myPrint")
    public JAXBElement<MyPrint> createMyPrint(MyPrint value) {
        return new JAXBElement<MyPrint>(_MyPrint_QNAME, MyPrint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyPrintResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.fw.com/", name = "myPrintResponse")
    public JAXBElement<MyPrintResponse> createMyPrintResponse(MyPrintResponse value) {
        return new JAXBElement<MyPrintResponse>(_MyPrintResponse_QNAME, MyPrintResponse.class, null, value);
    }

}
