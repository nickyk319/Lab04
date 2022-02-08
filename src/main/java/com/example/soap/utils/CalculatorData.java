package com.example.soap.utils;

public class CalculatorData {
    public double num1;
    public double num2;
    public double result;
    public String serverMessage;

    public CalculatorData(){}

    public CalculatorData(double num1, double num2, double result, String serverMessage) {
        this.num1 = num1;
        this.num2 = num2;
        this.result = result;
        this.serverMessage = serverMessage;
    }

    public double GetNum1() {
        return num1;
    }

    public void SetNum1(double num1) {
        this.num1 = num1;
    }

    public double GetNum2() {
        return num2;
    }

    public void SetNum2(double num2) {
        this.num2 = num2;
    }

    public double GetResult() {
        return result;
    }

    public void SetResult(double result) {
        this.result = result;
    }

    public String GetServerMessage() {
        return serverMessage;
    }

    public void SetServerMessage(String serverMessage) {
        this.serverMessage = serverMessage;
    }
}
