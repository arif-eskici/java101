/*ÖDEV11:
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */

 package ödev11;

 import java.util.Scanner;

 public class etkinlikOnerme {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak yapabilirsin...");
        } else if(heat >= 5 && heat <= 25){
            if(heat <= 15){
                System.out.println("Sinemaya gidebilirsin...");
            }
            if(heat >= 15){
                System.out.println("Pikniğe gidebilirsin...");
            }  
        } else {
            System.out.println("Yüzmeye gidebilirsin...");
        }
    }
 }

 