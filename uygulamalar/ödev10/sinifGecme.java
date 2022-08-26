/*ÖDEV10:
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/

package ödev10;

import java.util.Scanner;

public class sinifGecme {
    public static void main(String[] args) {
        
        int mat, turkce, fizik, kimya, muzik, toplamNot=0, toplamDersSayisi=0;
        

        Scanner input = new Scanner(System.in);

        System.out.print("Matemetik notunuz : ");
        mat = input.nextInt();
        if(!(mat <= 0 || mat > 100)){
            toplamDersSayisi++;
            toplamNot += mat;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if(!(fizik <= 0 || fizik > 100)){
            toplamDersSayisi++;
            toplamNot += fizik;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if(!(kimya <= 0 || kimya > 100)){
            toplamDersSayisi++;
            toplamNot += kimya;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if(!(turkce <= 0 || turkce > 100)){
            toplamDersSayisi++;
            toplamNot += turkce;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if(!(muzik <= 0 || muzik > 100)){
            toplamDersSayisi++;
            toplamNot += muzik;
        }

        double ort = toplamNot / toplamDersSayisi;

        if(ort >= 55){
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        } else {
            System.out.println("Üzgünüm, sınıfta kaldınız! Seneye tekrar görüşmek üzere...");
        }

        System.out.println("Ortalamanız : "+ ort);


    }
    
}
