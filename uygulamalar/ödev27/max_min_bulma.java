/*
Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
*/

package ödev27;
import java.util.Scanner;
public class max_min_bulma {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        int counter = 0, max = 0, min = 0;

        System.out.print("Kaç tane sayı gireceksiniz : ");
        counter = inp.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayıyı giriniz : ");
            int number = inp.nextInt();

            if (i == 1){
                max = number;
                min = number;
            }
            if (number > max) {
                max = number;
            } 
            if (number < min){
                min = number;
            }

        }

        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);
    }
}
