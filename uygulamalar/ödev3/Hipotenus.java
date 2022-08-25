/*
Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
*/

package ödev3;

import java.util.Scanner;
public class Hipotenus {
    public static void main(String[] args) {

        //değişkenler oluşturuldu
        int a,b;
        double c;

        //kullanıcıdan bilgiler alındı
        Scanner input = new Scanner (System.in);

        System.out.print("Üçgenin kısa kenarını giriniz: ");
        a = input.nextInt();

        System.out.print("Üçgenin uzun kenarını giriniz: ");
        b = input.nextInt();

        //hipotenüs için hesaplamalar yapıldı
        c = Math.sqrt((a*a)+(b*b));

        //kullanıcıya hipotenüs bilgisi verildi
        System.out.println("Üçgenin hipotenüs kenarı:" + c + " olarak hesaplanmıştır.");
    }
}
