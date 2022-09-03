/*
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
*/

package ödev21;
import java.util.Scanner;
public class recursive_Us_Hesaplama {

    static double exponential (int base, int expo) {

        if (base == 1 || expo == 0) {
            return 1;
        }
        if (expo < 0) {
            double result = 1;
            for (int i = -1; i >= expo; i--) {
                result *= base;
            }
            return (1/result);
        }

        return exponential(base, expo-1) * base;
        
    }

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Taban sayısını girin : ");
        int base = input.nextInt();

        System.out.print("Üs sayısını girin : ");
         int expo = input.nextInt();
      
        System.out.print("(" + base + ") ^ (" + expo + ") => " + exponential(base, expo));        
        
    }
}
