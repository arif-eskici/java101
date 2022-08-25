/*ÖDEV5:
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360

*/


package ödev5;

import java.util.Scanner;
public class daireAlani {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int a, r;
        double alan, pi=3.14;

        System.out.print("Dairenin yarıçap değerini girin: ");
        r = inp.nextInt();

        System.out.print("Dairenin merkez açı değerini giriniz: ");
        a = inp.nextInt();

        alan = (pi * (r*r) * a) / 360;

        System.out.println("Hesaplanan alan değeri: " + alan );


    }
}
