class Sayi {
    int i;
}

public class Main {

    public static void main(String[] args) {
        Sayi sayi1 = new Sayi();
        Sayi sayi2 = new Sayi();
        sayi1.i = 3;
        sayi2.i = 5;
        System.out.println("1:  sayi1 =" + sayi1.i + ", sayi2 =" + sayi2.i);
        sayi1 = sayi2; //sayi1 referansı artık sayi2 nin işaret ettiği nesneyi gösterecektir.
        System.out.println("2:  sayi1 =" + sayi1.i + ", sayi2 =" + sayi2.i);
        sayi1.i = 9;
        System.out.println("3:  sayi1 =" + sayi1.i + ", sayi2 =" + sayi2.i);
    }
}
