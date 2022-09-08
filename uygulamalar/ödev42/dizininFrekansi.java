/*ÖDEV42:
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
*/

package ödev42;
import java.util.Arrays;
public class dizininFrekansi {
    public static void main(String[] args) {
        
        int [] list = {10, 20, 20, 10, 10, 20, 5, 20, 30, 50, 30, 40};
        int [] list2 = new int [list.length];
        int repeat = 0;
        int visited = -1;

        System.out.println("Dizimiz => "+Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            repeat = 1;
            for (int j = i+1; j < list.length; j++) {
                if (list[i] == list [j]) {
                    list2 [j] = visited;
                    repeat++;
                }
            }
            if (list2 [i] != visited) {
                list2[i] = repeat;
            }
        }
       
        System.out.println("Tekrar sayıları : ");
        for(int i = 0; i < list.length; i++) {
            if (list2[i] != visited) {
                System.out.println(list[i]+ " sayısı " +list2[i]+ " kere tekrar etti.");
            }
        }
    }
}
