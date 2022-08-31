/*ÖDEV21:
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/

package ödev21;

import java.util.Scanner;

public class üsHesaplama {
    public static void main(String[] args) {

        int a, b, i; 
        double total = 1;

        Scanner scan = new Scanner (System.in);

        System.out.print("Üssü alınacak sayıyı girin : ");
        a = scan.nextInt();
        System.out.print("Üs olacak sayıyı girin : ");
        b = scan.nextInt();

        if (b > 0) {
            for (i = 1; i <= b; i++) {
                total *= a;
            }
        } else {
            for (i = -1; i >= b; i-- ) {
                total *= a;
            }
            total = 1 / total ;
        }
        

        System.out.println("(" + a + ") ^ (" + b + ") => " + total);
    }
}
