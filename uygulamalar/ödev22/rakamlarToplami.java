/*ÖDEV22:
Kullanıcının girdiği sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */

package ödev22;

import java.util.Scanner;
public class rakamlarToplami {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int number, stepValue, result = 0;

        System.out.print("Pozitif bir sayı girin : ");
        number = input.nextInt();

        if (number < 0) {
            System.out.println("Hatalı giriş yaptınız! Lütfen sadece pozitif bir sayı girin...");
        } else {
            while (number != 0) {
                stepValue = number % 10;
                result += stepValue;
                number /= 10;
            }

            System.out.println("Girdiğiniz sayının rakamlar toplamı => " + result);

        }
 
    }
}
