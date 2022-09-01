/*ÖDEV23:
Java ile girilen sayının harmonik serisini bulan program yazacağız.
Örnek : n=4 için;
 (1/1) + (1/2) + (1/3) + (1/4)
*/

package ödev23;
import java.util.Scanner;
public class harmonikSeri {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.print("Harmonik serideki 'n' sayısını girin : ");
        int n = inp.nextInt();
        double result = 0;

        for (double i = 1; i <= n; i++) {
            result += (1 / i);
        }
        System.out.println("Sonuç => " + result);
    }
}
