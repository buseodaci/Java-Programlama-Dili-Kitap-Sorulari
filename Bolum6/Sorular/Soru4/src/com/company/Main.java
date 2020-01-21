package com.company;

class Radyo {
    public void sesAc() {
        System.out.println("Radyo sesAc()");
    }

    public void sesKapat() {
        System.out.println("Radyo sesKapat()");
    }

    public void frekansAra() {
        System.out.println("Radyo frekansAra()");
    }
}

class GelismisRadyo extends Radyo {
    @Override
    public void sesAc() {
        System.out.println("GelismisRadyo sesAc()");
    }

    @Override
    public void sesKapat() {
        System.out.println("GelismisRadyo sesKapat()");
    }

    @Override
    public void frekansAra() {
        System.out.println("GelismisRadyo frekansAra()");
    }
}

public class Main {

    public static void main(String[] args) {
        Object object[]=new Object[2];
        object[0]=new Radyo();
        object[1]=new GelismisRadyo();
        for(int i=0;i<object.length;i++){
            Radyo gelismisRadyo= (Radyo) object[i];
        }
    }
}
