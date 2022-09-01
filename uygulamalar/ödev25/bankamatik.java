/*ÖDEV25:
 Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.
*/

package ödev25;
import java.util.Scanner;
public class bankamatik {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        String userName, password;
        int right = 3;
        int balance = 5000;
        int select, price;

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = sc.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = sc.nextLine();

            if (userName.equals("arif") && password.equals("1234")) {
                System.out.println("Giriş başarılı. Bankamıza hoşgeldiniz!!");

                do {
                    System.out.println( "1- Para Yatırma\n"+
                                        "2- Para Çekme\n"+
                                        "3- Bakiye Sorgulama\n"+
                                        "4- Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
                    select = sc.nextInt();

                    switch (select) {
                        case 1 :
                            System.out.print("Yatırmak istediğiniz tutarı girin : ");
                            price = sc.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiye : " + balance);
                        break;

                        case 2 :
                            System.out.print("Çekmek istediğiniz tutarı girin : ");
                            price = sc.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= price;
                                System.out.println("Kalan bakiye : " + balance);
                            }
                        break;

                        case 3 :
                            System.out.println("Hesap bakiyeniz : " + balance);
                        break;
                    }

                } while (select != 4);

                System.out.println("İşlem tamamlandı. İyi günler dileriz...");
                break;
            
            } else {
                right--;
                System.out.println("Hatalı veri girdiniz! Lütfen tekrar deneyiniz...");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Banka ile iletişime geçiniz...");
                } else {
                    System.out.println("Kalan hakkınız : " + right);
                }
            }

        }
        
    }
}
