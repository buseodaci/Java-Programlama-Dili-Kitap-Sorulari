/***
 * Kapsüllenme; dışarıdaki bir uygulamanın bizim nesnemiz ile sadece ara birimler sayesinde iletişim kurması gerektiğini, ancak,
 * arkada asıl işi yapan esas kısmın gizlenmesi gerektiğini söyler.
 */
private class Makine {
    private int alinan = 0;
    private int geriDondurulen = 0;

    public int get() {
        return geriDondurulen;
    }

    public void set(int i) {
        this.alinan = i;
        calis();
    }

    private void calis() {
        for (int j = 0; j < alinan; j++) {
            System.out.println("Sonuc =" + j);
        }
        geriDondurulen = alinan * 2;
    }
}


class Main {
    public static void main(String[] args) {
        Makine makine = new Makine();
        makine.set(6);
        makine.get();
    }
}
