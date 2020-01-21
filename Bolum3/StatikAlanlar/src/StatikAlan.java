/***
 * Sadece global alanlara statik özelliği verilebilir. Statik alanlar, bir sınıfa ait olan  alanlardır ve bu sınıfa ait
 * tüm nesneler için ortak bir bellek alanında bulunurlar, ayrıca sadece BİR KEZ İLK DEĞERLERİ atanır.
 */
public class StatikAlan {
    public static int x;
    public int y;

    public static void ekranaBas(StatikAlan statikAlan) {
        System.out.println("x=  " + statikAlan.x + ", y=  " + statikAlan.y);
    }

    public static void main(String[] args) {
        StatikAlan statikAlan1 = new StatikAlan();
        StatikAlan statikAlan2 = new StatikAlan();
        statikAlan1.y = 5;
        statikAlan2.y = 8;
        x = 9;
        ekranaBas(statikAlan1);
        ekranaBas(statikAlan2);
    }
}
