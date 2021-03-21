package com.practice.multithreading;

public class UsingRunnable implements Runnable{
    public void run(){
        try {
            System.out.println("Thread is ::" + Thread.currentThread().getId() + "::" + Thread.currentThread().getName());
        }catch(Exception e){
            System.out.print("Exception is raised");
        }
    }
}
