/*ÖDEV19:
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/

package ödev19;

import java.util.Scanner;

public class sayininÜssünüBulma {
    public static void main(String[] args) {

        int number, i;
        Scanner sc = new Scanner (System.in);

        System.out.print("Hesaplanması istenen sınır sayıyı girin: ");
        number = sc.nextInt();

        System.out.println(number +" sayısına kadar olan 4'ün kuvvetleri : ");
        for (i = 1; i <= number; i*=4) {
            System.out.print(i + " - ");
        }

        System.out.println("\n"+ number + " sayısına kadar olan 5'in kuvvetleri : ");
        for (i = 1; i <= number; i*=5) {
            System.out.print(i + " - ");
        }
    }
}
