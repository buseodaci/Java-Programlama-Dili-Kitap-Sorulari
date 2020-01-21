package com.company;

/**
 * Final  anahtar kelimesi değiştirilememezliği simgeler.Global olan  alanlara, metodlara ve sınıflara
 * final özelliği uygulanabilir.
 * Global (statik) alan+final= sabit değer (constant)
 * Metodlara gönderilen parametre değerlerinin değişmemesini istiyorsak final yapabiliriz.
 * Final yapılan metodlar override edilemez.
 * Final sınıflarda türetilme yapılamaz.(Kompozisyon yöntemi ile o sınıfı kullanabiliriz.)
 */

class Kutu {
    int i = 0;
}

public class FinalOrnek {
    final int xSabit = 34;
    final static int ySabit = 35;
    final int aSabit = (int) Math.random();
    final Kutu kutu = new Kutu();
    final int test;
    static final int test2;

    static {
        test2 = 3;
    }

    public FinalOrnek() {
        test = 0; //final değerlerin kullanmadan önce başlangıç değerleri tanımlanmamışsa constructor içinde verilmeli.
    }

    public int topla(final int a, final int b) {
        // a=5;
        return a + b;
    }

    public static void main(String[] args) {

        FinalOrnek finalOrnek = new FinalOrnek();
        finalOrnek.kutu.i = 12;
        System.out.println("finalOrnek.kutu.i = " + finalOrnek.kutu.i);
        System.out.println("finalOrnek.xSabit = " + finalOrnek.xSabit);
        System.out.println("finalOrnek.ySabit = " + finalOrnek.ySabit);
        System.out.println("finalOrnek.aSabit = " + finalOrnek.aSabit);
        finalOrnek.topla(4, 5);
    }
}

final class Televizyon {
    public void kanalBul() {

    }
}

class Ev {
    int odaSayisi = 5;
    Televizyon televizyon = new Televizyon();

    public static void main(String[] args) {
        Ev ev = new Ev();
        ev.televizyon.kanalBul();
    }
}
