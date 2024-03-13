package Learn;
import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        int price;
        double kdvRate = 0.18, priceWithKdv, kdv;
        Scanner input  = new Scanner(System.in);
        System.out.println("KDV hesaplama programina hosgeldiniz.");
        System.out.println("Fiyati giriniz: ");
        price = input.nextInt();
        kdv = price * kdvRate;
        priceWithKdv = price + kdv;
        System.out.println("KDV'li fiyat: " + priceWithKdv);
        System.out.println("KDV: " + kdv);
    }
}
