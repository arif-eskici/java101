/*ÖDEV6:

Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

*/

package ödev6;

import java.util.Scanner;
public class vki {
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(System.in);

        double boy, kilo, vki;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();

        vki = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

        System.out.println(vki<25 ? "Kilonuz normal :)" : "Kionuz fazla, diyete başlayabilirsiniz...");
        

    }
    
}
