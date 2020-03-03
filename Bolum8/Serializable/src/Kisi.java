import java.io.*;

/**
 * Serileştirme işlemi sayesinde dosyadaki verilerin tipleri korunduğu için JVM bunu anlayarak başka bir işlem yapmadan
 * gerekli olan değerleri değişkenlerine atadı ve sonucu bu Ad, Soyad şeklinde gösterdi.
 */
public class Kisi implements Serializable {
    private String ad;
    private String soyad;

    public Kisi() {
    }

    public Kisi(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                '}';
    }

    public static void yaz(){
        try{
            Kisi kisi=new Kisi("Buse","Odacı");
            FileOutputStream dosya=new FileOutputStream(".\\test.txt");
            ObjectOutputStream yazdir=new ObjectOutputStream(dosya);
            yazdir.writeObject(kisi);
            yazdir.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void oku(){
        try {
            FileInputStream dosya = new FileInputStream(".\\test.txt");
            ObjectInputStream oku = new ObjectInputStream(dosya);
            Kisi kisi = (Kisi) oku.readObject();
            System.out.println(kisi.toString());
            oku.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
     Kisi.yaz();
     Kisi.oku();
    }
}
