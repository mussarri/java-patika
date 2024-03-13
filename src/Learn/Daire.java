package Learn;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double pi = Math.PI, alan, cevre;
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz");
        r= input.nextInt();
        alan = r*r*pi;
        cevre = 2*pi*r;
        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);
    }
}
