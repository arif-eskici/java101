/*ÖDEV38:
Dizideki elemanlardan seçilen elemandan küçük en yakın sayıyı ve seçilen elemandan büyük en yakın sayıyı bulan program:
*/

package ödev38;
import java.util.Scanner;
import java.util.Arrays;
public class arrayElemanlarindanBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int [] arr = {1, 3, 5, -8, -28, 56, 101, -104, 69, 55, -49, 257};
        System.out.print("Dizimiz şu şekildedir : " + Arrays.toString(arr) + "\nLütfen dizideki sayılardan bir sayı girin : ");
        int number = input.nextInt();

        int sayi = linearSearch(arr, number);
        if(sayi != -1) {
            System.out.println("Girilen sayı : " + number);

            Arrays.sort(arr);
            int min = arr[0];
            int max = arr[arr.length-1]; 

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


        } else {
            System.out.println("Dizi elemanlarından başka sayı girilemez! Lütfen tekrar deneyin...");
        }

        
    }

    private static int linearSearch(int[] arr, int number) {

       for (int i = 0; i < arr.length; i++) {
        if (arr[i] == number) {
            return i;
        }
       }
        return -1;
    }
    
}
