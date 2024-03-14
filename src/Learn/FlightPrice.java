package Learn;

import java.util.Scanner;

public class FlightPrice {
    public static void main(String[] args) {
        int age, km, type;
        double total, perKm = 0.1, discount = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz :");
        km = input.nextInt();
        System.out.println("Yaşınızı giriniz :");
        age = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        type = input.nextInt();

        if ((type != 1) && (type != 2)){
            System.out.println("Lutfen yolculuk tipini 1 veya 2 giriniz.");
            System.out.println(type);
        }else{
            if (age < 12){
                discount = 0.5;
            } else if (age  <= 24) {
                discount = 0.2;
            } else if(age >= 65) {
                discount = 0.1;
            }
            total = (km*perKm) * (1 - discount);
            if (type == 2){
                total = total * 0.8;
            }
            System.out.println("Ucretiniz: " + total);
        }





    }
}
