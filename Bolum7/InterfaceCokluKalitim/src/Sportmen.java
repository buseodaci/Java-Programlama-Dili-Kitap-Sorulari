/**
 * Peki biz ne zaman abstract ne zaman Interface kullanırız?
 * Abstract sınıfı eğer ki türetilen sınıf ile abstract sınıf arasında bir ilişki varsa kullanırız.(Yarasa bir Hayvandır)
 * Interface ile türetilen sınıflar arasında herhangi bir ilişki bulunmak zorunda olmadığı zamanlarda da Interface
 * kullanabiliriz.
 */

interface BuzUstundeKayabilme {
    public void buzUstundeKay();
}

interface SutAtabilme {
    public void sutAt();
}

// Interfacelere özel olarak bir sınıf 1'den fazla interface e rahatlıkla erişebilir.
public class Sportmen implements BuzUstundeKayabilme, SutAtabilme {
    @Override
    public void buzUstundeKay() {
        System.out.println("Sportmen buz üstünde kayıyor..");
    }

    @Override
    public void sutAt() {
        System.out.println("Sportmen sut atıyor..");
    }
}
