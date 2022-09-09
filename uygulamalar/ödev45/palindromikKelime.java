/*ÖDEV45:
Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
Örnek : abba , asa , kavak, kayak

*/

package ödev45;

import java.util.Scanner;

public class palindromikKelime {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("İncelenmesini istediğiniz kelimeyi girin : ");
        String word = input.nextLine();
        System.out.println(isPalindrome(word));
    }

    static boolean isPalindrome (String str) {
        
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {

                System.out.println("'"+str+"' kelimesi Palindromik bir kelime değildir!!");
                System.out.print("Sonuç => ");
                return false;  
            }

            i++;
            j--;
        }
        System.out.println("'"+str+ "' kelimesi Palindromik bir kelimedir!");
        System.out.print("Sonuç => ");
        return true;
    }

}
