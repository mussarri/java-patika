package Learn;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int startPrice = 10, mesafe;
        double perKm = 2.20, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi giriniz(km): ");
        mesafe = input.nextInt();
        total = (perKm * mesafe) + startPrice;
        total = total < 20 ? 20 : total;
        System.out.println("Toplam ucret: " + total);

    }

}
