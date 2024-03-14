package Learn;

import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {
        int a, b, result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("a uzeri b icin");
        System.out.print("a = ");
        a = input.nextInt();
        System.out.print("b = ");
        b = input.nextInt();
        for (int i=1;i<= b;i++){
            result = result * a;
        }
        System.out.println(result);


    }
}
