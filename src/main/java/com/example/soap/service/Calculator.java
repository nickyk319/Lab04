package com.example.soap.service;
import com.example.soap.utils.CalculatorData;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * Interface for our Calculator web service
 */
@WebService
@SOAPBinding
public interface Calculator {
    @WebMethod
    String sayHelloWorld(String content);
    @WebMethod
    double add(double num1, double num2);
    @WebMethod
    double subtract(double num1, double num2);
    @WebMethod
    double multiply(double num1, double num2);
    @WebMethod
    CalculatorData multiplyV2(double num1, double num2);
}
