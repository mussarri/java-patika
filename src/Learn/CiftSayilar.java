package Learn;

import java.util.Scanner;

public class CiftSayilar {
    public static void main(String[] args) {
        int x;
        Scanner input =  new Scanner(System.in);
        System.out.println("Sayiyi giriniz: ");
        x = input.nextInt();
        for (int i = 0;i < x;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
