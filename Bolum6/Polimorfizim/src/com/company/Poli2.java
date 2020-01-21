package com.company;

/**
 * Geç Bağlama; Dinamik Bağlama veya çalışma anında bağlanma olarak da adlandırılır.
 */
class Hayvan {
    public void avYakala() {
        System.out.println("Hayvan avYakala");
    }
}

class Kartal extends Hayvan {
    public void avYakala() {
        System.out.println("Kartal avYakala");
    }
}

class Timsah extends Hayvan {
    public void avYakala() {
        System.out.println("Timsah avYakala");
    }
}

public class Poli2 {
    public static Hayvan rastgeleSec() {
        Hayvan h = null;
        int sec = ((int) (Math.random() * 3));
        if (sec == 0) {
            h = new Hayvan();
        } else if (sec == 1) {
            h = new Kartal();
        } else if (sec == 2) {
            h = new Timsah();
        }
        return h;
    }

    public static void main(String[] args) {
        Hayvan[] h = new Hayvan[3];
        for (int i = 0; i < 3; i++) {
            h[i] = rastgeleSec();
        }
        for (int i = 0; i < 3; i++) {
            h[i].avYakala();
        }
    }
}
