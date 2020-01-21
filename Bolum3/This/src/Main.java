class Tarih {
    int gun, ay, yil;

    public void gunEkle(int gun) {
        this.gun += gun;
    }

    public void gunEkranaBas() {
        System.out.println("Gun: " + gun);
    }
}

class Yumurta {
    int toplamYumurtaSayisi;

    Yumurta sepeteKoy() {
        toplamYumurtaSayisi++;
        return this;
    }

    public void goster() {
        System.out.println("Toplam yumurta sayısı = " + toplamYumurtaSayisi);
    }
}

/***
 * This anahtar sözcüğü içinde bulunulan nesneye ait referans döndürür, bu sayede nesneye ait global alanlara
 * erişilebilme fırsatı bulunur.
 */

public class Main {
    public static void main(String[] args) {
        Tarih tarih = new Tarih();
        tarih.gunEkle(7);
        tarih.gunEkle(4);
        tarih.gunEkranaBas();
        tarih.gunEkle(5);
        tarih.gunEkranaBas();
        Yumurta yumurta = new Yumurta();
        yumurta.sepeteKoy().sepeteKoy().sepeteKoy().goster();
    }
}
