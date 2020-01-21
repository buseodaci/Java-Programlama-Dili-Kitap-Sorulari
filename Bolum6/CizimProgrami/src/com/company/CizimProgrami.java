package com.company;

/**
 * Eğer bir işlem değişik verilere ihtiyaç duyup aynı işi yapıyorsa, bu işlem abstract sınıf içinde tanımlanmalıdır.
 */
abstract class Cizim {
    public abstract void noktaCiz(int x, int y);

    public void cizgiCiz(int x1, int y1, int x2, int y2) {
        //noktaCiz();
    }
}

class CepTelefonuCizim extends Cizim {
    @Override
    public void noktaCiz(int x, int y) {

    }

    @Override
    public void cizgiCiz(int x1, int y1, int x2, int y2) {
        super.cizgiCiz(x1, y1, x2, y2);
    }
}

class MonitorCizim extends Cizim {
    @Override
    public void noktaCiz(int x, int y) {

    }
}

public class CizimProgrami {
    public void baslat(int x1, int y1, int x2, int y2) {
        Cizim cizim1 = new CepTelefonuCizim();
        cizim1.cizgiCiz(x1, y1, x2, y2);
        Cizim cizim2 = new MonitorCizim();
        cizim2.cizgiCiz(x1, y1, x2, y2);
    }

    public static void main(String[] args) {

    }
}
