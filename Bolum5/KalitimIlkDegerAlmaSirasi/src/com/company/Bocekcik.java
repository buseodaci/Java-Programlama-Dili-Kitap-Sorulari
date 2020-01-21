package com.company;

/**
 * Değer verme işlemi yukarıdaki sınıftan başlar ve türetilmiş sınıflara doğru devam eder.
 * 1-) Statik olan global alanlara değerler sırasıyla verilir.
 * 2-) main metodu çalışır.
 * 3-)Bocekcik nesnesi oluşturulur. Bu  oluşturma sırasında öncelikle  en yukarıdaki sınıfa(Bocek)  ait statik olmayan
 * alanlara ilk değerleri verilir ve yapılandırıcısı çağrılır.
 * 4-)Bocekcik sınıfı içindeki statik olmayan alanlara ilk değerleri verilir ve yapılandırıcısı çağrılır.
 */

class Bocek {
    int a = 10;
    int b;

    Bocek() {
        ekranaBas("a = " + a + ", b= " + b);
        b = 17;
    }

    static int x1 = ekranaBas("static Bocek.x1 ilk deger verildi");

    static int ekranaBas(String s) {
        System.out.println(s);
        return 18;
    }
}

public class Bocekcik extends Bocek {
    int k = ekranaBas("Bocekcik.k ilk deger verildi");

    Bocekcik() {
        ekranaBas("k =" + k);
        ekranaBas("b =" + b);
    }

    static int x2 = ekranaBas("static Bocekcik.x2 ilk deger verildi.");

    public static void main(String[] args) {
        ekranaBas("Bocekcik - basla..");
        Bocekcik b = new Bocekcik();
    }
}
