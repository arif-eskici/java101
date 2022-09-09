/*ÖDEV44:
Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.(kullanıcının 5 tahmin hakkı olacak şekilde)
*/

package ödev44;

import java.util.Scanner;
import java.util.Random;

public class sayiTahminOyunu {
    public static void main(String[] args) {
        
        Random inp = new Random();
        int number = inp.nextInt(100);
        System.out.println("Kullanıcının tahminlerle bulmaya çalışacağı sayı => "+number);
        // int number = (int)(Math.random() * 100);

        Scanner input = new Scanner (System.in);
        int selected;
        int [] wrongAnswer = new int [5];

        for (int i = 1; i <= 5; i++) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Tahminler 0-100 arasındaki sayılardan yapılmalıdır!");
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler sayıyı doğru tahmin ettiniz ! => " +number);
                break;
            } else {
                System.out.println("Üzgünüm, Yanlış tahminde bulundunuz !!!");
                if (selected > number) {
                    System.out.println("İpucu : " +selected+ " sayısı gizli sayıdan büyüktür...");
                }else {
                    System.out.println("İpucu : " +selected+ " sayısı gizli sayıdan küçüktür...");
                }
                System.out.println("Kalan tahmin hakkınız : " + (5-i));
            }
        }

    }
}
