class MuzikDosyasi {
    String tur = "Müzik Dosyası";
}

class ResimDosyasi {
    String tur = "Resim Dosyası";
}

class TextDosyasi {
    String tur = "Text Dosyası";
}

/****
 * Eğer ki biz oluşturduğumuz classa bir constructor yazarsak java varsayılan constructorı eklemeyecektir.
 */
class SvgDosyasi{
    String tur = "SVG Dosyası";
    SvgDosyasi(String filePath){
        System.out.println(filePath);
    }
}

public class Main {

    public void dosyaAc(MuzikDosyasi md) {
        System.out.println(md.tur + " açıldı.");
    }

    public void dosyaAc(ResimDosyasi rd) {
        System.out.println(rd.tur + " açıldı.");
    }

    public void dosyaAc(TextDosyasi td) {
        System.out.println(td.tur + " açıldı.");
    }

    public static void main(String[] args) {
        Main main = new Main();
        MuzikDosyasi muzikDosyasi = new MuzikDosyasi();
        ResimDosyasi resimDosyasi = new ResimDosyasi();
        TextDosyasi textDosyasi = new TextDosyasi();
        SvgDosyasi svgDosyasi=new SvgDosyasi("");
        main.dosyaAc(muzikDosyasi);
        main.dosyaAc(resimDosyasi);
        main.dosyaAc(textDosyasi);
    }
}
