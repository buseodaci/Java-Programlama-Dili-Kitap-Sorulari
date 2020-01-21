class Kedi {
    public void beslen() {
        System.out.println("Kedi beslendi.");
    }

    public void tirmala() {
        System.out.println("Kedi tirmaladi.");
    }
}

class Kaplan extends Kedi {
    public void parcala() {
        System.out.println("Kaplan parçaladi.");
    }
}

public class Soru7 {
    public static void main(String[] args) {
        Kedi kedi = new Kaplan();
        kedi.beslen();
        kedi.beslen();
    }
}
