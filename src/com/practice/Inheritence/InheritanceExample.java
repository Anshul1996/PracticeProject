package com.practice.Inheritence;

class A {
    int a, b;

    public void add(int a, int b) {
        System.out.println("Sum is ::" + (a + b));
    }
    public int Subtract(int a,int b){
        System.out.println("Sum is ::" + (a - b));
        return 0;
    }
}
class InheritanceExample extends A{
    public void sum(int a, int b) {
        add(a,b);
    }
    public static void main(String args[]){
        InheritanceExample b1 =new InheritanceExample();
        b1.sum(1,3);
        A a1=new A();
        a1.add(3,4);
    }
}


