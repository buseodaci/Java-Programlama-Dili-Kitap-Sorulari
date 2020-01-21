package com.company;

/**
 * Abstract sınıflar new ile oluşturulmaz.Birleştirici rol oynarlar.
 * Abstract metodların gövdesi boştur, hiçbir iş yapmazlar.
 * En az 1 adet  abstract metod  bulundurmalı ve bu metod alt sınıflar tarafından override edilmek zorundadır.
 * Abstract sınıflar new ile doğrudan oluşturulamazlar.
 * Ana sınıfın içindeki bir metodun alt sınıflar tarafından override edilmesi şansa bırakılmak istenmiyorsa abstract
 * olarak tanımlanmalıdır.
 */

abstract class Calisan {
    public String pozisyon = "Calisan";

    public abstract void calis();   // abstract metod

    public void zamIste() {
        System.out.println("Calisan zamIste");
    }
}

class Mudur extends Calisan {

    public Mudur() {
        pozisyon = "Mudur";
    }

    @Override
    public void calis() {
        System.out.println("Mudur calisiyor.");
    }
}

class Programci extends Calisan {

    public Programci() {
        pozisyon = "Programci";
    }

    @Override
    public void calis() {
        System.out.println("Programci calisiyor.");
    }

    @Override
    public void zamIste() {
        System.out.println("Programci zam istiyor.");
    }
}

class Pazarlamaci extends Calisan {

    public Pazarlamaci() {
        pozisyon = "Pazarlamaci";
    }

    @Override
    public void calis() {
        System.out.println("Pazarlamaci calisiyor.");
    }
}

public class IsYeri {
    public static void mesaiBasla(Calisan[] calisan) {
        for (Calisan value : calisan) {
            value.calis();
        }
    }

    public static void main(String[] args) {
        Calisan[] calisan = new Calisan[3];
        calisan[0] = new Mudur();
        calisan[1] = new Pazarlamaci();
        calisan[2] = new Programci();
        mesaiBasla(calisan);
    }
}
