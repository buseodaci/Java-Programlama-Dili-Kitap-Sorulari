package com.company;

/**
 *Polimorfizm(Çok Biçimlilik) & Geç Bağlama bir elmanın 2 yarısı gibidir. Polimorfizimin olmadığı bir yerde geç bağlamadan söz edilemez.
 * Polimorfizm; hazirOl(Asker asker) metoduna baktığımız  zaman  asker referansı kendisine gelen 2(er,yuzbasi) farklı nesneye bağlanabilmesidir.
 * yani Asker tipindeki yerel asker değişkeni birçok şekle girmiş bulunmaktadır.
 * Geç Bağlama; Java'nın hangi nesnenin selamVer() metodunu çağıracağına  run time da karar vermesidir.
 *
 */
class Asker {
    public void selamVer() {
        System.out.println("Asker selam verdi.");
    }
}

class Er extends Asker {
    public void selamVer() {
        System.out.println("Er selam verdi.");
    }
}

class Yuzbasi extends Asker {
    public void selamVer() {
        System.out.println("Yuzbasi selam verdi.");
    }
}

class Albay extends Asker{
    public void selamVer(){
        System.out.println("Albay selam verdi.");
    }
}

class Yarbay extends Asker{
    public void selamVer() {
        System.out.println("Yarbay selam verdi.");
    }
}

public class Main {

    public static void hazirOl(Asker asker) { //asker gelen Er nesnesine bağlanmıştır.
        asker.selamVer();
    }

    public static void main(String[] args) {
        Asker asker = new Asker();
        Er er = new Er();
        Yuzbasi yuzbasi = new Yuzbasi();
        Albay albay=new Albay();
        Yarbay yarbay=new Yarbay();
        hazirOl(asker);
        hazirOl(er);
        hazirOl(yuzbasi);
        hazirOl(albay);
        hazirOl(yarbay);
    }
}
