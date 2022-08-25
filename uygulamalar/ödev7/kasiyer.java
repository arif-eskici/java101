/*
Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları:

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL

Örnek Çıktı:
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
*/

package ödev7;

import java.util.Scanner;

import java.util.Scanner;
public class kasiyer {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double totalPrice, armut, elma, domates, muz, patlican, armutPrice = 2.14, elmaPrice = 3.67, domatesPrice = 1.11, muzPrice = 0.95, patlicanPrice = 5.00;
        

        System.out.print("Aldığınız armutun miktarını (kg olarak) giriniz: ");
        armut = input.nextDouble();
        System.out.print("Aldığınız elma miktarını (kg olarak) giriniz: ");
        elma = input.nextDouble();
        System.out.print("Aldığınız domatesin miktarını (kg olarak) giriniz: ");
        domates = input.nextDouble();
        System.out.print("Aldığınız muzun miktarını (kg olarak) giriniz: ");
        muz = input.nextDouble();
        System.out.print("Aldığınız patlıcanın miktarını (kg olarak) giriniz: ");
        patlican = input.nextDouble();

        totalPrice = (armut*armutPrice)+(elma*elmaPrice)+(domates*domatesPrice)+(muz*muzPrice)+(patlican*patlicanPrice);

        System.out.println("Almış olduğunuz ürünler : "+armut+" kg Armut, "+elma+" kg Elma, "+domates+" kg Domates, "+muz+" kg Muz, "+patlican+" kg Patlican için; " );

        System.out.println("Ödemeniz gereken tutar : "+ totalPrice +" TL'dir.");


    }
}
