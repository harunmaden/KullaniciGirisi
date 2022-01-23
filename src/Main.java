import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız");
        }
        else {
            System.out.println("Bilgileriniz yanlış !");
            System.out.println("Şifrenizi değiştirmek ister misiniz ? (Evet ise 1 Hayır ise 2'yi tuşlayın)");
            int yesno = inp.nextInt();
            if (yesno == 1) {
                    System.out.print("Lütfen Yeni Şifrenizi Yazınız : ");
                    Scanner input = new Scanner(System.in);
                    String yenisifre;
                    yenisifre = input.nextLine();
                     if (yenisifre.equals("java123")) {
                        System.out.println("Yeni Şifreniz Eskisiyle Aynı Olamaz");
                     } else {
                        System.out.println("Şifreniz Başarıyla Değiştirildi");
                    }
            }
            else if (yesno == 2) System.out.println("Şifreniz değiştirilmedi");
            else {
                System.out.println("Yanlış giriş yaptınız");
            }
        }
    }
}
