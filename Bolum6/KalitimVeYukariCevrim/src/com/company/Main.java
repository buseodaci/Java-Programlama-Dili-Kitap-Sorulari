package com.company;

/**
 * Oluşturulan kumanda nesnesi XModel tv ye ait olduğu için YModel tv içerisinde bulunan teletext()'e erişemeyiz.
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
        XModel xModelKumanda = new YModel(); // Upcasting
        xModelKumanda.sesAc();
        xModelKumanda.sesKapa();
        xModelKumanda.kanalDegistir();
    }
}
