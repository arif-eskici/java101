/*
Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
*/

package ödev30;
import java.util.Scanner;

public class recursive_asalSayi {

    static void prime (int number, int i) {

        if (number == i) {
            System.out.println(number + " sayısı ASAL bir sayıdır!");
            return;
           } else if (number < 2) {
            System.out.println(number + " ASAL sayı değildir. 2'den küçük asal sayı yoktur!!");
            return;
            } else if (number % i == 0) {
            System.out.println(number + " sayısı ASAL bir sayı değildir!");
            return;
           }

        prime(number, i+1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.print("Lütfen bir sayı girin : ");
        int number = scan.nextInt();

        if (number < 0) {
            System.out.println("Asal sayılar negatif bir değer olamaz! Lütfen tekrar deneyin...");
        } else {
            prime(number, 2);
        }
    }
}
