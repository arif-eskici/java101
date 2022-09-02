/*ÖDEV28:
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
*/

package ödev28;
import java.util.Scanner;
public class mükemmel_sayi {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int number; 
        int result = 0;

        System.out.print("Bir sayı girin : ");
        number = input.nextInt();

        if (number < 0) {
            System.out.println("Lütfen pozitif bir sayı girin...");
        } else {
            for (int i = 1; i < number; i++) {

                if (number % i == 0) {
                    System.out.print(i + " / ");
                    result += i;
                }
            }
            System.out.print(" => kalansız bölen sayılar toplamı : " + result +"\n");

            if (result == number) {
                System.out.println("SONUÇ : " + number + " sayısı Mükemmel Sayıdır!");
            } else {
                System.out.println("SONUÇ : " + number + " sayısı Mükemmel sayı değildir!!");
            }
        } 

    }
}
