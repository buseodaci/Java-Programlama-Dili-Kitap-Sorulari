package com.company;

class A {
    public A(int a) {
        System.out.println("Selam ben A sınıfı.."+a);
    }
    public final void ekranaBas(){
        System.out.println("Ben A");
    }
}

class B extends A {
    public B(int b) {
        super(b);
        System.out.println("Selam ben B sınıfı.."+b);
    }
}

class C extends B {
    public C(int c) {
        super(c);
        System.out.println("Selam ben C sınıfı.."+c);
    }
}

public class Main {
    public static void main(String[] args) {
        C c = new C(6);
        c.ekranaBas();
        B b=new B(7);
        b.ekranaBas();
    }
}
