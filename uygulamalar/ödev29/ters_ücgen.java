/*
Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
*/

package ödev29;
import java.util.Scanner;
public class ters_ücgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int number;

        System.out.print("Satır sayısını girin : ");
        number = scan.nextInt();

// aşağıdan yukarıya tasarlanmış hali:

        for (int i = 1; i <= number; i++) {
            for (int j=0; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*(number-i+1)-1); k++ ) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

/* yukarıdan aşağıya tasarlanmış hali :

        for (int i = number; i >= 1; i--) {
            for (int j = 1; j <= number-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
*/
    }
}
