package com.practice;

public class Singleton {
    static Singleton obj;
    Singleton(){}
    public static Singleton getInstance(){
        if(obj == null){
            obj=new Singleton();
        }
        return obj;
    }

}
