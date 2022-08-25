/*ÖDEV9:
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/

package ödev9;

import java.util.Scanner;

import javax.swing.GroupLayout.Alignment;
public class login {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String userName, password, newPassword, answer;

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if((userName.equals("hagi_arif") && (password.equals("java101")))){
            System.out.println("Giriş Başarılı...");
        } else {
            System.out.println("Kullanıcı adı veya şifre hatalı!!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?\nevet için 'E', hayır için 'H' tuşuna basınız. ");
            answer = input.nextLine();

            switch (answer){
                case "h":
                    System.out.println("Şifre sıfırlanmadı. Giriş yapmak için sayfayı yeniden yükleyiniz...");
                    break;
                case "e":
                    System.out.print("Yeni şifrenizi aralarda boşluk olmayacak şekilde giriniz: ");
                    newPassword = input.nextLine();

                    if(!newPassword.equals(password)){
                        password = newPassword;
                        System.out.println("Şifre başarıyla oluşturuldu.\nYeni şifreniz: "+ password);
                    } else {
                        System.out.println("Şifre oluşturulamadı. Lüften farklı bir şifre giriniz.");
                        newPassword = input.nextLine();
                    }
                break;
                default:
                    System.out.println("Hatalı giriş yaptınız!!");
            }
        }
    }
    
}
