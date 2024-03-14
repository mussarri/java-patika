package Learn;

import java.util.Scanner;

public class NotKontrol {
    public static void main(String[] args) {
        int mat, fiz, kim, biy, tur, tar, cog, toplam = 0, dersSayisi = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Not ortalamasi hesaplama");
        System.out.println("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.println("Fizik notunuz: ");
        fiz = input.nextInt();
        System.out.println("Kimya notunuz: ");
        kim = input.nextInt();
        System.out.println("Biyoloji notunuz: ");
        biy = input.nextInt();
        System.out.println("Turkce notunuz: ");
        tur = input.nextInt();
        System.out.println("Tarih notunuz: ");
        tar = input.nextInt();
        System.out.println("Cografya notunuz: ");
        cog = input.nextInt();

        if (mat >= 0 && mat <= 100){
            toplam = toplam + mat;
            dersSayisi++;
        }
        if (fiz >= 0 && fiz <= 100){
            toplam = toplam + fiz;
            dersSayisi++;
        }
        if (kim >= 0 && kim <= 100){
            toplam = toplam + kim;
            dersSayisi++;
        }
        if (biy >= 0 && biy <= 100){
            toplam = toplam + biy;
            dersSayisi++;
        }
        if (tur >= 0 && tur <= 100){
            toplam = toplam + tur;
            dersSayisi++;
        }
        if (tar >= 0 && tar <= 100){
            toplam = toplam + tar;
            dersSayisi++;
        }
        if (cog >= 0 && cog <= 100){
            toplam = toplam + cog;
            dersSayisi++;
        }

        double ortalama = toplam / dersSayisi;
        if(ortalama > 55){
            System.out.println("Sinifi gectiniz.");
        } else {
            System.out.println("Sinifi gecemediniz.");
        }
        System.out.println("Ortalamaniz: " + ortalama);
    }
}
