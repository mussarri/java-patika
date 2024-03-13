package Learn;

import java.util.Scanner;

public class VKIHesaplama {
    public static void main(String[] args) {
        int kilo;
        double boy, vki;

        Scanner input = new Scanner(System.in);
        System.out.print("Boyunuzu giriniz(m): ");
        boy = input.nextDouble();
        System.out.print("Kilonuzu giriniz(kg): ");
        kilo = input.nextInt();
        vki = kilo / (boy*boy);
        System.out.println("Boy: " + boy + "m");
        System.out.println("Kilo: " + kilo+ "kg") ;
        System.out.println("Beden kitle endeksi: " + vki);
    }
}
