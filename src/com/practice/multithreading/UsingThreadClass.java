package com.practice.multithreading;

public class UsingThreadClass extends Thread{
    //
    public void run(){
        try {
            System.out.println("Thread is ::"+Thread.currentThread().getId()+"::"+Thread.currentThread().getName());
        }catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
