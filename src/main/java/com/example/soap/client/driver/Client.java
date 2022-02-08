package com.example.soap.client.driver;

import com.example.soap.client.service.*;

public class Client {
    public static void main(String[] args) {
        CalculatorImplService service = new CalculatorImplService();
        Calculator port = service.getCalculatorImplPort();
        String result = port.sayHelloWorld("World");
        System.out.println(result);
        CalculatorData calculator1 = port.multiplyV2(3, 4);
        double resAdd = port.add(1, 2);
        System.out.println(calculator1.getServerMessage());
        System.out.println(resAdd);

    }
}
