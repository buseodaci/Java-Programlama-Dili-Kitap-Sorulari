package com.company;

abstract class Sporcu {
    abstract void calis();

    public Sporcu() {
        System.out.println("calis() çağrılmadan önce.");
        calis(); //Futbolcu sınıfındaki calis() metodu sınıfın constructorından bile önce çağrılıyor. İstenmeyen durum..
        System.out.println("calis() çağrıldıktan sonra.");
    }
}

class Futbolcu extends Sporcu {
    int antremanSayisi = 4;

    @Override
    void calis() {
        System.out.println("Futbolcu calis() = " + antremanSayisi);
    }

    public Futbolcu() {
        System.out.println("Futbolcu yapilandiricisi");
        calis();
    }
}

public class Spor {
    public static void main(String[] args) {
        Futbolcu futbolcu = new Futbolcu();
    }
}
