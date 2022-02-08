package com.example.soap.service;
import com.example.soap.utils.CalculatorData;
import javax.jws.WebService;

/**
 * This class holds the implementation of the methods of our SOAP web service
 */
@WebService(endpointInterface = "com.example.soap.service.Calculator")
public class CalculatorImpl implements Calculator {

	/**
	 * Prints a simple message with input from the client.
	 * @param content
	 * @return
	 */
	@Override
	public String sayHelloWorld(String content) {
		return "Hello " + content + "!";
	}

	@Override
	public double add(double num1, double num2){
		return num1 + num2;
	}

	@Override
	public double subtract(double num1, double num2) {
		return num1 - num2;
	}

	@Override
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}

	@Override
	public CalculatorData multiplyV2(double num1, double num2){
		double result = num1 * num2;
		String message = "The number " + num1 + " multiply by " + num2 + " equals to " + result;
		return new CalculatorData(num1, num2, result, message);
	}
}