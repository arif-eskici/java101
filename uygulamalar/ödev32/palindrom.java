/*ÖDEV32:
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */

package ödev32;

public class palindrom {

    static boolean isPalindrom (int number) {
        int temp = number, lastNumber, reverseNumber = 0;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10; 
        }

        if (number == reverseNumber) {
            System.out.println(number + " sayısı bir Palindrom sayıdır.");
            System.out.print("Sonuç : ");
            return true;
        } else {
            System.out.println(number + " sayısı bir Palindrom sayı değildir!!");
            System.out.print("Sonuç : ");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrom(4004));
    }
}
