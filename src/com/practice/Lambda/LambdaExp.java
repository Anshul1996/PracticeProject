package com.practice.Lambda;

public class LambdaExp {
    public static void main(String args[]) {
        testLambda testLambada1 = () -> System.out.print("Hello lambda");
        greeting gt = new greeting();
        gt.greet(testLambada1);
    }
}