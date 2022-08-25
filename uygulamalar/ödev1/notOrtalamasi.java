/* ÖDEV1:
Not Ortalaması Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Geçti" , küçük ise "Kaldı" yazsın.

Not : If ve Else kullanılmayacak...
 */

package ödev1;

// kullanıcıdan veri alabilmek için gereken Scanner sınıfını projemize dahil ettik.
import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {

        // değişkenleri oluşturduk.
        int matematik, fizik, kimya, turkce, tarih, muzik;

        // kullanıcıdan veri almak için gereken Scanner sınıfını tanımladık.
        Scanner input = new Scanner (System.in);

        // kullanıcıdan değerleri aldık.
        System.out.print("Matematik notunuz: ");
        matematik = input.nextInt();
        
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        // girilen değerlerin ortalamasını hesapladık.
        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ortalama = toplam / 6;

        // bulunan ortalamayı kullanıcıya gösterdik 
        System.out.println("Not ortalamanız : " + ortalama);

        // ortalamanın 60 altında ya da üzerinde olma koşuluna göre bilgi verdik.
        System.out.println(ortalama >= 60 ? "Geçtiniz :)" : "Kaldınız :(");
        
    }
}