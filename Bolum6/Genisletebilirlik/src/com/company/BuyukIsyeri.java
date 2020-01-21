package com.company;

/**
 * Genişletebilirlik; hali hazırdaki hiyerarşiyi kalıtım yoluyla genişletmedir.
 */
class Calisan {
    String pozisyon = "Calisan";

    public void calis() {
    }
}

class Mudur extends Calisan {
    Mudur() {
        pozisyon = "Mudur";
    }

    @Override
    public void calis() {
        System.out.println("Mudur çalışıyor.");
    }
}

class GenelMudur extends Mudur {
    GenelMudur() {
        pozisyon = "GenelMudur";
    }

    @Override
    public void calis() {
        System.out.println("GenelMudur çalışıyor.");
    }

    public void toplantiYonet() {
        System.out.println("GenelMudur toplanti yonetiyor.");
    }
}

class Programci extends Calisan {
    Programci() {
        pozisyon = "Programci";
    }

    @Override
    public void calis() {
        System.out.println("Programci çalışıyor.");
    }
}

class AnalizProgramci extends Programci {
    AnalizProgramci() {
        pozisyon = "AnalizProgramci";
    }

    public void analizYap() {
        System.out.println("Analiz yapılıyor.");
    }
}


class SistemProgramci extends Programci {
    SistemProgramci() {
        pozisyon = "SistemProgramci";
    }

    public void sistemIncele() {
        System.out.println("Sistem inceleniyor.");
    }
}


class Pazarlamaci extends Calisan {
    Pazarlamaci() {
        pozisyon = "Pazarlamaci";
    }

    @Override
    public void calis() {
        System.out.println("Pazarlamaci çalışıyor.");
    }
}

class Sekreter extends Calisan {
    Sekreter() {
        pozisyon = "Sekreter";
    }

    @Override
    public void calis() {
        System.out.println("Sekreter çalışıyor.");
    }
}

public class BuyukIsyeri {
    public static void mesaiBasla(Calisan[] calisans) {
        for (int i = 0; i < calisans.length; i++) {
            calisans[i].calis();
        }
    }

    public static void main(String[] args) {
        Calisan calisan[] = new Calisan[7];
        calisan[0] = new Calisan();
        calisan[1] = new Mudur();
        calisan[2] = new Programci();
        calisan[3] = new Pazarlamaci();
        calisan[4] = new GenelMudur();
        calisan[5] = new AnalizProgramci();
        calisan[6] = new SistemProgramci();
        mesaiBasla(calisan);
    }
}
