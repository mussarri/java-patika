package Learn;
import java.util.Scanner;
public class NotOrtalama {
    public static void main(String[] args) {
        int mat, fiz, kim, biy, tur, tar, cog;
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
        double ortalama = (mat + fiz + kim + biy + tur + tar + cog) /7.0;
        System.out.println("Ortalamaniz: " + ortalama);
    }
}
