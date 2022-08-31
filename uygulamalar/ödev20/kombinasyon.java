/*Ödev20:
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.
Kombinasyon formülü:
C(n,r) = n! / (r! * (n-r)!)
*/

package ödev20;

import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {

        int n, r, nFaktöriyel = 1, rFaktöriyel = 1, kFaktöriyel = 1;

        Scanner input = new Scanner (System.in);

        System.out.print("'n'yi yani kümenin eleman sayısını  girin : ");
        n = input.nextInt();

        System.out.print("'r'yi yani farklı eleman sayısını(kombinasyonu) girin : ");
        r = input.nextInt();

        

        if (r > n) {
            System.out.println("Kombinasyon sayısı eleman sayısından büyük olamaz! Lütfen 'n > r' olacak şekilde yeniden deneyin...");  
        } else {
            for (int i = 1; i <= n; i++) {
                nFaktöriyel *= i;
            }
    
            for (int j = 1; j <= r; j++) {
                rFaktöriyel *= j;
            }
    
            for (int k = (n-r); k >= 1; k--) {
                kFaktöriyel *= k;
            }
    
            double combination = nFaktöriyel / (rFaktöriyel * kFaktöriyel);
    
            System.out.println("C (" +n+ "," +r+ ") kombinasyon değeri => " +combination);
     
        }

        
    }
}
