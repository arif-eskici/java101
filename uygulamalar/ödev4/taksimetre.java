/* ÖDEV4:
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

- Taksimetre KM başına 2.20 TL tutmaktadır.
- Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
- Taksimetre açılış ücreti 10 TL'dir.

 */

package ödev4;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        Scanner girdi = new Scanner (System.in);

        int km;
        double perKm = 2.20, total, startPrice = 10;

        System.out.print("Gitmek istediğiniz mesafeyi km cinsinden giriniz: ");
        km = girdi.nextInt();

        total = km * perKm;
        total += startPrice;
        total = (total < 20 ? 20: total);
        
        System.out.println(km + " km için ödeyeceğiniz tutar: "+ total + "TL'dir.");
    
    }
}
