package Learn;

import java.util.Scanner;

public class Harmonik {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
	     System.out.print("Sayı Giriniz :");
	     int number = input.nextInt();
	     double start = 0;
	     for (double i = 1; i <= number; i++) {
				start += (1/i);	
		 }
	     System.out.println(start);
	    
	
	}
}
