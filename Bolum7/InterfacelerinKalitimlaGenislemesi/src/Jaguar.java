interface Kosabilme {
    void kos();
}

interface Ziplayabilme{
    void zipla();
}

// Interface lere özel olarak bir interface 1'den fazla interfaceden extend edilebilir.
interface DahaHizliKosabilme extends Kosabilme, Ziplayabilme {
    void dahaHizliKos();
}

interface Avlanabilme extends DahaHizliKosabilme {
    void avlan();
}

class RoadRunner implements DahaHizliKosabilme {

    @Override
    public void kos() {
        System.out.println("Road Runner kosuyor..");
    }

    @Override
    public void dahaHizliKos() {
        System.out.println("Road Runner daha hızlı kosuyor..");
    }

    @Override
    public void zipla() {
        System.out.println("Road Runner zipladi..");
    }
}

public class Jaguar implements Avlanabilme,Ziplayabilme {

    @Override
    public void kos() {
        System.out.println("Jaguar kosuyor..");
    }

    @Override
    public void dahaHizliKos() {
        System.out.println("Jaguar daha hızlı kosuyor..");
    }

    @Override
    public void avlan() {
        System.out.println("Jaguar avlanıyor..");
    }

    @Override
    public void zipla() {
        System.out.println("Jaguar zipladi..");
    }
}
