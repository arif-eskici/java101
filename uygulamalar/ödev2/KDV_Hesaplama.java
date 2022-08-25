package ödev2;

// kullanıcıdan veri alabilmek için gereken Scanner sınıfını projemize dahil ettik.
import java.util.Scanner;

public class KDV_Hesaplama {
    public static void main(String[] args) {

        // kullanıcıdan veri almak için gereken Scanner sınıfını tanımladık.
        Scanner input = new Scanner (System.in);

        // değişkenleri oluşturduk.
        double fiyat, kdvOran1=0.18, kdvOran2=0.08, kdvliTutar1, kdvliTutar2;

        // kullanıcıdan fiyat bilgisini aldık.
        System.out.print("Fiyatı giriniz: ");
        fiyat = input.nextInt();

        // farklı kdv oranlarına göre oluşacak fiyatları hesapladık.
        kdvliTutar1 = fiyat +  (fiyat * kdvOran1);
        kdvliTutar2 = fiyat + (fiyat  * kdvOran2);

        // girilen fiyat 1000 den küçük yada büyük olmsına göre oluşan kdvli fiyatları ekrana yazdırdık.
        System.out.println(fiyat <= 1000 ? "KDV'li fiyat: " + kdvliTutar1 : "KDV'li fiyat: " + kdvliTutar2  );
    }
}