/*ÖDEV15:
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

Çin Zodyağı nedir? 
4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?
Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.
Doğum Tarihi %12 = 0 ➜ Maymun
Doğum Tarihi %12 = 1 ➜ Horoz
Doğum Tarihi %12 = 2 ➜ Köpek
Doğum Tarihi %12 = 3 ➜ Domuz
Doğum Tarihi %12 = 4 ➜ Fare
Doğum Tarihi %12 = 5 ➜ Öküz
Doğum Tarihi %12 = 6 ➜ Kaplan
Doğum Tarihi %12 = 7 ➜ Tavşan
Doğum Tarihi %12 = 8 ➜ Ejderha
Doğum Tarihi %12 = 9 ➜ Yılan
Doğum Tarihi %12 = 10 ➜ At
Doğum Tarihi %12 = 11 ➜ Koyun
 */

package ödev15;

import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {
        
        int yil, kalan;
        String burc = "";

        Scanner input = new Scanner (System.in);

        System.out.print("Doğum yılınızı giriniz : ");
        yil = input.nextInt();

        kalan = yil % 12;

/*alternatif 1 : switch - case çözümü */

        switch (kalan) {
            case 0 :
                burc = "Maymun";
                break;
            case 1 :
                burc = "Horoz";
                break;
            case 2 :
                burc = "Köpek";
                break;
            case 3 :
                burc = "Domuz";
                break;
            case 4 :
                burc = "Fare";
                break;
            case 5 :
                burc = "Öküz";
                break;
            case 6 :
                burc = "Kaplan";
                break;
            case 7 :
                burc = "Tavşan";
                break;
            case 8 :
                burc = "Ejderha";
                break;
            case 9 :
                burc = "Yılan";
                break;
            case 10 :
                burc = "At";
                break;
            case 11 :
                burc = "Koyun";
                break;

        } 

/* alternatif 2 : if - else çözümü: 

        if (kalan == 0) {
            burc = "Maymun";
        } else if (kalan == 1) {
            burc = "Horoz";
        } else if (kalan == 2) {
            burc = "Köpek";
        } else if (kalan == 3) {
            burc = "Domuz";
        } else if (kalan == 4) {
            burc = "Fare";
        } else if (kalan == 5) {
            burc = "Öküz";
        } else if (kalan == 6) {
            burc = "Kaplan";
        } else if (kalan == 7) {
            burc = "Tavşan";
        } else if (kalan == 8) {
            burc = "Ejderha";
        } else if (kalan == 9) {
            burc = "Yılan";
        } else if (kalan == 10) {
            burc = "At";
        } else {
            burc = "Koyun";
        }
 */

            System.out.println("\nDoğum yılınız : " + yil);
            System.out.println("Çin Zodyağı Burcunuz : " + burc);

    }
}
