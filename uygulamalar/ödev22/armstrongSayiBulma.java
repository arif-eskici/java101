/*Ödev22:
Java döngüler ile 3 basamaklı sayılardan armstrong sayı olanları bulan programı yazıyoruz.

Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.
Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) = 1 + 81 + 256 + 16 = 354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634
54748 = 5^5 + 4^5 + 7^5 + 4^5 + 8^5 = 3125 + 1024 + 16807 + 1024 + 32768 = 54748
*/

package ödev22;

public class armstrongSayiBulma {
    public static void main(String[] args) {
      
        for (int number = 100; number < 1000; number++) {
            int tempNumber = number;
            int stepValue, stepPow;
            int result = 0;
            int counter = 0;

            while (tempNumber != 0) {
                tempNumber /= 10;
                counter ++;
            }

            tempNumber = number;
            while (tempNumber != 0) {
                stepValue = tempNumber % 10;
                stepPow = 1;
                for (int i = 1; i <= counter; i++) {
                    stepPow *= stepValue;
                }
                result += stepPow;
                tempNumber /= 10;
            }

            if (result == number) {
                System.out.println(number + " sayıları Armstrong sayılarıdır.");
            }
        }
        
    }
}
