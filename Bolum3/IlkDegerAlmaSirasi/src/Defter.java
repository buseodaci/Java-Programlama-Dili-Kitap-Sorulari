class Kagit {
    public Kagit(int i) {
        System.out.println("Kağıt (" + i + ") ");
    }
}

/***
 * Nesnelere ait global alanlara başlangıç değerleri yapılandırıcıdan önce verilir.
 */
public class Defter {

    Kagit k1 = new Kagit(1);

    public Defter() {
        System.out.println("Defter() yapılandırıcı ");
        k2 = new Kagit(33);
    }

    Kagit k2 = new Kagit(2);

    public void islemTamam() {
        System.out.println("İşlem Tamam");
    }

    Kagit k3 = new Kagit(3);

    public static void main(String[] args) {
        Defter d = new Defter();
        d.islemTamam();
    }
}
