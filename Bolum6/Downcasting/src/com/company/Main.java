package com.company;

/**
 * Downcasting, upcasting'in tam tersidir.Daha genel bir tipten daha özellikli bir tipe doğru geçiş demektir
 * ve bu TEHLİKELİDİR.Çünkü çevrilmeye çalışılan daha özellikli tipe doğru çevrim esnasında sorun çıkma ihtimali
 * yüksektir.
 * Downcasting yaparken hangi tipe doğru çevrim yapılacağı belirtilmek zorundadır.
 * Upcastingde böyle bir kural yoktu.
 */
class XModel {
    public void sesAc() {
        System.out.println("XModel tv sesAc()");
    }

    public void sesKapa() {
        System.out.println("XModel tv sesKapa()");
    }

    public void kanalDegistir() {
        System.out.println("XModel tv kanalDegistir()");
    }
}

class YModel extends XModel {
    @Override
    public void sesAc() {
        System.out.println("YModel tv sesAc()");
    }

    @Override
    public void sesKapa() {
        System.out.println("YModel tv sesKapa()");
    }

    @Override
    public void kanalDegistir() {
        System.out.println("YModel tv kanalDegistir()");
    }

    void teletext() {
        System.out.println("YModel teletext()");
    }
}

public class Main {
    public static void main(String[] args) {
        Object[] obj = new Object[2];
        obj[0] = new XModel(); // Upcasting
        obj[1] = new YModel();
        // Elemanları eski hallerine sokmak için downcasting kullanıyoruz.
        for (int i = 0; i < obj.length; i++) {
            // Çalışma anında yanlış bir tipe çevrimden korunmak için instanceof 'u kullanabiliriz.
            // obje tiplerini kontrol ederek hata olasılığını en aza indirilir.
            if (obj[i] instanceof XModel) {
                XModel xModelKumanda = (XModel) obj[i];
                xModelKumanda.sesAc();
                xModelKumanda.sesKapa();
                xModelKumanda.kanalDegistir();
                System.out.println("-----------------------------");
            } else {
                YModel yModelKumanda = (YModel) obj[i];
                yModelKumanda.sesAc();
                yModelKumanda.sesKapa();
                yModelKumanda.kanalDegistir();
                yModelKumanda.teletext();
                System.out.println("-----------------------------");
            }
        }
    }
}
