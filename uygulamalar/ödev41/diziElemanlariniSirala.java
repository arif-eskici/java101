/*ÖDEV 41:
Javada, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız. Örnek;
Dizinin boyutu n : 6
Dizinin elemanlarını giriniz :
1. Elemanı : 1000221
2. Elemanı : 22
3. Elemanı : -1
4. Elemanı : 999
5. Elemanı : 0
6. Elemanı : 254
Sıralama : -1 0 22 254 999 1000221 
*/

package ödev41;
import java.util.Arrays;
import java.util.Scanner;
public class diziElemanlariniSirala {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Dizinin eleman sayısını girin : ");
        int n = input.nextInt();

        int [] list = new int [n];
        int start = 0;

        System.out.println("Dizinin elemanlarını girin : ");
        for (int i = 1; i <= n; i++) {
            System.out.print(i+". Elemanı : ");
            int eleman = input.nextInt();
            list[start++] = eleman;

        }
        Arrays.sort(list);
        System.out.println("\nDizinin sıralanmış şekli => " +Arrays.toString(list)+"\n");
        
    }
}
