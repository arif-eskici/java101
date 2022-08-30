/*Ödev14:
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */

package ödev14;

import java.util.Scanner;
public class fiyatHesaplama {
    public static void main(String[] args) {

        int mesafe, yas, tip;
        double perKm = 0.10, discount = 0, discountCocuk = 0.50, discountGenc = 0.10, discountYasli = 0.30, discountTip = 0.20, yasİndirimi, indirimliTutar, tipİndirimi, normalTutar, toplamTutar;

        Scanner input = new Scanner (System.in);

        System.out.print("Gidilecek mesafeyi KM olarak giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        if(mesafe < 0 || yas < 0){
            System.out.println("Hatalı veri girdiniz! Sayfayı yeniden yükleyerek, mesafe ve yaş bilginizi negatif olmayacak şekilde girin...");
        } else {
            System.out.println("Yolculuğunuza ait almak istediğiniz uçak bileti için seçiminizi yapın:\nTek Yön için = 1\nGidiş-Dönüş için = 2");
        }

        tip = input.nextInt();
            if(tip < 1 || tip > 2){
                System.out.println("Hatalı seçim yaptınız! Lütfen sayfayı yeniden yükleyin ve tek yön için 1'i, gidiş-geliş için 2'yi seçin...");
            } else {
                if (yas < 12){
                    discount = discountCocuk;
                } else if (yas > 12 && yas < 24 ) {
                    discount = discountGenc;
                } else if (yas > 65) {
                    discount = discountYasli;
                }
        
                normalTutar = mesafe * perKm;
                yasİndirimi = normalTutar * discount;
                indirimliTutar = normalTutar - yasİndirimi;
        
                if (tip == 2) {
                    tipİndirimi = indirimliTutar * discountTip;
                    toplamTutar = (indirimliTutar - tipİndirimi) * 2;
                } else {
                    toplamTutar = indirimliTutar;
                }
        
                System.out.println("Girilen bilgiler şu şekildedir:");
                System.out.println("Yaşınız : " + yas + " / Gidilecek KM : " + mesafe + " / Yolculuk tipi : " + tip);
                System.out.println("Ödemeniz gereken Toplam Tutar : " + toplamTutar + " TL'dir.");
                System.out.println("İyi uçuşlar dileriz...");
            }

        


       
        
    }
}
