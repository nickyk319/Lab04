
package com.example.soap.client.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Calculator", targetNamespace = "http://service.soap.example.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Calculator {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiply", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.Multiply")
    @ResponseWrapper(localName = "multiplyResponse", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.MultiplyResponse")
    @Action(input = "http://service.soap.example.com/Calculator/multiplyRequest", output = "http://service.soap.example.com/Calculator/multiplyResponse")
    public double multiply(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtract", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.Subtract")
    @ResponseWrapper(localName = "subtractResponse", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.SubtractResponse")
    @Action(input = "http://service.soap.example.com/Calculator/subtractRequest", output = "http://service.soap.example.com/Calculator/subtractResponse")
    public double subtract(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sayHelloWorld", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.SayHelloWorld")
    @ResponseWrapper(localName = "sayHelloWorldResponse", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.SayHelloWorldResponse")
    @Action(input = "http://service.soap.example.com/Calculator/sayHelloWorldRequest", output = "http://service.soap.example.com/Calculator/sayHelloWorldResponse")
    public String sayHelloWorld(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.example.soap.client.service.CalculatorData
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplyV2", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.MultiplyV2")
    @ResponseWrapper(localName = "multiplyV2Response", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.MultiplyV2Response")
    @Action(input = "http://service.soap.example.com/Calculator/multiplyV2Request", output = "http://service.soap.example.com/Calculator/multiplyV2Response")
    public CalculatorData multiplyV2(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://service.soap.example.com/", className = "com.example.soap.client.service.AddResponse")
    @Action(input = "http://service.soap.example.com/Calculator/addRequest", output = "http://service.soap.example.com/Calculator/addResponse")
    public double add(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        double arg1);

}