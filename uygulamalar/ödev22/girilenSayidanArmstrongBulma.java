/*Ödev22:
Kullanıcının girdiği sayının armstrong olup olmadığını bulan kodu yazıyoruz.
*/

package ödev22;
import java.util.Scanner;
public class girilenSayidanArmstrongBulma {
    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in);

        System.out.print("İncelenmesini istediğiniz sayıyı girin : ");
        int number = scan.nextInt();;
        int stepNumber = 0, result = 0;
        int tempNumber = number;
        int stepPow, stepValue;

        
    // basamak sayısı yani step, sayıyı her seferinde 10'a bölerek yapılır, number 0'a eşit oluncaya kadar kaç işlem olursa o step sayısıdır.
    // 2621 / 10 = 262  --> 1
    // 262 / 10 = 26    --> 2
    // 26 / 10 = 2      --> 3
    // 2 / 10 = 0       --> 4 = stepNumber

    // 2621 = (2^4) + (6^4) + (2^4) + (1^4)
    // her rakamın basamak sayısı kadar kuvvetini alıp topla sonuç sayıya eşitse ARMSTRONG dur!


        while (tempNumber != 0) {
            tempNumber /= 10;
            stepNumber ++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            stepValue = tempNumber % 10;
            stepPow = 1;
            for (int i = 1; i <= stepNumber; i++) {
                stepPow *= stepValue;
            }
            result += stepPow;
            tempNumber /= 10;
        }
        
       
        if (result == number) {
            System.out.println(number + " sayısı bir Armstrong sayıdır!");
        } else {
            System.out.println(number + " sayısı bir Armstrong sayısı değildir!");
        }

        
    }
}
