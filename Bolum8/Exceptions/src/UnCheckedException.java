import java.util.ArrayList;

/**
 * Kodda geliştirme esnasında hiç bir hata ile karşılaşılmaz.
 * Fakat kodu çalıştırdığımızda kod, hata fırlatır.
 */
public class UnCheckedException {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("X"); //0.
        list.add("Y"); //1.
        list.add("Z"); //2.
        String  ucuncu=list.get(3);
        System.out.println(ucuncu);
        // Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
    }
}
