package ödev3;

import java.util.Scanner;
public class ucgenAlani {
    public static void main(String[] args) {
        
        int a,b,c;
        double cevre, alan, u;

        Scanner input = new Scanner (System.in);

        System.out.print("Üçgenin 1. kenarını giriniz: ");
        a = input.nextInt();

        System.out.print("Üçgenin 2. kenarını giriniz: ");
        b = input.nextInt();

        System.out.print("Üçgenin 3. kenarını giriniz: ");
        c = input.nextInt();

        u = (a+b+c) / 2;
        cevre = 2 * u;
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin alanı: " + alan + " olarak hesaplanmıştır.");
        System.out.println("Bonus olarak üçgenin çevresi de: "+ cevre + " :))");
    }
}
