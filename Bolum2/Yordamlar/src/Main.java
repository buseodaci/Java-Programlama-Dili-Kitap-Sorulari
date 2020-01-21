class Harf {
    char c;
}

public class Main {

    static void f(Harf h) {
        h.c = 'b';
    }

    static void h(int b) {
        b = 10;
    }

    public static void main(String[] args) {
        Harf x = new Harf();
        x.c = 'a';
        System.out.println("1: x.c= " + x.c);
        f(x);
        System.out.println("2: x.c= " + x.c);
        int d = 5;
        System.out.println("\n1: d= " + d);
        h(d);
        System.out.println("2: d= " + d);
        /**
         * Temel türler değerleri kendi üzerlerinde taşırlar. Yordamlara gönderilen parametreler yerel
         * değişkenler gibi çalışırlar.
         */
    }
}
