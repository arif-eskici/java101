/*
Eğitim videosunda if-else ile yapılan hesap makinesini switch-case kullanarak yapınız.
*/

package ödev8;

import java.util.Scanner;

public class hesaplama {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int number1, number2, select;

        System.out.print("İlk sayıyı giriniz: ");
        number1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        number2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        select = input.nextInt();

        switch(select){
            case 1:
                System.out.println("Toplam : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma : " + (number1 * number2));
                break;
            case 4:
                switch (number2){
                    case 0:
                        System.out.println("Bir sayı 0'a bölünemez!");
                        break;
                    default:
                        System.out.println("Bölme : " + (number1 / number2));
                    break;
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız. Tekrar deneyiniz...");
        }

    }
    
}
