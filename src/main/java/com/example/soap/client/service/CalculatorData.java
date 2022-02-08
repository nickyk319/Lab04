
package com.example.soap.client.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for calculatorData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calculatorData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="serverMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calculatorData", propOrder = {
    "num1",
    "num2",
    "result",
    "serverMessage"
})
public class CalculatorData {

    protected double num1;
    protected double num2;
    protected double result;
    protected String serverMessage;

    /**
     * Gets the value of the num1 property.
     * 
     */
    public double getNum1() {
        return num1;
    }

    /**
     * Sets the value of the num1 property.
     * 
     */
    public void setNum1(double value) {
        this.num1 = value;
    }

    /**
     * Gets the value of the num2 property.
     * 
     */
    public double getNum2() {
        return num2;
    }

    /**
     * Sets the value of the num2 property.
     * 
     */
    public void setNum2(double value) {
        this.num2 = value;
    }

    /**
     * Gets the value of the result property.
     * 
     */
    public double getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(double value) {
        this.result = value;
    }

    /**
     * Gets the value of the serverMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerMessage() {
        return serverMessage;
    }

    /**
     * Sets the value of the serverMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerMessage(String value) {
        this.serverMessage = value;
    }

}
