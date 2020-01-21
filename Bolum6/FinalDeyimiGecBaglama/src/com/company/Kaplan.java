package com.company;

/**
 * Bir yordam override edilemezse o zaman geç bağlama özelliği de ortadan kalkar.(verimlilik artar)
 * Buradaki geç bağlama olayı verimliliğe zarar verdiği için yakalaAv() final yapılarak geç bağlama özelliğini
 * kapatmış oluyoruz.
 */
class Kedi {
    public final void yakalaAv() {
        System.out.println("Kedi sinifi av yakaladi.");
    }
}

public class Kaplan extends Kedi {
   /* public void yakalaAv() {
        System.out.println("Kaplan sinifi av yakaladi.");
    }*/

    public static void goster(Kedi kedi) {
        kedi.yakalaAv();
    }

    public static void main(String[] args) {
        Kedi kedi = new Kedi();
        Kaplan kaplan = new Kaplan();
        goster(kedi);
        goster(kaplan);
    }
}
