package Learn;

import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("Dik ucgen hipotenus hesaplama ");
        System.out.print("Birinci kenar uzunlugu: ");
        a = input.nextInt();
        System.out.print("Ikinci kenar uzunlugu: ");
        b = input.nextInt();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenus " + c);
    }
}
