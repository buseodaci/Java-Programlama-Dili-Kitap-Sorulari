import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Checked Exceptions: Java dilinde kod yazılırken meydana gelebilecek bir takım
 * exception türlerinin kod içerisinde zorunlu olarak belirtildiği exception türüdür.
 * Kodda Checked Exception varsa IDE sizi uyarıyor ve bu fırlatılan exception’ ı handle etmeniz yani yakalayıp gerekli
 * işlemi yapmanız gerektiğini söylüyor. İşte bu durumda ya exception’ ın fırlatıldığı satırı try-catch bloğu içine
 * alıyoruz ya da bir üst metoda throws ediyoruz.
 * */

public class CheckedException {
    public void readFile() {
        try {
            FileInputStream inputStream = new FileInputStream("test.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readAnotherFile() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("test.txt");
    }

    public static void main(String[] args) {
        CheckedException checkedException = new CheckedException();
        checkedException.readFile();
        try {
            checkedException.readAnotherFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
