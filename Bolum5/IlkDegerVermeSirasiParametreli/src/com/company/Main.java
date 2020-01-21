package com.company;

class Insan {
    public Insan(int par) {
        System.out.println("Insan yapilandırıcısı   " + par);
    }
}

class ZekiInsan extends Insan {

    public ZekiInsan(int par) {
        super(par + 1);
        System.out.println("ZekiInsan yapilandırıcısı   " + par);
    }
}

class Hacker extends ZekiInsan {

    public Hacker(int par) {
        super(par + 1);
        System.out.println("Hacker yapilandırıcısı   " + par);

    }
}

public class Main {

    public static void main(String[] args) {
        Hacker hacker = new Hacker(5);
    }
}
