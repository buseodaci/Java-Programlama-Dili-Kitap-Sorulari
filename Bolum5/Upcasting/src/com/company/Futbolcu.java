package com.company;

/**
 * Her futbolcu bir sporcudur.Bu ifade bize, Sporcu sınıf içindeki  yordamların otomoatik olarak Futbolcu sınıfının
 * içerisinde olduğunu söyler, yani Sporcu sınıfına gönderilen her mesaj  rahatlıkla Futbolcu sınıfına da gönderilebilir.
 * Upcasting her zaman güvenlidir çünkü özel tipten genel tip daralma vardır.
 */
class KontrolMerkezi {
    public static void checkUp(Sporcu s) {
        s.calis();
    }
}

class Sporcu {
    public void calis() {
        System.out.println("Sporcu.calis()");
    }
}

public class Futbolcu extends Sporcu {

    public void calis() {
        System.out.println("Futbolcu.calis()");
    }

    public static void main(String[] args) {
        Sporcu sporcu = new Sporcu();
        Futbolcu futbolcu = new Futbolcu();
        KontrolMerkezi.checkUp(sporcu);
        KontrolMerkezi.checkUp(futbolcu);
    }
}
