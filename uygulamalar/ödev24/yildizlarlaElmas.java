/*ÖDEV24:
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
*/

package ödev24;
import java.util.Scanner;
public class yildizlarlaElmas {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.print("Bir sayı girin : ");
        int n = inp.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= (n-i); j++ ) {

                System.out.print(" ");
            }

            for (int k = 1; k <= (2*i -1); k++) {

                System.out.print("*");
            }
            System.out.println(" ");

        }

        for (int i = 1; i <= n; i++) {

            for (int j = n; j >= (n-i); j--) {

                System.out.print(" ");
            }
            for (int k = 1; k <= (2*(n-i)-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }



    }
}
