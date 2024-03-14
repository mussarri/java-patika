package Learn;

import java.util.Scanner;

public class Kombinasyon {

    public static Integer faktoriyel(int x){
        int result=1;
        for (int i =1; i<= x; i++){
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        int a,b;
        double sonuc;

        Scanner input = new Scanner(System.in);
        System.out.println("n'ín r'li kombinasyonu icin");
        System.out.print("n = ");
        a = input.nextInt();
        System.out.print("r = ");
        b = input.nextInt();

        if (a >= b){
            sonuc = (double) faktoriyel(a) /(faktoriyel(b) * faktoriyel(a - b));
            System.out.print(sonuc);
        }else{
            System.out.print("n > r olmalidir.");
        }

    }
}
