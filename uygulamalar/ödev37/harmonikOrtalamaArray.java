/*ÖDEV37:
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

Harmonik Seri Formülü : (1/1) + (1/2) + (1/3) + (1/4) + ...... (1 / n)
 */

package ödev37;
import java.util.Arrays;
public class harmonikOrtalamaArray {

    
    public static void main(String[] args) {

        int [] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        double sum = 0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double average = sum / list.length;
        System.out.println(Arrays.toString(list)+ " dizisinin aritmetik ortalaması => " +average);

        double harmonikSeri = 0;
        for (double j : list) { // for (double j = 1; j <= list.length; j++)
            harmonikSeri += (1 / j);
        }
        //System.out.println("harmanik seri sonucu : "+harmonikSeri);
        double harmonikOrtalama = list.length / harmonikSeri;
        System.out.println(Arrays.toString(list)+ " dizisinin harmonik ortalaması => " +harmonikOrtalama);

    }

}