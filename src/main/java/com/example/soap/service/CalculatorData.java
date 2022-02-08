package com.example.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculatorData", propOrder = {
        "num1",
        "num2",
        "result",
        "serverMessage"
})
public class CalculatorData {
    @XmlElement(name = "num1")
    protected double num1;
    @XmlElement(name = "num2")
    protected double num2;
    @XmlElement(name = "result")
    protected double result;
    @XmlElement(name = "serverMessage")
    protected String serverMessage;



    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getServerMessage() {
        return serverMessage;
    }

    public void setServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }
}
