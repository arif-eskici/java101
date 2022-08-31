/*ÖDEV18: 
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/

package ödev18;

import java.util.Scanner;

public class sayilarinToplami {
    public static void main(String[] args) {
        int number, total = 0;

        Scanner sc = new Scanner (System.in);

        do {
            System.out.print("Sayı girin: ");
            number = sc.nextInt();
            if (number % 4 == 0) {
                total += number;
                System.out.println("Bulunan 4'ün katı olan sayı : " + number);
            }
        } while (number % 2 != 1);

        System.out.println("Tek sayı girişi yaptığınız için program sonlandırıldı!");
        System.out.println("Bulunan sayıların toplamı : " + total);
    }
}
