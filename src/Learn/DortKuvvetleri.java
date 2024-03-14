package Learn;

import java.util.Scanner;

public class DortKuvvetleri {
    public static void main(String[] args) {
        int x ;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayiyi giriniz: ");
        x= input.nextInt();
        System.out.println("4'un kuvvetleri: ");
        for (int i=1;i<=x;i++){
            int result= 1;
            for (int j =0;j<i;j++){
                result = result * 4;
            }
            System.out.println(i + " = " + result);
        }
        System.out.println("\n5'un kuvvetleri: ");
        for (int i=1;i<=x;i++){
            int result= 1;
            for (int j =0;j<i;j++){
                result = result * 5;
            }
            System.out.println(i + " = " + result);
        }
    }
}
