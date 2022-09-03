/*
Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.Örnek:
1) N Sayısı : 16 => Çıktısı : 16 11 6 1 -4 1 6 11 16 

2) N Sayısı : 10 => Çıktısı : 10 5 0 5 10 

3) N Sayısı : 25 => Çıktısı : 25 20 15 10 5 0 5 10 15 20 25 

4) N Sayısı : 5 => Çıktısı : 5 0 5 
*/

package ödev33;
import java.util.Scanner;
public class metodOlusturma {

    static int minus (int n) {
        if (n <= 0) {
            return n;
        } else {
            System.out.print(n + "  ");
            return minus(n-5);
        }
    }

    static int plus (int n, int n1) {
        if (n > n1) {
            return n;
        } else {
            System.out.print(n + "  ");
            return plus(n+5, n1);
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        System.out.print("Bir sayı girin : ");
        int n = inp.nextInt();
        if (n < 0) {
            System.out.println("Sadece pozitif bir sayı girebilirsiniz!");
        } else {
           // minus(n);
            plus(minus (n), n);
        }
    }
}
