package Learn;

import java.util.Scanner;

public class TekSayiToplam {
    public static void main(String[] args) {
        int x, toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayiyi giriniz: ");
        x = input.nextInt();
        if (x > 0){
            for (int i=0; i < x ;i++){
                if (i % 2 ==1 ){
                    toplam = toplam + i;
                }

            }
            System.out.println(x + " e kadar olan tek sayilarin toplami = " + toplam);
        }else{
            System.out.println("0 dan buyuk birsayi giriniz");
        }


    }
}
