package com.practice;
abstract class Abs{
    void absMethod1(){
        System.out.println("method1");
    }
    void absMethod2(){
        System.out.println("method2");
    }
     abstract void absMethod3();
}
public class AbstractExample extends Abs{
    public static void main(String args[]){
        AbstractExample abs1 =new AbstractExample();
        abs1.absMethod1();
        abs1.absMethod2();
    }
    @Override
    void absMethod2(){
        System.out.println("method3");
    }

    @Override
    void absMethod3() {

    }
}
