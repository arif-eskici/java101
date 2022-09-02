/*ÖDEV31:
Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.

Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir. Örnek:
9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
*/

package ödev31;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.print("Fibonacci Serisinin eleman saysını girin: ");
        int number = inp.nextInt();
        int a = 0, b = 1, c;  // a + b = c
 
        for (int i = 1; i <= number; i++) {
            c = a + b;
           System.out.print(a + " + " + b + " = " + c);
            a = b;
            b = c;
            System.out.println();
        }
        
        int aa = 0, bb = 1, cc = 1;
        System.out.print("Fibonacci Serisi => ");
        for (int i=1; i<=number; i++){

            bb=aa;
            aa+=cc;

            System.out.print(aa+" ");
            cc=bb;

        }

        
    }
}
