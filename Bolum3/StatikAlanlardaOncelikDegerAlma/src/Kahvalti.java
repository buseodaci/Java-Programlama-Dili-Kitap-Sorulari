class Peynir {
    public Peynir(int i, String tur) {
        System.out.println("Peynir (" + i + ") -->" + tur);
    }
}

class Tabak {
    public Tabak(int i, String tur) {
        System.out.println("Tabak (" + i + ") -->" + tur);
    }

    static Peynir p1 = new Peynir(1, "statik alan");
    Peynir p2 = new Peynir(2, "statik-olmayan alan");
}

class Catal {
    public Catal(int i, String tur) {
        System.out.println("Catal (" + i + ") -->" + tur);
    }
}

/***
 * Statik alanlar sınıfa ait olan alanlardır ve statik olmayan alanlara(nesne alanları) göre başlangıç
 * değerlerini daha önce alırlar.
 */
public class Kahvalti {

    static Catal c1 = new Catal(1, "static alan");

    public Kahvalti() {
        System.out.println("Kahvalti() yapilandırıcı");
    }

    Tabak t1 = new Tabak(1, "static-olmayan alan");

    public void islemTamam() {
        System.out.println("Islem tamam");
    }

    static Catal c2 = new Catal(2, "static alan");

    public static void main(String[] args) {
        Kahvalti kahvalti = new Kahvalti();
        kahvalti.islemTamam();
    }

    static Tabak t4 = new Tabak(4, "static alan");
    static Tabak t5 = new Tabak(5, "static alan");
}
