package Learn;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        int heat;
        Scanner input = new Scanner(System.in);
        System.out.println("Sicakligi giriniz: ");
        heat = input.nextInt();
        
        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (heat <= 25) {
            if (heat  <= 15){
                System.out.println("Sinemaya gidebilirsiniz");
            }
            if (heat  >= 10){
                System.out.println("Piknige gidebilirsiniz");
            }
        } else{
                System.out.println("Yuzmeye gidebilirsiniz");
        }
    }


}
