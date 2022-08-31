/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/

package ödev17;

import java.util.Scanner;
public class ortalama {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int k, i, toplam = 0, sum = 0, toplam2 = 0, sum2 = 0;

        System.out.print("Bir sayı giriniz: ");
        k = input.nextInt();
        if (k < 0) {
            System.out.println("Lütfen 0'dan büyük bir sayı girmeyi deneyin!!");
        }

/* soruda ve / veya ifadesi anlam karmaşası yarattığından her iki duruma göre de çözüm yapıldı */

        for (i = 1; i <= k; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                toplam ++;
                System.out.println("Her ikisine de bölünebilen sayı : " + i);
            }

            if ((i % 3 == 0) || (i % 4 == 0)) {
                sum2 += i;
                toplam2 ++;
                System.out.println("3'e veya 4'e bölünebilen sayı :" + i);
            }
        }        
        double ort = sum / toplam;
        double ort2 = sum2 / toplam2;
        
        System.out.println("0 ile " + k + " arasında hem 3'e hem de 4'e tam bölünen sayıların ortalaması => "+ sum+" / "+toplam+" = " + ort);
        System.out.println("0 ile " + k + " arasında 3'e veya 4'e tam bölünen sayıların ortalaması => "+sum2+" / "+toplam2+" = " + ort2);
    
    }
}
