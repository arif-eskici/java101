/*ÖDEV40:
Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazarak GitHub reposunu bizimle paylaşmalısın. Kolay gelsin.
*/

package ödev40;
import java.util.Arrays;
public class dizideTekrarEdenSayilar {

    static boolean isFind (int[]arr, int value) {
        for (int i :arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int [] list = {1, 2, 5, -8, 5, 2, 9, 15, 9, 57, 34, 96, -8, 57, 34, 105};
        int [] list2 = new int [list.length];
        int [] list3 = new int [list2.length];
        int start1 = 0;
        int start2 = 0;
        

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && (list[i] == list[j])) {
                    if (!isFind(list2, list[i])) {
                        list2[start1++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println("\nDizimizin ilk hali => "+Arrays.toString(list));
        System.out.println("\nDizide tekrar eden sayıların oluşturduğu yeni dizi => "+Arrays.toString(list2));
        
        System.out.print("\nTekrar eden sayılardan çift sayıların oluşturduğu cevabımız olan son dizi => [");
        for (int value : list2) {
            if ((value %2  == 0) && (value != 0)) {
                list3[start2++] = value;
                System.out.print(value+", ");
            }
        }
        System.out.print("]");
        System.out.println("\n");
      
    }
}
