
package com.example.soap.client.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.soap.client.service package. 
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

    private final static QName _SayHelloWorld_QNAME = new QName("http://service.soap.example.com/", "sayHelloWorld");
    private final static QName _Multiply_QNAME = new QName("http://service.soap.example.com/", "multiply");
    private final static QName _SayHelloWorldResponse_QNAME = new QName("http://service.soap.example.com/", "sayHelloWorldResponse");
    private final static QName _Add_QNAME = new QName("http://service.soap.example.com/", "add");
    private final static QName _MultiplyV2_QNAME = new QName("http://service.soap.example.com/", "multiplyV2");
    private final static QName _Subtract_QNAME = new QName("http://service.soap.example.com/", "subtract");
    private final static QName _SubtractResponse_QNAME = new QName("http://service.soap.example.com/", "subtractResponse");
    private final static QName _AddResponse_QNAME = new QName("http://service.soap.example.com/", "addResponse");
    private final static QName _MultiplyResponse_QNAME = new QName("http://service.soap.example.com/", "multiplyResponse");
    private final static QName _MultiplyV2Response_QNAME = new QName("http://service.soap.example.com/", "multiplyV2Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.soap.client.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link SayHelloWorldResponse }
     * 
     */
    public SayHelloWorldResponse createSayHelloWorldResponse() {
        return new SayHelloWorldResponse();
    }

    /**
     * Create an instance of {@link MultiplyV2Response }
     * 
     */
    public MultiplyV2Response createMultiplyV2Response() {
        return new MultiplyV2Response();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link MultiplyResponse }
     * 
     */
    public MultiplyResponse createMultiplyResponse() {
        return new MultiplyResponse();
    }

    /**
     * Create an instance of {@link MultiplyV2 }
     * 
     */
    public MultiplyV2 createMultiplyV2() {
        return new MultiplyV2();
    }

    /**
     * Create an instance of {@link Subtract }
     * 
     */
    public Subtract createSubtract() {
        return new Subtract();
    }

    /**
     * Create an instance of {@link SubtractResponse }
     * 
     */
    public SubtractResponse createSubtractResponse() {
        return new SubtractResponse();
    }

    /**
     * Create an instance of {@link SayHelloWorld }
     * 
     */
    public SayHelloWorld createSayHelloWorld() {
        return new SayHelloWorld();
    }

    /**
     * Create an instance of {@link Multiply }
     * 
     */
    public Multiply createMultiply() {
        return new Multiply();
    }

    /**
     * Create an instance of {@link CalculatorData }
     * 
     */
    public CalculatorData createCalculatorData() {
        return new CalculatorData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorld }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "sayHelloWorld")
    public JAXBElement<SayHelloWorld> createSayHelloWorld(SayHelloWorld value) {
        return new JAXBElement<SayHelloWorld>(_SayHelloWorld_QNAME, SayHelloWorld.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiply }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "multiply")
    public JAXBElement<Multiply> createMultiply(Multiply value) {
        return new JAXBElement<Multiply>(_Multiply_QNAME, Multiply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloWorldResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "sayHelloWorldResponse")
    public JAXBElement<SayHelloWorldResponse> createSayHelloWorldResponse(SayHelloWorldResponse value) {
        return new JAXBElement<SayHelloWorldResponse>(_SayHelloWorldResponse_QNAME, SayHelloWorldResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyV2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "multiplyV2")
    public JAXBElement<MultiplyV2> createMultiplyV2(MultiplyV2 value) {
        return new JAXBElement<MultiplyV2>(_MultiplyV2_QNAME, MultiplyV2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Subtract }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "subtract")
    public JAXBElement<Subtract> createSubtract(Subtract value) {
        return new JAXBElement<Subtract>(_Subtract_QNAME, Subtract.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubtractResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "subtractResponse")
    public JAXBElement<SubtractResponse> createSubtractResponse(SubtractResponse value) {
        return new JAXBElement<SubtractResponse>(_SubtractResponse_QNAME, SubtractResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "multiplyResponse")
    public JAXBElement<MultiplyResponse> createMultiplyResponse(MultiplyResponse value) {
        return new JAXBElement<MultiplyResponse>(_MultiplyResponse_QNAME, MultiplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplyV2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.soap.example.com/", name = "multiplyV2Response")
    public JAXBElement<MultiplyV2Response> createMultiplyV2Response(MultiplyV2Response value) {
        return new JAXBElement<MultiplyV2Response>(_MultiplyV2Response_QNAME, MultiplyV2Response.class, null, value);
    }

}
