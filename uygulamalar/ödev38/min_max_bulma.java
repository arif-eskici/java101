/*ÖDEV38:
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

*/

package ödev38;

import java.util.Scanner;
import java.util.Arrays;
public class min_max_bulma {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int [] arr = {1, 3, 5, -8, -28, 56, 101, -104, 69};
        System.out.println("Dizimiz şu şekildedir : " + Arrays.toString(arr));
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1]; 

        System.out.print("Lütfen bir sayı girin : ");
        int number = input.nextInt();

        for (int i : arr) {
            if ( i < number) {
                min = i;
            }
            if (i > number) {
                max = i;
                 break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın değer : " +min);
        System.out.println("Girilen sayıdan büyük en yakın değer : " +max);
    }
}