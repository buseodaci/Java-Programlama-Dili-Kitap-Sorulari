public class Main {

    public static void main(String[] args) {
        /**
         * Etiketisiz break ifadeleri en içteki döngü ifadelerini sona erdirirken, etiketli döngü ifadeleri ise
         * etiket(label) hanfi döngünün başına konmuş ise o döngüyü sonlandırır.
         */
        for (int i = 0; i < 100; i++) {
            if (i == 9) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Döngüden çıktı.");

        kiril:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 3) {
                    break kiril;
                }
                System.out.println("j= " + j);
            }
            System.out.println("i= " + i);
        }
        System.out.println("Döngüden çıktı.");
    }
}
