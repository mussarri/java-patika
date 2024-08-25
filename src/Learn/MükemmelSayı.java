package Learn;

import java.util.Scanner;

public class MükemmelSayı {
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.print("Sayiyi giriniz: ");
		 int num = input.nextInt();
		 int result = 0;
		 for(int i=1;i<num;i++) {
			 if(num%i ==0 ) {
 
				 result += i;
			 }
		 }
		 if(result == num) {
			 System.out.println(num + " sayisi mükemmel sayıdır.");
		 }else {
			 System.out.println(num + " sayisi mükemmel sayı değildir.");
		 }

	}
}
