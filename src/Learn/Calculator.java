package Learn;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a,b,islem;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayiyi giriniz: ");
        a = input.nextInt();
        System.out.print("Ikinci sayiyi giriniz: ");
        b = input.nextInt();
        System.out.println("Islemi Seciniz: ");
        System.out.println("1=Toplama\n2=Cikarma\n3=Carpma\n4=Bolme");
        islem = input.nextInt();

        if (islem == 1){
            System.out.println("Sonuc = " + (a+b));
        }else if(islem == 2){
            System.out.println("Sonuc = " + (a-b));
        }else if(islem == 3){
            System.out.println("Sonuc = " + (a*b));
        }else if(islem == 4){
            System.out.println("Sonuc = " + (a/b));
        }


    }
}
