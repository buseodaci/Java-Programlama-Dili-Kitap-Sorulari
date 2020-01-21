package com.company;

/**
 * Ana sınıf içerisinde tanımlanmış bir yordamın, türetilen sınıflar içerisinde iptal edilmesi(override)dir.
 */
class Kitap {
    protected int sayfaSayisiOgren() {
        System.out.println("Kitap - sayfaSayisiOgren()");
        return 1000;
    }

    public double fiyatOgren() {
        System.out.println("Kitap - fiyatOgren()");
        return 50.0;
    }
}

class Roman extends Kitap {
    public int sayfaSayisiOgren() {
        System.out.println("Roman - sayfaSayisiOgren()");
        return 9000;
    }

    public double fiyatOgren() {
        System.out.println("Roman - fiyatOgren()");
        return 60.0;
    }
}

public class Main {
    public static void main(String[] args) {
        Roman roman = new Roman();
        roman.fiyatOgren();
        roman.sayfaSayisiOgren();
    }
}
