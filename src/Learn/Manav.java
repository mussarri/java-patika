package Learn;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double elmaKg = 2.14, armutKg = 3.67, portakalKg = 1.11, muzKg = 0.95, kirazKg = 5;
        double toplam, elma, armut, portakal, muz, kiraz;
        System.out.println("Fiyatlar:");
        System.out.println("Elma: " + elmaKg);
        System.out.println("Arumt: " + armutKg);
        System.out.println("Portakal: " + portakalKg);
        System.out.println("Muz: " + muzKg);
        System.out.println("Kiraz: " + kirazKg);



        Scanner input = new Scanner(System.in);
        System.out.print("Elma miktari(kg): ");
        elma = input.nextDouble();
        System.out.print("Armut miktari(kg): ");
        armut = input.nextDouble();
        System.out.print("Portakal miktari(kg): ");
        portakal = input.nextDouble();
        System.out.print("Muz miktari(kg): ");
        muz = input.nextDouble();
        System.out.print("Kiraz miktari(kg): ");
        kiraz = input.nextDouble();
        toplam = elma*elmaKg + armut*armutKg + portakal*portakalKg+ muz*muzKg+ kiraz*kirazKg;

        System.out.print("Toplam Tutar: "+toplam+"TL");
        
    }
}
