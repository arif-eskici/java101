/*
Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
(Asal sayı : sadece 1'e ve kendisine bölünebilen sayılardır.)
Senaryo:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
*/

package ödev30;

public class asal_sayi {
    public static void main(String[] args) {
      
        for (int number = 2; number <= 100; number++) {
            int counter = 0;

            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    counter++;
                }
            }
            
            if (counter == 1) {
                System.out.print(number + " / ");
            }
            
        }

    }
}
