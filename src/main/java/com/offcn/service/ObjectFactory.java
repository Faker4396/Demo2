
package com.offcn.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.offcn.service package. 
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

    private final static QName _FindByNumberResponse_QNAME = new QName("http://service.offcn.com/", "findByNumberResponse");
    private final static QName _FindByNumber_QNAME = new QName("http://service.offcn.com/", "findByNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.offcn.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindByNumber }
     * 
     */
    public FindByNumber createFindByNumber() {
        return new FindByNumber();
    }

    /**
     * Create an instance of {@link FindByNumberResponse }
     * 
     */
    public FindByNumberResponse createFindByNumberResponse() {
        return new FindByNumberResponse();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.offcn.com/", name = "findByNumberResponse")
    public JAXBElement<FindByNumberResponse> createFindByNumberResponse(FindByNumberResponse value) {
        return new JAXBElement<FindByNumberResponse>(_FindByNumberResponse_QNAME, FindByNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.offcn.com/", name = "findByNumber")
    public JAXBElement<FindByNumber> createFindByNumber(FindByNumber value) {
        return new JAXBElement<FindByNumber>(_FindByNumber_QNAME, FindByNumber.class, null, value);
    }

}
