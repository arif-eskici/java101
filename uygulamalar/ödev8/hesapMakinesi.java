/*
Java ile kullanıcının seçtiği işlemleri yapan hesap makinesi yapıyoruz.

Hesap makinesinin fonksiyonları :
1- Toplama İşlemi
2- Çıkarma İşlemi
3- Çarpma İşlemi
4- Bölme işlemi
5- Üslü Sayı Hesaplama
6- Faktoriyel Hesaplama
7- Mod Alma
8- Dikdörtgen Alan ve Çevre Hesabı
*/

package ödev8;

import java.util.Scanner;

public class hesapMakinesi {

    static void plus() {
        Scanner inp = new Scanner (System.in);

        System.out.print("ilk sayıyı girin : ");
        int a = inp.nextInt();

        System.out.print("İkinci sayıyı girin : ");
        int b = inp.nextInt();

        int result = a + b;
        System.out.println("Toplama işlemi => "+a+" + "+b+" = "+result);
    }

    static void minus() {
        Scanner inp = new Scanner (System.in);

        System.out.print("ilk sayıyı girin : ");
        int a = inp.nextInt();

        System.out.print("İkinci sayıyı girin : ");
        int b = inp.nextInt();

        int result = a - b;
        System.out.println("Çıkarma işlemi => "+a+" - "+b+" = "+result);
    }

    static void times() {
        Scanner inp = new Scanner (System.in);

        System.out.print("ilk sayıyı girin : ");
        int a = inp.nextInt();

        System.out.print("İkinci sayıyı girin : ");
        int b = inp.nextInt();

        int result = a * b;
        System.out.println("Çarpma işlemi => "+a+" * "+b+" = "+result);
    }

    static void divided() {
        Scanner inp = new Scanner (System.in);

        System.out.print("ilk sayıyı girin : ");
        int a = inp.nextInt();

        System.out.print("İkinci sayıyı girin : ");
        int b = inp.nextInt();

        if (b == 0) {
            System.out.println("Bölen sayısı '0' olamaz. Lütfen tekrar deneyin...");
        } else {
            int result = a / b;
            System.out.println("Bölme işlemi => "+a+" / "+b+" = "+result);
        } 
    }

    static void pow() {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Taban sayısını girin : ");
        int base = scan.nextInt();

        System.out.print("Üs değerini girin : ");
        int exponent = scan.nextInt();
        
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println("Üs alma sonucu => "+base+" ^ "+exponent+" = "+result);
    }

    static void factorial () {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Faktoriyel sayısını girin : ");
        int a = scan.nextInt();

        int result = 1;
        System.out.print(a+"! = ");
        for (int i = 1; i <= a; i++) {
            System.out.print(i+" * ");
            result *= i;
            
        }
        System.out.println("");
        System.out.println("Faktoriyel sonucu => "+result);
    }

    static void mod () {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("İlk sayıyı girin : ");
        int a = scan.nextInt();

        System.out.print("İkinci sayıyı girin : ");
        int b = scan.nextInt();

        int result = a % b;
        System.out.println(a+" % "+b+" = "+result);
    }

    static void rectangle () {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Dikdörtgenin uzun kenarını girin : ");
        int a = scan.nextInt();

        System.out.print("Dikdörtgenin kısa kenarını girin : ");
        int b = scan.nextInt();

        int area = a * b;
        int environment = 2 * (a + b);

        System.out.println("Dikdörtgenin alanı : "+area);
        System.out.println("Dikdörtgenin çevresi : "+environment);

    }


    public static void main(String[] args) {
        Scanner inp = new Scanner (System.in);

        String menü =   "1- Toplama İşlemi\n"+
                        "2- Çıkarma İşlemi\n"+
                        "3- Çarpma İşlemi\n"+
                        "4- Bölme İşlemi\n"+
                        "5- Üslü Sayı Hesaplama\n"+
                        "6- Faktöriyel Hesaplama\n"+
                        "7- Mod Alma\n"+
                        "8- Dikdörtgenin Alan ve Çevre Hesabı\n"+
                        "0 - Çıkış Yap";

        System.out.println(menü);

        while (true) {
            System.out.println("");
            System.out.print("Yapmak istediğiniz işlemi seçin : ");
            int select = inp.nextInt();
            if (select == 0) {
                System.out.println("Güle güle :)");
                break;
            }

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4 :
                    divided();
                    break;
                case 5:
                    pow();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                System.out.println("Geçersiz bir işlem yaptınız. Lütfen tekrar deneyin...");
            }
        } ;
        
    }
}
