package Learn;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adi giriniz: ");
        username = input.nextLine();
        System.out.println("Parola giriniz: ");
        password = input.nextLine();

        if(username.equals("ahmet123")){
            if(password.equals("gs1905")){
                System.out.println("Giris basarili");
            }else{
                System.out.println("parola yanlis");
            }
        }else{
            System.out.println("Kullanici adi yanlis");
        }
        
    }
}
