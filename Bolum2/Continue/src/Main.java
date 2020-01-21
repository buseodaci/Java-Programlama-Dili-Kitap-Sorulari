public class Main {

    /**
     * Continue; belirli durumlardaki döngü işlemlerinin atlanmasını sağlar.
     * Etiketsiz olanı en içteki döngüyü etkilerken, etiketli ise başına konulduğu döngüyü etkiler.
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println("i= " + i);
        }
        pas:
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 5; i++) {
                if (i == 3) {
                    continue pas;
                }
                System.out.println("i= " + i);
            }
        }
    }
}
