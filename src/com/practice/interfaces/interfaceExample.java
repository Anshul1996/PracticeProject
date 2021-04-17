package com.practice.interfaces;

public interface interfaceExample {
    void method1();
    void method2();
    default void method3(){
        System.out.println("Method 3");
    }

}
class A implements interfaceExample{

    @Override
    public void method1() {

    }

    @Override
    public void method2() {

    }
}
