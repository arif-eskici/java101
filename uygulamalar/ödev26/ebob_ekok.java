/*ÖDEV26:
Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
*/

package ödev26;
import java.util.Scanner;
public class ebob_ekok {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.print("ilk sayıyı girin : ");
        int n1 = inp.nextInt();

        System.out.print("İkinci sayıyı girin : ");
        int n2 = inp.nextInt();
        int ebob = 1, ekok = 1;

        if (n1 < n2) {
            ebob = n1;
            while (ebob >= 1) {
                if (n1 % ebob == 0 && n2 % ebob == 0) {

                    System.out.println("EBOB : " + ebob);
                    ekok = (n1*n2)/ebob;
                    System.out.println("EKOK : " + ekok);
                    break;
                }
                ebob--;
            }

        } else if (n1 == n2) {
            System.out.println("Sayılar eşit olduğundan dolayı EBOB : " + n1);
            ekok = (n1*n2)/ebob;
            System.out.println("EKOK : " + ekok);

        } else {
            ebob = n2;
            while (ebob >= 1) {
                if (n1 % ebob == 0 && n2 % ebob == 0) {

                    System.out.println("EBOB : " + ebob);
                    ekok = (n1*n2)/ebob;
                    System.out.println("EKOK : " + ekok);
                    break;
                }
                ebob--;

            }
        }
        
    }
}
