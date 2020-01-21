package com.company;

/**
 * Daha önceden hazırlanmış ve doğruluğu kanıtlanmış olan sınıfların tekrar kullanılmı için 2 yöntem vardır:
 * 1: Kompozisyon
 * 2: Kalıtım
 */

class Meyva {
    String renk;
}

class Elma {
    Meyva meyva = new Meyva(); //Meyva sınıfını doğrudan Elma sınıfı içinde tanımlayarak,
    // Meyva sınıfının içerisindeki erişilebilir olan özellikleri kullanabilir hale getirdik.
}

class Motor {
    private static int motorGucu = 3600;

    public void calis() {
        System.out.println("Motor çalışıyor.");
    }

    public void dur() {
        System.out.println("Motor durdu.");
    }
}

class AileArabasi {
    private Motor motor = new Motor();

    public void hareketEt() {
        motor.calis();
        System.out.println("Aile arabası çalıştı.");
    }

    public void dur() {
        motor.dur();
        System.out.println("Aile arabası durdu.");
    }
}

public class Kompozisyon {

    public static void main(String[] args) {
        AileArabasi aileArabasi = new AileArabasi();
        aileArabasi.hareketEt();
        aileArabasi.dur();
    }
}
