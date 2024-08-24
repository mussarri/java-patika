package Learn;

import java.util.Iterator;
import java.util.Scanner;

public class Armstrong {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	     System.out.print("Sayı Giriniz :");
	     int number = input.nextInt();
	     int copyNumber = number;
	     int basamak=0;
	     int result = 0;
	     while(copyNumber != 0) {
	    	 copyNumber /= 10;
	    	 basamak++;
	     }
	     copyNumber = number;
	     while(copyNumber != 0) {
	    	 int value = copyNumber % 10;
	    	 int carpim = 1;
	    	 for (int i = 0; i < basamak; i++) {
			    carpim *= value;
			 }
	    	 result += carpim;
	    	 copyNumber /= 10; 
	     }
	     
	     if (result == number) {
	            System.out.println(number + " sayısı bir Armstrong sayıdır.");
	     } else {
	            System.out.println(number + " sayısı bir Armstrong sayısı değildir.");
	     }


	
	     

	}
}
