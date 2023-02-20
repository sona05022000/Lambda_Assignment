package com.lambdaAssignment;
public class Assignment4Q1 {
    interface ArithmeticOperation {
        double performOperation(int num1, int num2);
    }

    public  double addition(int num1, int num2) {
        ArithmeticOperation operation = (a, b) -> a + b;
        return operation.performOperation(num1, num2);
    }

    public double subtraction(int num1, int num2) {
        ArithmeticOperation operation = (a, b) -> a - b;
        return operation.performOperation(num1, num2);
    }

    public  double multiplication(int num1, int num2) {
        ArithmeticOperation operation = (a, b) -> a * b;
        return operation.performOperation(num1, num2);
    }

    public  double division(int num1, int num2) {
        ArithmeticOperation operation = (a, b) -> (double) a / b;
        return operation.performOperation(num1, num2);
    }

    public static void main(String[] args) {  
    	Assignment4Q1 obj = new Assignment4Q1();
        int num1 = 13, num2 = 5;

        System.out.println("Addition of " + num1 + " and " + num2 + " is " + obj.addition(num1, num2));
        System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + obj.subtraction(num1, num2));
        System.out.println("Multiplication of " + num1 + " and " + num2 + " is " +obj. multiplication(num1, num2));
        System.out.println("Division of " + num1 + " and " + num2 + " is " + obj.division(num1, num2));
    }
}
