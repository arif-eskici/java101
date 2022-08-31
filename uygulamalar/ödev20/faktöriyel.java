/*ÖDEV20:
Java ile faktöriyel hesaplayan program yazıyoruz.
n! = 1 * 2 * 3 * .......* n
*/

package ödev20;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class faktöriyel {
    public static void main(String[] args) {

        int number, i = 1, total = 1;

        Scanner scan = new Scanner (System.in);

        System.out.print("Faktöriyeli hesaplanacak sayıyı girin : ");
        number = scan.nextInt();

        while (i <= number) {
            total = total * i;
            i++;
        }
        System.out.println(number + "! => " + total);
    }
}
