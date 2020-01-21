package com.company;

/**
 * Kalıtım; bir sınıftan diğer sınıfın türemesidir.
 * Oluşturduğumuz her yeni sınıf otomatik  ve gizli olarak Object sınıfından türer.
 */
public class Kedi {
    protected int ayakSayisi = 4;

    public void yakalaAv() {
        System.out.println("Kedi sınıfı av yakaladı");
    }

    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        kedi.yakalaAv();
    }
}

class Kaplan extends Kedi {
    public static void main(String[] args) {
        Kaplan kaplan = new Kaplan();
        kaplan.yakalaAv();
        System.out.println("ayak sayısı = " + kaplan.ayakSayisi);
    }
}
